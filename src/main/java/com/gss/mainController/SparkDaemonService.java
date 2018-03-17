package com.gss.mainController ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SparkDaemonService {
    private StreamingJob1 job1;
    private ParquetJob1   job2;

    private static SparkDaemonService instance;

    public static SparkDaemonService getInstance(){
        if (instance == null) {
            instance = new SparkDaemonService();
            instance.init();
        }
        return instance ;
    }

    @Autowired
    void init(){

        job1  = new StreamingJob1();
        job2 = new ParquetJob1();

        job1.start();
        job2.start();

    }

}
