import org.apache.log4j.Logger;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;


public class ParquetJob1 extends Thread {

    static Logger logger = Logger.getLogger(ParquetJob1.class.getName());

    public ParquetJob1() {
    }

    public void run() {
        logger.info("Spark (job 2) parquet reader started.");
        try {
            Thread.sleep(200 * 1000);
            sparkReader();
        } catch(Exception e) {
            logger.error("Warning: exception: "+e.getMessage());
            logger.error(e);
        }

    }

    private void sparkReader() throws Exception {
        logger.info("Spark (job 2) reading process started");


        SparkSession spark = SparkSession
                .builder()
                .appName("sparkApp")
                .config("spark.master", "yarn")
                .getOrCreate();

        // spark.read().load("/user/cloudera/parq").createOrReplaceTempView("tmp");
        Dataset<Row> data = spark.sql("select count(*) as mycount from tmptable");
        logger.info("**************** job2 ********************");
        logger.info("**************** job2 ********************");
        logger.info("**************** job2 ********************");
        logger.info("**************** job2 ********************");
        logger.info("**************** job2 ********************");
        Row[] dataRows = data.collect();
        for (Row row : dataRows) {
            System.out.println("Row : "+row);
            for (int i = 0; i < row.length(); i++) {
                System.out.println("Row Data : "+row.get(i));
            }
        }
        logger.info(data.  toString());
        logger.info("**************** job2 ********************");
        logger.info("**************** job2 ********************");
        logger.info("**************** job2 ********************");

        logger.info("Spark (job 2) reader process finished");

    }
}