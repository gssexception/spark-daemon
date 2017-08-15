import org.apache.log4j.Logger;
import java.util.concurrent.TimeUnit;


public class SparkDaemon {
    static Logger logger = Logger.getLogger(SparkDaemon.class.getName());
    private static org.apache.log4j.Logger log = Logger.getLogger(SparkDaemon.class);

    public static void main(String[] args) {

        try
        {
            daemonize();
        }
        catch (Throwable e)
        {

            System.err.println("Startup failed " );
            System.err.println(e);

            return;
        }

        SparkDaemonService spark = SparkDaemonService.getInstance();

        logger.info("Spark daemon started.");

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
                logger.info(e);
            }
        }
    }

    static private void daemonize() throws Exception
    {
        System.in.close();
        System.out.close();
    }

}