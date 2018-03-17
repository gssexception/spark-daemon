package com.gss.mainController;

import org.apache.log4j.Logger;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.streaming.StreamingQuery;
import org.apache.spark.sql.types.StructType;


public class StreamingJob1 extends Thread {
    static Logger logger = Logger.getLogger(StreamingJob1.class.getName());

    public StreamingJob1() {

    }

    public void run() {
        logger.info("Spark streaming process deployed");
        try {
            sparkStream();
        } catch(Exception e) {
            logger.error("Warning: exception: "+e.getMessage());
            logger.error(e);
        }

    }

    private void sparkStream() throws Exception {
        logger.info("Spark streaming process started");

        SparkSession sparkSession = SparkSession
                .builder()
                .appName("sparkApp")
                .config("spark.master", "yarn")
                .config("deploy-mode", "client")
                .config("num-executors","1")
                .config("spark.executor.memory", "1g")
                .getOrCreate();

        logger.info("Spark sparkSession executed");

        StructType fileSchema = sparkSession.read().parquet("/user/cloudera/parq").schema() ;
        Dataset df = sparkSession.readStream().schema(fileSchema).parquet("/user/cloudera/parq");

        df.createOrReplaceTempView("tmptable") ;

        Dataset aggDF = sparkSession.sql("select caseId from tmptable where fieldName = 'ActionClassification' and valueStr = '21' group by caseId");

        StreamingQuery query = aggDF.writeStream()
                .outputMode("complete")
                .format("console")
                .start() ;

        aggDF.writeStream()
                .queryName("aggregates")    // this query name will be the table name
                .outputMode("complete")
                .format("memory")
                .start();

        sparkSession.sql("select * from aggregates").show();

        query.awaitTermination();

        logger.info("Spark streaming process finished");

    }
}
