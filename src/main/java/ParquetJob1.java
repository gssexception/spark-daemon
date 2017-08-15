import org.apache.log4j.Logger;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;


public class ParquetJob1 extends Thread {

    SparkDaemonService instance;
    static Logger logger = Logger.getLogger(ParquetJob1.class.getName());

    public ParquetJob1() {
    }

    public void run() {
        logger.info("Spark parquet reader.");
        try {
            Thread.sleep(120 * 1000);
            sparkReader();
        } catch(Exception e) {
            logger.error("Warning: exception: "+e.getMessage());
            logger.error(e);
        }

    }

    private void sparkReader() throws Exception {
        logger.info("Spark reading process started");


        SparkSession spark = SparkSession
                .builder()
                .appName("sparkApp")
                .config("spark.master", "yarn")
                .getOrCreate();

        // spark.read().load("/user/cloudera/parq").createOrReplaceTempView("tmp");
        Dataset data = spark.sql("select count(*) from tmp limit 50");
        data.show(20);
        logger.info("Spark reader process finished");

    }
}