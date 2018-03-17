17/08/15 13:07:45 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "838ebf42-34b8-4a56-87f1-bb4a58ea648d",
  "runId" : "a83f29fe-9304-48f4-8e80-eccc88360428",
  "name" : null,
  "timestamp" : "2017-08-15T20:07:45.725Z",
  "numInputRows" : 0,
  "inputRowsPerSecond" : 0.0,
  "processedRowsPerSecond" : 0.0,
  "durationMs" : {
    "getOffset" : 2,
    "triggerExecution" : 2
  },
  "stateOperators" : [ ],
  "sources" : [ {
    "description" : "FileStreamSource[hdfs://quickstart.cloudera:8020/user/cloudera/parq]",
    "startOffset" : {
      "logOffset" : 0
    },
    "endOffset" : {
      "logOffset" : 0
    },
    "numInputRows" : 0,
    "inputRowsPerSecond" : 0.0,
    "processedRowsPerSecond" : 0.0
  } ],
  "sink" : {
    "description" : "org.apache.spark.sql.execution.streaming.ConsoleSink@d412a26"
  }
}
17/08/15 13:07:49 INFO com.gss.mainController.ParquetJob1: Spark (job 2) reading process started
17/08/15 13:07:49 WARN sql.SparkSession$Builder: Using an existing SparkSession; some configuration may not take effect.
17/08/15 13:07:49 INFO execution.SparkSqlParser: Parsing command: select count(*) as mycount from aggregates
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: [mycount: bigint]
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: **************** job2 ********************
17/08/15 13:07:50 INFO com.gss.mainController.ParquetJob1: Spark (job 2) reader process finished
17/08/15 13:07:55 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "c2c22295-a5d2-4e60-8721-75da0e695a09",
  "runId" : "f28b59df-7a7c-4b7c-a136-078aebbaf2d0",
  "name" : "aggregates",
  "timestamp" : "2017-08-15T20:07:55.721Z",
  "numInputRows" : 0,
  "inputRowsPerSecond" : 0.0,
  "processedRowsPerSecond" : 0.0,
  "durationMs" : {
    "getOffset" : 2,
    "triggerExecution" : 2
  },
  "stateOperators" : [ ],
  "sources" : [ {
    "description" : "FileStreamSource[hdfs://quickstart.cloudera:8020/user/cloudera/parq]",
    "startOffset" : {
      "logOffset" : 0
    },
    "endOffset" : {
      "logOffset" : 0
    },
    "numInputRows" : 0,
    "inputRowsPerSecond" : 0.0,
    "processedRowsPerSecond" : 0.0
  } ],
  "sink" : {
    "description" : "MemorySink"
  }
}
