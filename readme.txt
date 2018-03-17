# spark2-submit --class com.gss.mainController.SparkDaemon --master yarn --deploy-mode client  --num-executors 10 --executor-memory 1G --executor-cores 1 --driver-memory 1G target/spark-daemon-1.0-SNAPSHOT-jar-with-dependencies.jar


[cloudera@quickstart spark-daemon]$ spark2-submit --class com.gss.mainController.SparkDaemon --master yarn --deploy-mode client  --num-executors 10 --executor-memory 1G --executor-cores 1 --driver-memory 1G target/spark-daemon-1.0-SNAPSHOT-jar-with-dependencies.jar
17/08/15 12:47:40 INFO com.gss.mainController.StreamingJob1: Spark streaming process deployed
17/08/15 12:47:40 INFO com.gss.mainController.ParquetJob1: Spark (job 2) parquet reader started.
17/08/15 12:47:40 INFO com.gss.mainController.SparkDaemon: Spark daemon started.
17/08/15 12:47:40 INFO com.gss.mainController.StreamingJob1: Spark streaming process started
17/08/15 12:47:40 INFO spark.SparkContext: Running Spark version 2.1.0.cloudera1
17/08/15 12:47:41 WARN util.Utils: Your hostname, quickstart.cloudera resolves to a loopback address: 127.0.0.1; using 192.168.1.116 instead (on interface eth3)
17/08/15 12:47:41 WARN util.Utils: Set SPARK_LOCAL_IP if you need to bind to another address
17/08/15 12:47:41 INFO spark.SecurityManager: Changing view acls to: cloudera
17/08/15 12:47:41 INFO spark.SecurityManager: Changing modify acls to: cloudera
17/08/15 12:47:41 INFO spark.SecurityManager: Changing view acls groups to:
17/08/15 12:47:41 INFO spark.SecurityManager: Changing modify acls groups to:
17/08/15 12:47:41 INFO spark.SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(cloudera); groups with view permissions: Set(); users  with modify permissions: Set(cloudera); groups with modify permissions: Set()
17/08/15 12:47:41 INFO util.Utils: Successfully started service 'sparkDriver' on port 59529.
17/08/15 12:47:41 INFO spark.SparkEnv: Registering MapOutputTracker
17/08/15 12:47:41 INFO spark.SparkEnv: Registering BlockManagerMaster
17/08/15 12:47:41 INFO storage.BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
17/08/15 12:47:41 INFO storage.BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
17/08/15 12:47:41 INFO storage.DiskBlockManager: Created local directory at /tmp/blockmgr-778ee9c0-2154-4340-a0cc-ae0a089aee6b
17/08/15 12:47:42 INFO memory.MemoryStore: MemoryStore started with capacity 366.3 MB
17/08/15 12:47:42 INFO spark.SparkEnv: Registering OutputCommitCoordinator
17/08/15 12:47:42 INFO util.log: Logging initialized @2903ms
17/08/15 12:47:42 INFO server.Server: jetty-9.2.z-SNAPSHOT
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@fe87727{/jobs,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@40df572f{/jobs/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@62f1be3f{/jobs/job,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@618c2fb8{/jobs/job/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@2d113de1{/stages,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@17cd6143{/stages/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@782225c3{/stages/stage,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@78d32490{/stages/stage/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@5c09f05e{/stages/pool,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@20b255e5{/stages/pool/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@4957700d{/storage,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@28c12a13{/storage/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@3bd9a455{/storage/rdd,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@9f6d3b6{/storage/rdd/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@7bd30d9d{/environment,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@5a632146{/environment/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@2ceedd53{/executors,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@13bad01b{/executors/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@70e68814{/executors/threadDump,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@33ccee5f{/executors/threadDump/json,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@6992b930{/static,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@2c6d9611{/,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@680f1da0{/api,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@3c65a8e8{/jobs/job/kill,null,AVAILABLE}
17/08/15 12:47:42 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@4042cd6d{/stages/stage/kill,null,AVAILABLE}
17/08/15 12:47:42 INFO server.ServerConnector: Started ServerConnector@2b5c74f8{HTTP/1.1}{0.0.0.0:4040}
17/08/15 12:47:42 INFO server.Server: Started @3112ms
17/08/15 12:47:42 INFO util.Utils: Successfully started service 'SparkUI' on port 4040.
17/08/15 12:47:42 INFO ui.SparkUI: Bound SparkUI to 0.0.0.0, and started at http://192.168.1.116:4040
17/08/15 12:47:42 INFO spark.SparkContext: Added JAR file:/home/cloudera/spark/spark-daemon/target/spark-daemon-1.0-SNAPSHOT-jar-with-dependencies.jar at spark://192.168.1.116:59529/jars/spark-daemon-1.0-SNAPSHOT-jar-with-dependencies.jar with timestamp 1502826462646
17/08/15 12:47:42 INFO util.Utils: Using initial executors = 10, max of spark.dynamicAllocation.initialExecutors, spark.dynamicAllocation.minExecutors and spark.executor.instances
17/08/15 12:47:43 INFO client.RMProxy: Connecting to ResourceManager at quickstart.cloudera/127.0.0.1:8032
17/08/15 12:47:44 INFO yarn.Client: Requesting a new application from cluster with 1 NodeManagers
17/08/15 12:47:44 INFO yarn.Client: Verifying our application has not requested more than the maximum memory capability of the cluster (10240 MB per container)
17/08/15 12:47:44 INFO yarn.Client: Will allocate AM container, with 896 MB memory including 384 MB overhead
17/08/15 12:47:44 INFO yarn.Client: Setting up container launch context for our AM
17/08/15 12:47:44 INFO yarn.Client: Setting up the launch environment for our AM container
17/08/15 12:47:44 INFO yarn.Client: Preparing resources for our AM container
17/08/15 12:47:45 INFO yarn.Client: Uploading resource file:/tmp/spark-69adf009-79ee-4e8e-bf82-94ff0c308943/__spark_conf__1143296185726106440.zip -> hdfs://quickstart.cloudera:8020/user/cloudera/.sparkStaging/application_1502814017604_0009/__spark_conf__.zip
17/08/15 12:47:46 INFO spark.SecurityManager: Changing view acls to: cloudera
17/08/15 12:47:46 INFO spark.SecurityManager: Changing modify acls to: cloudera
17/08/15 12:47:46 INFO spark.SecurityManager: Changing view acls groups to:
17/08/15 12:47:46 INFO spark.SecurityManager: Changing modify acls groups to:
17/08/15 12:47:46 INFO spark.SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(cloudera); groups with view permissions: Set(); users  with modify permissions: Set(cloudera); groups with modify permissions: Set()
17/08/15 12:47:46 INFO yarn.Client: Submitting application application_1502814017604_0009 to ResourceManager
17/08/15 12:47:46 INFO impl.YarnClientImpl: Submitted application application_1502814017604_0009
17/08/15 12:47:46 INFO cluster.SchedulerExtensionServices: Starting Yarn extension services with app application_1502814017604_0009 and attemptId None
17/08/15 12:47:47 INFO yarn.Client: Application report for application_1502814017604_0009 (state: ACCEPTED)
17/08/15 12:47:47 INFO yarn.Client:
         client token: N/A
         diagnostics: N/A
         ApplicationMaster host: N/A
         ApplicationMaster RPC port: -1
         queue: root.users.cloudera
         start time: 1502826466181
         final status: UNDEFINED
         tracking URL: http://quickstart.cloudera:8088/proxy/application_1502814017604_0009/
         user: cloudera
17/08/15 12:47:48 INFO yarn.Client: Application report for application_1502814017604_0009 (state: ACCEPTED)
17/08/15 12:47:49 INFO yarn.Client: Application report for application_1502814017604_0009 (state: ACCEPTED)
17/08/15 12:47:49 INFO cluster.YarnSchedulerBackend$YarnSchedulerEndpoint: ApplicationMaster registered as NettyRpcEndpointRef(null)
17/08/15 12:47:49 INFO cluster.YarnClientSchedulerBackend: Add WebUI Filter. org.apache.hadoop.yarn.server.webproxy.amfilter.AmIpFilter, Map(PROXY_HOSTS -> quickstart.cloudera, PROXY_URI_BASES -> http://quickstart.cloudera:8088/proxy/application_1502814017604_0009), /proxy/application_1502814017604_0009
17/08/15 12:47:49 INFO ui.JettyUtils: Adding filter: org.apache.hadoop.yarn.server.webproxy.amfilter.AmIpFilter
17/08/15 12:47:50 INFO yarn.Client: Application report for application_1502814017604_0009 (state: RUNNING)
17/08/15 12:47:50 INFO yarn.Client:
         client token: N/A
         diagnostics: N/A
         ApplicationMaster host: 192.168.1.116
         ApplicationMaster RPC port: 0
         queue: root.users.cloudera
         start time: 1502826466181
         final status: UNDEFINED
         tracking URL: http://quickstart.cloudera:8088/proxy/application_1502814017604_0009/
         user: cloudera
17/08/15 12:47:50 INFO cluster.YarnClientSchedulerBackend: Application application_1502814017604_0009 has started running.
17/08/15 12:47:50 INFO util.Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 60495.
17/08/15 12:47:50 INFO netty.NettyBlockTransferService: Server created on 192.168.1.116:60495
17/08/15 12:47:50 INFO storage.BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
17/08/15 12:47:50 INFO storage.BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 192.168.1.116, 60495, None)
17/08/15 12:47:50 INFO storage.BlockManagerMasterEndpoint: Registering block manager 192.168.1.116:60495 with 366.3 MB RAM, BlockManagerId(driver, 192.168.1.116, 60495, None)
17/08/15 12:47:50 INFO storage.BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 192.168.1.116, 60495, None)
17/08/15 12:47:50 INFO storage.BlockManager: external shuffle service port = 7337
17/08/15 12:47:50 INFO storage.BlockManager: Initialized BlockManager: BlockManagerId(driver, 192.168.1.116, 60495, None)
17/08/15 12:47:50 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@28a1518f{/metrics/json,null,AVAILABLE}
17/08/15 12:47:50 INFO scheduler.EventLoggingListener: Logging events to hdfs://quickstart.cloudera:8020/user/spark/spark2ApplicationHistory/application_1502814017604_0009
17/08/15 12:47:50 INFO util.Utils: Using initial executors = 10, max of spark.dynamicAllocation.initialExecutors, spark.dynamicAllocation.minExecutors and spark.executor.instances
17/08/15 12:47:57 INFO cluster.YarnSchedulerBackend$YarnDriverEndpoint: Registered executor NettyRpcEndpointRef(null) (192.168.1.116:35760) with ID 2
17/08/15 12:47:57 INFO spark.ExecutorAllocationManager: New executor 2 has registered (new total is 1)
17/08/15 12:47:57 INFO storage.BlockManagerMasterEndpoint: Registering block manager quickstart.cloudera:59510 with 366.3 MB RAM, BlockManagerId(2, quickstart.cloudera, 59510, None)
17/08/15 12:47:57 INFO cluster.YarnSchedulerBackend$YarnDriverEndpoint: Registered executor NettyRpcEndpointRef(null) (192.168.1.116:35763) with ID 4
17/08/15 12:47:57 INFO spark.ExecutorAllocationManager: New executor 4 has registered (new total is 2)
17/08/15 12:47:57 INFO cluster.YarnSchedulerBackend$YarnDriverEndpoint: Registered executor NettyRpcEndpointRef(null) (192.168.1.116:35764) with ID 1
17/08/15 12:47:57 INFO spark.ExecutorAllocationManager: New executor 1 has registered (new total is 3)
17/08/15 12:47:57 INFO storage.BlockManagerMasterEndpoint: Registering block manager quickstart.cloudera:52065 with 366.3 MB RAM, BlockManagerId(4, quickstart.cloudera, 52065, None)
17/08/15 12:47:57 INFO storage.BlockManagerMasterEndpoint: Registering block manager quickstart.cloudera:54741 with 366.3 MB RAM, BlockManagerId(1, quickstart.cloudera, 54741, None)
17/08/15 12:47:58 INFO cluster.YarnSchedulerBackend$YarnDriverEndpoint: Registered executor NettyRpcEndpointRef(null) (192.168.1.116:35767) with ID 3
17/08/15 12:47:58 INFO spark.ExecutorAllocationManager: New executor 3 has registered (new total is 4)
17/08/15 12:47:58 INFO storage.BlockManagerMasterEndpoint: Registering block manager quickstart.cloudera:34617 with 366.3 MB RAM, BlockManagerId(3, quickstart.cloudera, 34617, None)
17/08/15 12:47:58 INFO cluster.YarnSchedulerBackend$YarnDriverEndpoint: Registered executor NettyRpcEndpointRef(null) (192.168.1.116:35774) with ID 6
17/08/15 12:47:58 INFO spark.ExecutorAllocationManager: New executor 6 has registered (new total is 5)
17/08/15 12:47:59 INFO storage.BlockManagerMasterEndpoint: Registering block manager quickstart.cloudera:50242 with 366.3 MB RAM, BlockManagerId(6, quickstart.cloudera, 50242, None)
17/08/15 12:47:59 INFO cluster.YarnSchedulerBackend$YarnDriverEndpoint: Registered executor NettyRpcEndpointRef(null) (192.168.1.116:35776) with ID 5
17/08/15 12:47:59 INFO spark.ExecutorAllocationManager: New executor 5 has registered (new total is 6)
17/08/15 12:47:59 INFO storage.BlockManagerMasterEndpoint: Registering block manager quickstart.cloudera:44013 with 366.3 MB RAM, BlockManagerId(5, quickstart.cloudera, 44013, None)
17/08/15 12:48:10 INFO com.gss.mainController.ParquetJob1: Spark (job 2) reading process started
17/08/15 12:48:12 INFO cluster.YarnClientSchedulerBackend: SchedulerBackend is ready for scheduling beginning after waiting maxRegisteredResourcesWaitingTime: 30000(ms)
17/08/15 12:48:13 INFO internal.SharedState: spark.sql.warehouse.dir is not set, but hive.metastore.warehouse.dir is set. Setting spark.sql.warehouse.dir to the value of hive.metastore.warehouse.dir ('/user/hive/warehouse').
17/08/15 12:48:13 INFO internal.SharedState: Warehouse path is '/user/hive/warehouse'.
17/08/15 12:48:13 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@2232c0d6{/SQL,null,AVAILABLE}
17/08/15 12:48:13 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@44130bde{/SQL/json,null,AVAILABLE}
17/08/15 12:48:13 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@342863ac{/SQL/execution,null,AVAILABLE}
17/08/15 12:48:13 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@61ff4a4{/SQL/execution/json,null,AVAILABLE}
17/08/15 12:48:13 INFO handler.ContextHandler: Started o.s.j.s.ServletContextHandler@8ed58e1{/static/sql,null,AVAILABLE}
17/08/15 12:48:13 INFO hive.HiveUtils: Initializing HiveMetastoreConnection version 1.1.0 using file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/stringtemplate-3.2.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims-common.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/antlr-2.7.7.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-configuration-1.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-serde.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/derby-10.11.1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-jdbc-1.1.0-cdh5.10.0-standalone.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/guava-14.0.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/regexp-1.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/findbugs-annotations-1.3.9-1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-beeline-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/joda-time-1.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/ST4-4.0.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-compiler-2.7.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-metastore-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/xz-1.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/httpcore-4.2.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jackson-xc-1.9.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/accumulo-start-1.6.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/libfb303-0.9.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-hbase-handler.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-accumulo-handler.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jetty-all-server-7.6.0.v20120127.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-metastore.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-testutils-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/geronimo-jta_1.1_spec-1.1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-lang-2.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/calcite-core-1.0.0-incubating.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/stax-api-1.0.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jersey-servlet-1.14.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-jdbc-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jsr305-3.0.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hbase-common.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jcommander-1.32.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-cli-1.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/accumulo-fate-1.6.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hbase-hadoop2-compat.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-compress-1.4.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/groovy-all-2.4.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims-scheduler.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-pool-1.5.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-common.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-el-1.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jasper-runtime-5.5.23.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-vfs2-2.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/httpclient-4.2.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/curator-client-2.6.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-contrib-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/bonecp-0.8.0.RELEASE.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/calcite-linq4j-1.0.0-incubating.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/accumulo-core-1.6.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jackson-jaxrs-1.9.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-beeline.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/metrics-jvm-3.0.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/zookeeper.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jackson-databind-2.2.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jline-2.12.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/calcite-avatica-1.0.0-incubating.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/datanucleus-rdbms-3.2.9.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-service-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/servlet-api-2.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/janino-2.7.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-hwi-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jackson-annotations-2.2.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-io-2.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jasper-compiler-5.5.23.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hbase-protocol.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hbase-client.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-math-2.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/asm-tree-3.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/oro-2.0.8.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-service.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/metrics-core-3.0.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/snappy-java-1.0.4.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims-common-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-codec-1.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/parquet-hadoop-bundle.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/asm-commons-3.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/eigenbase-properties-1.1.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-serde-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/junit-4.11.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-hbase-handler-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-ant.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/logredactor-1.0.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/paranamer-2.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jdo-api-3.0.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/asm-3.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-logging-1.1.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-jdbc.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-cli-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/velocity-1.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/libthrift-0.9.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-common-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/geronimo-jaspic_1.0_spec-1.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/ant-launcher-1.9.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/super-csv-2.2.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-dbcp-1.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims-0.23-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/pentaho-aggdesigner-algorithm-5.1.5-jhyde.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/ant-1.9.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hbase-annotations.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jsp-api-2.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/avro.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/antlr-runtime-3.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jta-1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/curator-framework-2.6.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jetty-all-7.6.0.v20120127.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/log4j-1.2.16.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/geronimo-annotation_1.0_spec-1.1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jpam-1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-exec.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/mail-1.4.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hbase-server.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims-scheduler-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jamon-runtime-2.3.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-exec-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-cli.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-contrib.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/accumulo-trace-1.6.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/datanucleus-api-jdo-3.2.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/gson-2.2.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/ivy-2.0.0-rc2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jackson-core-2.2.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/htrace-core.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/datanucleus-core-3.2.10.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-ant-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-lang3-3.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/maven-scm-provider-svnexe-1.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/curator-recipes-2.6.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-hwi.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hbase-hadoop-compat.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hamcrest-core-1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-beanutils-core-1.8.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-collections-3.2.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-testutils.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/opencsv-2.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-beanutils-1.9.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/metrics-json-3.0.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/plexus-utils-1.5.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/jersey-server-1.14.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/maven-scm-api-1.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/apache-log4j-extras-1.2.17.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/high-scale-lib-1.1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/tempus-fugit-1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/maven-scm-provider-svn-commons-1.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/activation-1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-digester-1.8.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/commons-httpclient-3.0.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-shims-0.23.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-accumulo-handler-1.1.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/../hive/lib/hive-jdbc-standalone.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-annotations-2.2.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-compress.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/leveldbjni-all-1.8.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-configuration-1.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-s3-1.10.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/apacheds-i18n-2.0.0-M15.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/api-util-1.0.0-M20.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-codec.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/guava.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-httpclient-3.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-core.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xml-apis-1.3.04.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-hdfs.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/htrace-core4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/stax-api.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-digester.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xz-1.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jsr305.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-api.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/snappy-java.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/httpcore-4.2.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xz.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-logging.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-common-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-server-common.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/curator-recipes.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/httpcore.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-auth-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-app.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-lang-2.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/api-asn1-api-1.0.0-M20.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-net.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jsr305-3.0.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-sts.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/paranamer.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-sts-1.10.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xmlenc.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-databind.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-beanutils.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-cli-1.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/apacheds-kerberos-codec.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-beanutils-core.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/httpclient.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-compress-1.4.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/htrace-core4-4.0.1-incubating.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-client.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-api-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/gson.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-databind-2.2.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/httpclient-4.2.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-io.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/api-asn1-api.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/guava-11.0.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jersey-core.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-annotations.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-s3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-auth.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-cli.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/zookeeper.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-jobclient.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-common.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/protobuf-java-2.5.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/servlet-api-2.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/slf4j-api.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/curator-recipes-2.7.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-io-2.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-shuffle.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jaxb-api.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/leveldbjni-all.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/curator-framework-2.7.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jersey-client-1.9.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/slf4j-log4j12.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-shuffle-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/snappy-java-1.0.4.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-codec-1.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/log4j.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-annotations-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-kms-1.10.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-net-3.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-hdfs-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-jobclient-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-common-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xercesImpl-2.9.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/curator-client-2.7.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jersey-client.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xmlenc-0.52.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jaxb-api-2.2.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/paranamer-2.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-logging-1.1.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/stax-api-1.0-2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-kms.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/slf4j-api-1.7.5.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-math3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-math3-3.1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-xc-1.8.8.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/protobuf-java.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-core.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/activation.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-client-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/avro.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-lang.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-collections.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/servlet-api.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-aws-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-core.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/apacheds-i18n.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jetty-util.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-xc.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-common.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/curator-framework.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-jaxrs.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xercesImpl.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/gson-2.2.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-aws.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-server-common-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-core-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-annotations.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jetty-util-6.1.26.cloudera.4.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-common.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-beanutils-core-1.8.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-collections-3.2.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/xml-apis.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-jaxrs-1.8.8.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-beanutils-1.9.2.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-configuration.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-httpclient.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/netty.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/curator-client.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jackson-core-2.2.3.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/log4j-1.2.17.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/api-util.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/aws-java-sdk-core-1.10.6.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/netty-3.10.5.Final.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/apacheds-kerberos-codec-2.0.0-M15.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/jersey-core-1.9.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/activation-1.1.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/commons-digester-1.8.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-mapreduce-client-app-2.6.0-cdh5.10.0.jar:file:/opt/cloudera/parcels/CDH-5.10.0-1.cdh5.10.0.p0.41/lib/hadoop/client/hadoop-yarn-common-2.6.0-cdh5.10.0.jar
17/08/15 12:48:15 INFO hive.metastore: Trying to connect to metastore with URI thrift://quickstart.cloudera:9083
17/08/15 12:48:15 INFO hive.metastore: Opened a connection to metastore, current connections: 1
17/08/15 12:48:15 INFO hive.metastore: Connected to metastore.
17/08/15 12:48:15 INFO session.SessionState: Created local directory: /tmp/556d2ce1-a1fe-4881-a6c5-d58c1e07f4f4_resources
17/08/15 12:48:15 INFO session.SessionState: Created HDFS directory: /tmp/hive/cloudera/556d2ce1-a1fe-4881-a6c5-d58c1e07f4f4
17/08/15 12:48:15 INFO session.SessionState: Created local directory: /tmp/cloudera/556d2ce1-a1fe-4881-a6c5-d58c1e07f4f4
17/08/15 12:48:15 INFO session.SessionState: Created HDFS directory: /tmp/hive/cloudera/556d2ce1-a1fe-4881-a6c5-d58c1e07f4f4/_tmp_space.db
17/08/15 12:48:15 INFO session.SessionState: No Tez session required at this point. hive.execution.engine=mr.
17/08/15 12:48:15 INFO client.HiveClientImpl: Warehouse location for Hive client (version 1.1.0) is /user/hive/warehouse
17/08/15 12:48:15 INFO com.gss.mainController.StreamingJob1: Spark sparkSession executed
17/08/15 12:48:15 WARN sql.SparkSession$Builder: Using an existing SparkSession; some configuration may not take effect.
17/08/15 12:48:15 INFO execution.SparkSqlParser: Parsing command: select count(*) as mycount from aggregates
17/08/15 12:48:16 INFO spark.SparkContext: Starting job: parquet at com.gss.mainController.StreamingJob1.java:41
17/08/15 12:48:16 INFO scheduler.DAGScheduler: Got job 0 (parquet at com.gss.mainController.StreamingJob1.java:41) with 1 output partitions
17/08/15 12:48:16 INFO scheduler.DAGScheduler: Final stage: ResultStage 0 (parquet at com.gss.mainController.StreamingJob1.java:41)
17/08/15 12:48:16 INFO scheduler.DAGScheduler: Parents of final stage: List()
17/08/15 12:48:16 INFO scheduler.DAGScheduler: Missing parents: List()
17/08/15 12:48:16 INFO scheduler.DAGScheduler: Submitting ResultStage 0 (MapPartitionsRDD[1] at parquet at com.gss.mainController.StreamingJob1.java:41), which has no missing parents
17/08/15 12:48:16 ERROR com.gss.mainController.ParquetJob1: Warning: exception: Table or view not found: aggregates; line 1 pos 32
17/08/15 12:48:16 ERROR com.gss.mainController.ParquetJob1: org.apache.spark.sql.AnalysisException: Table or view not found: aggregates; line 1 pos 32
17/08/15 12:48:17 INFO memory.MemoryStore: Block broadcast_0 stored as values in memory (estimated size 82.5 KB, free 366.2 MB)
17/08/15 12:48:17 INFO memory.MemoryStore: Block broadcast_0_piece0 stored as bytes in memory (estimated size 30.2 KB, free 366.2 MB)
17/08/15 12:48:17 INFO storage.BlockManagerInfo: Added broadcast_0_piece0 in memory on 192.168.1.116:60495 (size: 30.2 KB, free: 366.3 MB)
17/08/15 12:48:17 INFO spark.SparkContext: Created broadcast 0 from broadcast at DAGScheduler.scala:996
17/08/15 12:48:17 INFO scheduler.DAGScheduler: Submitting 1 missing tasks from ResultStage 0 (MapPartitionsRDD[1] at parquet at com.gss.mainController.StreamingJob1.java:41)
17/08/15 12:48:17 INFO cluster.YarnScheduler: Adding task set 0.0 with 1 tasks
17/08/15 12:48:17 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0, quickstart.cloudera, executor 5, partition 0, PROCESS_LOCAL, 6065 bytes)
17/08/15 12:48:18 INFO storage.BlockManagerInfo: Added broadcast_0_piece0 in memory on quickstart.cloudera:44013 (size: 30.2 KB, free: 366.3 MB)
17/08/15 12:48:20 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0) in 2771 ms on quickstart.cloudera (executor 5) (1/1)
17/08/15 12:48:20 INFO cluster.YarnScheduler: Removed TaskSet 0.0, whose tasks have all completed, from pool
17/08/15 12:48:20 INFO scheduler.DAGScheduler: ResultStage 0 (parquet at com.gss.mainController.StreamingJob1.java:41) finished in 2.784 s
17/08/15 12:48:20 INFO scheduler.DAGScheduler: Job 0 finished: parquet at com.gss.mainController.StreamingJob1.java:41, took 3.650966 s
17/08/15 12:48:20 INFO execution.SparkSqlParser: Parsing command: tmptable
17/08/15 12:48:20 INFO execution.SparkSqlParser: Parsing command: select caseId from tmptable where fieldName = 'ActionClassification' and valueStr = '21' group by caseId
17/08/15 12:48:20 INFO state.StateStoreCoordinatorRef: Registered StateStoreCoordinator endpoint
17/08/15 12:48:20 INFO streaming.FileStreamSourceLog: Set the compact interval to 10 [defaultCompactInterval: 10]
17/08/15 12:48:20 INFO streaming.FileStreamSource: maxFilesPerBatch = None, maxFileAge = 604800000
17/08/15 12:48:20 INFO streaming.StreamExecution: Starting new streaming query.
17/08/15 12:48:20 INFO execution.SparkSqlParser: Parsing command: aggregates
17/08/15 12:48:20 INFO streaming.FileStreamSourceLog: Set the compact interval to 10 [defaultCompactInterval: 10]
17/08/15 12:48:20 INFO streaming.FileStreamSource: maxFilesPerBatch = None, maxFileAge = 604800000
17/08/15 12:48:20 INFO streaming.StreamExecution: Starting new streaming query.
17/08/15 12:48:20 INFO execution.SparkSqlParser: Parsing command: select * from aggregates
17/08/15 12:48:20 INFO storage.BlockManagerInfo: Removed broadcast_0_piece0 on quickstart.cloudera:44013 in memory (size: 30.2 KB, free: 366.3 MB)
17/08/15 12:48:20 INFO streaming.FileStreamSource: Log offset set to 0 with 1 new files
17/08/15 12:48:20 INFO streaming.FileStreamSource: Log offset set to 0 with 1 new files
17/08/15 12:48:20 INFO storage.BlockManagerInfo: Removed broadcast_0_piece0 on 192.168.1.116:60495 in memory (size: 30.2 KB, free: 366.3 MB)
17/08/15 12:48:21 INFO streaming.StreamExecution: Committed offsets for batch 0. Metadata OffsetSeqMetadata(0,1502826500999)
17/08/15 12:48:21 INFO streaming.StreamExecution: Committed offsets for batch 0. Metadata OffsetSeqMetadata(0,1502826500999)
17/08/15 12:48:21 INFO streaming.FileStreamSource: Processing 1 files from 0:0
17/08/15 12:48:21 INFO streaming.FileStreamSource: Processing 1 files from 0:0
17/08/15 12:48:21 WARN datasources.DataSource: Error while looking for metadata directory.
17/08/15 12:48:21 WARN datasources.DataSource: Error while looking for metadata directory.
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Pruning directories with:
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Pruning directories with:
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Post-Scan Filters: isnotnull(fieldName#61),isnotnull(valueStr#62),(fieldName#61 = ActionClassification),(valueStr#62 = 21)
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Post-Scan Filters: isnotnull(fieldName#54),isnotnull(valueStr#55),(fieldName#54 = ActionClassification),(valueStr#55 = 21)
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Output Data Schema: struct<caseId: string, fieldName: string, valueStr: string ... 1 more fields>
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Output Data Schema: struct<caseId: string, fieldName: string, valueStr: string ... 1 more fields>
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Pushed Filters: IsNotNull(fieldName),IsNotNull(valueStr),EqualTo(fieldName,ActionClassification),EqualTo(valueStr,21)
17/08/15 12:48:21 INFO datasources.FileSourceStrategy: Pushed Filters: IsNotNull(fieldName),IsNotNull(valueStr),EqualTo(fieldName,ActionClassification),EqualTo(valueStr,21)
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO codegen.CodeGenerator: Code generated in 274.390238 ms
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO aggregate.HashAggregateExec: spark.sql.codegen.aggregate.map.twolevel.enable is set to true, but current version of codegened fast hashmap does not support this aggregate.
17/08/15 12:48:21 INFO codegen.CodeGenerator: Code generated in 51.274561 ms
17/08/15 12:48:21 INFO memory.MemoryStore: Block broadcast_2 stored as values in memory (estimated size 323.5 KB, free 366.0 MB)
17/08/15 12:48:21 INFO memory.MemoryStore: Block broadcast_1 stored as values in memory (estimated size 323.5 KB, free 365.7 MB)
17/08/15 12:48:21 INFO memory.MemoryStore: Block broadcast_2_piece0 stored as bytes in memory (estimated size 29.2 KB, free 365.6 MB)
17/08/15 12:48:21 INFO storage.BlockManagerInfo: Added broadcast_2_piece0 in memory on 192.168.1.116:60495 (size: 29.2 KB, free: 366.3 MB)
17/08/15 12:48:21 INFO spark.SparkContext: Created broadcast 2 from start at com.gss.mainController.StreamingJob1.java:51
17/08/15 12:48:21 INFO memory.MemoryStore: Block broadcast_1_piece0 stored as bytes in memory (estimated size 29.2 KB, free 365.6 MB)
17/08/15 12:48:21 INFO storage.BlockManagerInfo: Added broadcast_1_piece0 in memory on 192.168.1.116:60495 (size: 29.2 KB, free: 366.2 MB)
17/08/15 12:48:21 INFO spark.SparkContext: Created broadcast 1 from start at com.gss.mainController.StreamingJob1.java:57
17/08/15 12:48:22 INFO execution.FileSourceScanExec: Planning scan with bin packing, max size: 14477085 bytes, open cost is considered as scanning 4194304 bytes.
17/08/15 12:48:22 INFO execution.FileSourceScanExec: Planning scan with bin packing, max size: 14477085 bytes, open cost is considered as scanning 4194304 bytes.
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_3 stored as values in memory (estimated size 321.2 KB, free 365.3 MB)
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_4 stored as values in memory (estimated size 321.2 KB, free 365.0 MB)
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_3_piece0 stored as bytes in memory (estimated size 28.8 KB, free 365.0 MB)
17/08/15 12:48:22 INFO storage.BlockManagerInfo: Added broadcast_3_piece0 in memory on 192.168.1.116:60495 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:22 INFO spark.SparkContext: Created broadcast 3 from start at com.gss.mainController.StreamingJob1.java:57
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_4_piece0 stored as bytes in memory (estimated size 28.8 KB, free 364.9 MB)
17/08/15 12:48:22 INFO storage.BlockManagerInfo: Added broadcast_4_piece0 in memory on 192.168.1.116:60495 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:22 INFO spark.SparkContext: Created broadcast 4 from start at com.gss.mainController.StreamingJob1.java:51
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_6 stored as values in memory (estimated size 321.2 KB, free 364.6 MB)
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_5 stored as values in memory (estimated size 321.2 KB, free 364.3 MB)
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_5_piece0 stored as bytes in memory (estimated size 28.8 KB, free 364.3 MB)
17/08/15 12:48:22 INFO storage.BlockManagerInfo: Added broadcast_5_piece0 in memory on 192.168.1.116:60495 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:22 INFO spark.SparkContext: Created broadcast 5 from start at com.gss.mainController.StreamingJob1.java:51
17/08/15 12:48:22 INFO spark.SparkContext: Starting job: start at com.gss.mainController.StreamingJob1.java:51
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Registering RDD 9 (start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Got job 1 (start at com.gss.mainController.StreamingJob1.java:51) with 200 output partitions
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Final stage: ResultStage 2 (start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Parents of final stage: List(ShuffleMapStage 1)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Missing parents: List(ShuffleMapStage 1)
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_6_piece0 stored as bytes in memory (estimated size 28.8 KB, free 364.2 MB)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Submitting ShuffleMapStage 1 (MapPartitionsRDD[9] at start at com.gss.mainController.StreamingJob1.java:51), which has no missing parents
17/08/15 12:48:22 INFO storage.BlockManagerInfo: Added broadcast_6_piece0 in memory on 192.168.1.116:60495 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:22 INFO spark.SparkContext: Created broadcast 6 from start at com.gss.mainController.StreamingJob1.java:57
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_7 stored as values in memory (estimated size 21.4 KB, free 364.2 MB)
17/08/15 12:48:22 INFO spark.SparkContext: Starting job: start at com.gss.mainController.StreamingJob1.java:57
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_7_piece0 stored as bytes in memory (estimated size 9.4 KB, free 364.2 MB)
17/08/15 12:48:22 INFO storage.BlockManagerInfo: Added broadcast_7_piece0 in memory on 192.168.1.116:60495 (size: 9.4 KB, free: 366.1 MB)
17/08/15 12:48:22 INFO spark.SparkContext: Created broadcast 7 from broadcast at DAGScheduler.scala:996
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Submitting 6 missing tasks from ShuffleMapStage 1 (MapPartitionsRDD[9] at start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:48:22 INFO cluster.YarnScheduler: Adding task set 1.0 with 6 tasks
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Registering RDD 8 (start at com.gss.mainController.StreamingJob1.java:57)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Got job 2 (start at com.gss.mainController.StreamingJob1.java:57) with 200 output partitions
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Final stage: ResultStage 4 (start at com.gss.mainController.StreamingJob1.java:57)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Parents of final stage: List(ShuffleMapStage 3)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Missing parents: List(ShuffleMapStage 3)
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Submitting ShuffleMapStage 3 (MapPartitionsRDD[8] at start at com.gss.mainController.StreamingJob1.java:57), which has no missing parents
17/08/15 12:48:22 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 1.0 (TID 1, quickstart.cloudera, executor 3, partition 0, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:22 INFO scheduler.TaskSetManager: Starting task 1.0 in stage 1.0 (TID 2, quickstart.cloudera, executor 1, partition 1, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:22 INFO scheduler.TaskSetManager: Starting task 2.0 in stage 1.0 (TID 3, quickstart.cloudera, executor 6, partition 2, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_8 stored as values in memory (estimated size 21.4 KB, free 364.2 MB)
17/08/15 12:48:22 INFO scheduler.TaskSetManager: Starting task 3.0 in stage 1.0 (TID 4, quickstart.cloudera, executor 4, partition 3, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:22 INFO scheduler.TaskSetManager: Starting task 4.0 in stage 1.0 (TID 5, quickstart.cloudera, executor 2, partition 4, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:22 INFO scheduler.TaskSetManager: Starting task 5.0 in stage 1.0 (TID 6, quickstart.cloudera, executor 5, partition 5, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:22 INFO memory.MemoryStore: Block broadcast_8_piece0 stored as bytes in memory (estimated size 9.4 KB, free 364.2 MB)
17/08/15 12:48:22 INFO storage.BlockManagerInfo: Added broadcast_8_piece0 in memory on 192.168.1.116:60495 (size: 9.4 KB, free: 366.1 MB)
17/08/15 12:48:22 INFO spark.SparkContext: Created broadcast 8 from broadcast at DAGScheduler.scala:996
17/08/15 12:48:22 INFO scheduler.DAGScheduler: Submitting 6 missing tasks from ShuffleMapStage 3 (MapPartitionsRDD[8] at start at com.gss.mainController.StreamingJob1.java:57)
17/08/15 12:48:22 INFO cluster.YarnScheduler: Adding task set 3.0 with 6 tasks
17/08/15 12:48:22 INFO storage.BlockManagerInfo: Added broadcast_7_piece0 in memory on quickstart.cloudera:44013 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:23 INFO spark.ExecutorAllocationManager: Requesting 7 new executors because tasks are backlogged (new desired total will be 7)
17/08/15 12:48:24 INFO storage.BlockManagerInfo: Added broadcast_2_piece0 in memory on quickstart.cloudera:44013 (size: 29.2 KB, free: 366.3 MB)
17/08/15 12:48:24 INFO spark.ExecutorAllocationManager: Requesting 1 new executor because tasks are backlogged (new desired total will be 8)
17/08/15 12:48:24 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 3.0 (TID 7, quickstart.cloudera, executor 5, partition 0, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:24 INFO scheduler.TaskSetManager: Finished task 5.0 in stage 1.0 (TID 6) in 2236 ms on quickstart.cloudera (executor 5) (1/6)
17/08/15 12:48:24 INFO storage.BlockManagerInfo: Added broadcast_7_piece0 in memory on quickstart.cloudera:59510 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:24 INFO storage.BlockManagerInfo: Added broadcast_7_piece0 in memory on quickstart.cloudera:34617 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:24 INFO storage.BlockManagerInfo: Added broadcast_8_piece0 in memory on quickstart.cloudera:44013 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:24 INFO storage.BlockManagerInfo: Added broadcast_1_piece0 in memory on quickstart.cloudera:44013 (size: 29.2 KB, free: 366.2 MB)
17/08/15 12:48:24 INFO storage.BlockManagerInfo: Added broadcast_7_piece0 in memory on quickstart.cloudera:52065 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:25 INFO storage.BlockManagerInfo: Added broadcast_7_piece0 in memory on quickstart.cloudera:54741 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:25 INFO scheduler.TaskSetManager: Starting task 1.0 in stage 3.0 (TID 8, quickstart.cloudera, executor 5, partition 1, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:25 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 3.0 (TID 7) in 429 ms on quickstart.cloudera (executor 5) (1/6)
17/08/15 12:48:25 INFO storage.BlockManagerInfo: Added broadcast_7_piece0 in memory on quickstart.cloudera:50242 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:25 INFO scheduler.TaskSetManager: Starting task 2.0 in stage 3.0 (TID 9, quickstart.cloudera, executor 5, partition 2, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:25 INFO scheduler.TaskSetManager: Finished task 1.0 in stage 3.0 (TID 8) in 180 ms on quickstart.cloudera (executor 5) (2/6)
17/08/15 12:48:25 INFO spark.ExecutorAllocationManager: Requesting 1 new executor because tasks are backlogged (new desired total will be 9)
17/08/15 12:48:28 INFO storage.BlockManagerInfo: Added broadcast_2_piece0 in memory on quickstart.cloudera:59510 (size: 29.2 KB, free: 366.3 MB)
17/08/15 12:48:28 INFO storage.BlockManagerInfo: Added broadcast_2_piece0 in memory on quickstart.cloudera:52065 (size: 29.2 KB, free: 366.3 MB)
17/08/15 12:48:28 INFO storage.BlockManagerInfo: Added broadcast_2_piece0 in memory on quickstart.cloudera:50242 (size: 29.2 KB, free: 366.3 MB)
17/08/15 12:48:28 INFO storage.BlockManagerInfo: Added broadcast_2_piece0 in memory on quickstart.cloudera:54741 (size: 29.2 KB, free: 366.3 MB)
17/08/15 12:48:28 INFO storage.BlockManagerInfo: Added broadcast_2_piece0 in memory on quickstart.cloudera:34617 (size: 29.2 KB, free: 366.3 MB)
17/08/15 12:48:31 INFO scheduler.TaskSetManager: Starting task 3.0 in stage 3.0 (TID 10, quickstart.cloudera, executor 4, partition 3, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:31 INFO scheduler.TaskSetManager: Finished task 3.0 in stage 1.0 (TID 4) in 8803 ms on quickstart.cloudera (executor 4) (2/6)
17/08/15 12:48:31 INFO storage.BlockManagerInfo: Added broadcast_8_piece0 in memory on quickstart.cloudera:52065 (size: 9.4 KB, free: 366.3 MB)
17/08/15 12:48:31 INFO storage.BlockManagerInfo: Added broadcast_1_piece0 in memory on quickstart.cloudera:52065 (size: 29.2 KB, free: 366.2 MB)
17/08/15 12:48:31 INFO scheduler.TaskSetManager: Starting task 4.0 in stage 3.0 (TID 11, quickstart.cloudera, executor 4, partition 4, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:31 INFO scheduler.TaskSetManager: Finished task 3.0 in stage 3.0 (TID 10) in 270 ms on quickstart.cloudera (executor 4) (3/6)
17/08/15 12:48:32 INFO scheduler.TaskSetManager: Starting task 5.0 in stage 3.0 (TID 12, quickstart.cloudera, executor 4, partition 5, NODE_LOCAL, 6923 bytes)
17/08/15 12:48:32 INFO scheduler.TaskSetManager: Finished task 4.0 in stage 3.0 (TID 11) in 788 ms on quickstart.cloudera (executor 4) (4/6)
17/08/15 12:48:32 INFO scheduler.TaskSetManager: Finished task 4.0 in stage 1.0 (TID 5) in 9846 ms on quickstart.cloudera (executor 2) (3/6)
17/08/15 12:48:32 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 1.0 (TID 1) in 9893 ms on quickstart.cloudera (executor 3) (4/6)
17/08/15 12:48:32 INFO scheduler.TaskSetManager: Finished task 1.0 in stage 1.0 (TID 2) in 9929 ms on quickstart.cloudera (executor 1) (5/6)
17/08/15 12:48:32 INFO scheduler.TaskSetManager: Finished task 5.0 in stage 3.0 (TID 12) in 88 ms on quickstart.cloudera (executor 4) (5/6)
17/08/15 12:48:35 INFO scheduler.TaskSetManager: Finished task 2.0 in stage 3.0 (TID 9) in 9944 ms on quickstart.cloudera (executor 5) (6/6)
17/08/15 12:48:35 INFO cluster.YarnScheduler: Removed TaskSet 3.0, whose tasks have all completed, from pool
17/08/15 12:48:35 INFO scheduler.DAGScheduler: ShuffleMapStage 3 (start at com.gss.mainController.StreamingJob1.java:57) finished in 12.691 s
17/08/15 12:48:35 INFO scheduler.DAGScheduler: looking for newly runnable stages
17/08/15 12:48:35 INFO scheduler.DAGScheduler: running: Set(ShuffleMapStage 1)
17/08/15 12:48:35 INFO scheduler.DAGScheduler: waiting: Set(ResultStage 2, ResultStage 4)
17/08/15 12:48:35 INFO scheduler.DAGScheduler: failed: Set()
17/08/15 12:48:35 INFO scheduler.DAGScheduler: Submitting ResultStage 4 (MapPartitionsRDD[23] at start at com.gss.mainController.StreamingJob1.java:57), which has no missing parents
17/08/15 12:48:35 INFO spark.ContextCleaner: Cleaned accumulator 48
17/08/15 12:48:35 INFO spark.ContextCleaner: Cleaned accumulator 50
17/08/15 12:48:35 INFO spark.ContextCleaner: Cleaned accumulator 49
17/08/15 12:48:35 INFO memory.MemoryStore: Block broadcast_9 stored as values in memory (estimated size 35.1 KB, free 364.1 MB)
17/08/15 12:48:35 INFO memory.MemoryStore: Block broadcast_9_piece0 stored as bytes in memory (estimated size 12.5 KB, free 364.1 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_9_piece0 in memory on 192.168.1.116:60495 (size: 12.5 KB, free: 366.1 MB)
17/08/15 12:48:35 INFO spark.SparkContext: Created broadcast 9 from broadcast at DAGScheduler.scala:996
17/08/15 12:48:35 INFO scheduler.DAGScheduler: Submitting 200 missing tasks from ResultStage 4 (MapPartitionsRDD[23] at start at com.gss.mainController.StreamingJob1.java:57)
17/08/15 12:48:35 INFO cluster.YarnScheduler: Adding task set 4.0 with 200 tasks
17/08/15 12:48:35 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 4.0 (TID 13, quickstart.cloudera, executor 1, partition 0, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:35 INFO scheduler.TaskSetManager: Starting task 1.0 in stage 4.0 (TID 14, quickstart.cloudera, executor 4, partition 1, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:35 INFO scheduler.TaskSetManager: Starting task 2.0 in stage 4.0 (TID 15, quickstart.cloudera, executor 2, partition 2, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:35 INFO scheduler.TaskSetManager: Starting task 3.0 in stage 4.0 (TID 16, quickstart.cloudera, executor 5, partition 3, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:35 INFO scheduler.TaskSetManager: Starting task 4.0 in stage 4.0 (TID 17, quickstart.cloudera, executor 3, partition 4, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_9_piece0 in memory on quickstart.cloudera:44013 (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_9_piece0 in memory on quickstart.cloudera:52065 (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_9_piece0 in memory on quickstart.cloudera:59510 (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_9_piece0 in memory on quickstart.cloudera:34617 (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_9_piece0 in memory on quickstart.cloudera:54741 (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_6_piece0 in memory on quickstart.cloudera:44013 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_6_piece0 in memory on quickstart.cloudera:54741 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_6_piece0 in memory on quickstart.cloudera:34617 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_6_piece0 in memory on quickstart.cloudera:52065 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_6_piece0 in memory on quickstart.cloudera:59510 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_3_piece0 in memory on quickstart.cloudera:44013 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35776
17/08/15 12:48:35 INFO spark.MapOutputTrackerMaster: Size of output statuses for shuffle 0 is 173 bytes
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_3_piece0 in memory on quickstart.cloudera:54741 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:35 INFO storage.BlockManagerInfo: Added broadcast_3_piece0 in memory on quickstart.cloudera:59510 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:36 INFO storage.BlockManagerInfo: Added broadcast_3_piece0 in memory on quickstart.cloudera:52065 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:36 INFO storage.BlockManagerInfo: Added broadcast_3_piece0 in memory on quickstart.cloudera:34617 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:36 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35764
17/08/15 12:48:36 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35763
17/08/15 12:48:36 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35760
17/08/15 12:48:36 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35767
17/08/15 12:48:36 INFO spark.ExecutorAllocationManager: Requesting 6 new executors because tasks are backlogged (new desired total will be 7)
17/08/15 12:48:36 INFO scheduler.TaskSetManager: Starting task 5.0 in stage 4.0 (TID 18, quickstart.cloudera, executor 5, partition 5, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:36 INFO scheduler.TaskSetManager: Finished task 3.0 in stage 4.0 (TID 16) in 1278 ms on quickstart.cloudera (executor 5) (1/200)
17/08/15 12:48:38 INFO spark.ExecutorAllocationManager: Requesting 1 new executor because tasks are backlogged (new desired total will be 8)
17/08/15 12:48:39 INFO spark.ExecutorAllocationManager: Requesting 2 new executors because tasks are backlogged (new desired total will be 10)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Starting task 6.0 in stage 4.0 (TID 19, quickstart.cloudera, executor 4, partition 6, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Finished task 1.0 in stage 4.0 (TID 14) in 3739 ms on quickstart.cloudera (executor 4) (2/200)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Starting task 7.0 in stage 4.0 (TID 20, quickstart.cloudera, executor 3, partition 7, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Finished task 4.0 in stage 4.0 (TID 17) in 3746 ms on quickstart.cloudera (executor 3) (3/200)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Starting task 8.0 in stage 4.0 (TID 21, quickstart.cloudera, executor 1, partition 8, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 4.0 (TID 13) in 3798 ms on quickstart.cloudera (executor 1) (4/200)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Starting task 9.0 in stage 4.0 (TID 22, quickstart.cloudera, executor 2, partition 9, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Finished task 2.0 in stage 4.0 (TID 15) in 3810 ms on quickstart.cloudera (executor 2) (5/200)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Starting task 10.0 in stage 4.0 (TID 23, quickstart.cloudera, executor 6, partition 10, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Finished task 2.0 in stage 1.0 (TID 3) in 16933 ms on quickstart.cloudera (executor 6) (6/6)
17/08/15 12:48:39 INFO cluster.YarnScheduler: Removed TaskSet 1.0, whose tasks have all completed, from pool
17/08/15 12:48:39 INFO scheduler.DAGScheduler: ShuffleMapStage 1 (start at com.gss.mainController.StreamingJob1.java:51) finished in 16.958 s
17/08/15 12:48:39 INFO scheduler.DAGScheduler: looking for newly runnable stages
17/08/15 12:48:39 INFO scheduler.DAGScheduler: running: Set(ResultStage 4)
17/08/15 12:48:39 INFO scheduler.DAGScheduler: waiting: Set(ResultStage 2)
17/08/15 12:48:39 INFO scheduler.DAGScheduler: failed: Set()
17/08/15 12:48:39 INFO scheduler.DAGScheduler: Submitting ResultStage 2 (MapPartitionsRDD[21] at start at com.gss.mainController.StreamingJob1.java:51), which has no missing parents
17/08/15 12:48:39 INFO spark.ExecutorAllocationManager: Requesting 4 new executors because tasks are backlogged (new desired total will be 14)
17/08/15 12:48:39 INFO storage.BlockManagerInfo: Added broadcast_9_piece0 in memory on quickstart.cloudera:50242 (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:48:39 INFO memory.MemoryStore: Block broadcast_10 stored as values in memory (estimated size 35.1 KB, free 364.1 MB)
17/08/15 12:48:39 INFO memory.MemoryStore: Block broadcast_10_piece0 stored as bytes in memory (estimated size 12.5 KB, free 364.1 MB)
17/08/15 12:48:39 INFO storage.BlockManagerInfo: Added broadcast_10_piece0 in memory on 192.168.1.116:60495 (size: 12.5 KB, free: 366.1 MB)
17/08/15 12:48:39 INFO spark.SparkContext: Created broadcast 10 from broadcast at DAGScheduler.scala:996
17/08/15 12:48:39 INFO scheduler.DAGScheduler: Submitting 200 missing tasks from ResultStage 2 (MapPartitionsRDD[21] at start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:48:39 INFO cluster.YarnScheduler: Adding task set 2.0 with 200 tasks
17/08/15 12:48:39 INFO storage.BlockManagerInfo: Added broadcast_6_piece0 in memory on quickstart.cloudera:50242 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 2.0 (TID 24, quickstart.cloudera, executor 5, partition 0, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:39 INFO scheduler.TaskSetManager: Finished task 5.0 in stage 4.0 (TID 18) in 3102 ms on quickstart.cloudera (executor 5) (6/200)
17/08/15 12:48:39 INFO storage.BlockManagerInfo: Added broadcast_10_piece0 in memory on quickstart.cloudera:44013 (size: 12.5 KB, free: 366.1 MB)
17/08/15 12:48:39 INFO storage.BlockManagerInfo: Added broadcast_3_piece0 in memory on quickstart.cloudera:50242 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:39 INFO storage.BlockManagerInfo: Added broadcast_5_piece0 in memory on quickstart.cloudera:44013 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:39 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35774
17/08/15 12:48:39 INFO spark.MapOutputTrackerMaster: Size of output statuses for shuffle 0 is 173 bytes
17/08/15 12:48:39 INFO storage.BlockManagerInfo: Added broadcast_4_piece0 in memory on quickstart.cloudera:44013 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:40 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 1 to 192.168.1.116:35776
17/08/15 12:48:40 INFO spark.MapOutputTrackerMaster: Size of output statuses for shuffle 1 is 181 bytes
17/08/15 12:48:41 INFO spark.ExecutorAllocationManager: Requesting 8 new executors because tasks are backlogged (new desired total will be 22)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Starting task 1.0 in stage 2.0 (TID 25, quickstart.cloudera, executor 2, partition 1, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Finished task 9.0 in stage 4.0 (TID 22) in 2525 ms on quickstart.cloudera (executor 2) (7/200)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Starting task 2.0 in stage 2.0 (TID 26, quickstart.cloudera, executor 1, partition 2, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Finished task 8.0 in stage 4.0 (TID 21) in 2558 ms on quickstart.cloudera (executor 1) (8/200)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Starting task 3.0 in stage 2.0 (TID 27, quickstart.cloudera, executor 3, partition 3, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Finished task 7.0 in stage 4.0 (TID 20) in 2600 ms on quickstart.cloudera (executor 3) (9/200)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Starting task 4.0 in stage 2.0 (TID 28, quickstart.cloudera, executor 4, partition 4, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:41 INFO scheduler.TaskSetManager: Finished task 6.0 in stage 4.0 (TID 19) in 2620 ms on quickstart.cloudera (executor 4) (10/200)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_10_piece0 in memory on quickstart.cloudera:59510 (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_10_piece0 in memory on quickstart.cloudera:54741 (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_10_piece0 in memory on quickstart.cloudera:52065 (size: 12.5 KB, free: 366.1 MB)
17/08/15 12:48:41 INFO spark.ExecutorAllocationManager: Requesting 16 new executors because tasks are backlogged (new desired total will be 38)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_5_piece0 in memory on quickstart.cloudera:54741 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_10_piece0 in memory on quickstart.cloudera:34617 (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_5_piece0 in memory on quickstart.cloudera:59510 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_5_piece0 in memory on quickstart.cloudera:52065 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:41 INFO storage.BlockManagerInfo: Added broadcast_5_piece0 in memory on quickstart.cloudera:34617 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Starting task 5.0 in stage 2.0 (TID 29, quickstart.cloudera, executor 5, partition 5, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 2.0 (TID 24) in 2226 ms on quickstart.cloudera (executor 5) (1/200)
17/08/15 12:48:42 INFO storage.BlockManagerInfo: Added broadcast_4_piece0 in memory on quickstart.cloudera:52065 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:42 INFO storage.BlockManagerInfo: Added broadcast_4_piece0 in memory on quickstart.cloudera:54741 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Starting task 6.0 in stage 2.0 (TID 30, quickstart.cloudera, executor 6, partition 6, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Finished task 10.0 in stage 4.0 (TID 23) in 2819 ms on quickstart.cloudera (executor 6) (11/200)
17/08/15 12:48:42 INFO storage.BlockManagerInfo: Added broadcast_10_piece0 in memory on quickstart.cloudera:50242 (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:48:42 INFO storage.BlockManagerInfo: Added broadcast_4_piece0 in memory on quickstart.cloudera:34617 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:42 INFO storage.BlockManagerInfo: Added broadcast_4_piece0 in memory on quickstart.cloudera:59510 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:42 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 1 to 192.168.1.116:35763
17/08/15 12:48:42 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 1 to 192.168.1.116:35764
17/08/15 12:48:42 INFO storage.BlockManagerInfo: Added broadcast_5_piece0 in memory on quickstart.cloudera:50242 (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:48:42 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 1 to 192.168.1.116:35760
17/08/15 12:48:42 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 1 to 192.168.1.116:35767
17/08/15 12:48:42 INFO spark.ExecutorAllocationManager: Requesting 32 new executors because tasks are backlogged (new desired total will be 70)
17/08/15 12:48:42 INFO storage.BlockManagerInfo: Added broadcast_4_piece0 in memory on quickstart.cloudera:50242 (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:48:42 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 1 to 192.168.1.116:35774
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Starting task 7.0 in stage 2.0 (TID 31, quickstart.cloudera, executor 5, partition 7, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Finished task 5.0 in stage 2.0 (TID 29) in 871 ms on quickstart.cloudera (executor 5) (2/200)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Starting task 8.0 in stage 2.0 (TID 32, quickstart.cloudera, executor 4, partition 8, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Starting task 9.0 in stage 2.0 (TID 33, quickstart.cloudera, executor 1, partition 9, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Finished task 4.0 in stage 2.0 (TID 28) in 1160 ms on quickstart.cloudera (executor 4) (3/200)
17/08/15 12:48:42 INFO scheduler.TaskSetManager: Finished task 2.0 in stage 2.0 (TID 26) in 1178 ms on quickstart.cloudera (executor 1) (4/200)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Starting task 10.0 in stage 2.0 (TID 34, quickstart.cloudera, executor 2, partition 10, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Finished task 1.0 in stage 2.0 (TID 25) in 1265 ms on quickstart.cloudera (executor 2) (5/200)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Starting task 11.0 in stage 2.0 (TID 35, quickstart.cloudera, executor 3, partition 11, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Finished task 3.0 in stage 2.0 (TID 27) in 1256 ms on quickstart.cloudera (executor 3) (6/200)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Starting task 12.0 in stage 2.0 (TID 36, quickstart.cloudera, executor 6, partition 12, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Finished task 6.0 in stage 2.0 (TID 30) in 1104 ms on quickstart.cloudera (executor 6) (7/200)
17/08/15 12:48:43 INFO spark.ExecutorAllocationManager: Requesting 64 new executors because tasks are backlogged (new desired total will be 134)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Starting task 13.0 in stage 2.0 (TID 37, quickstart.cloudera, executor 5, partition 13, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Finished task 7.0 in stage 2.0 (TID 31) in 909 ms on quickstart.cloudera (executor 5) (8/200)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Starting task 14.0 in stage 2.0 (TID 38, quickstart.cloudera, executor 1, partition 14, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Finished task 9.0 in stage 2.0 (TID 33) in 925 ms on quickstart.cloudera (executor 1) (9/200)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Starting task 15.0 in stage 2.0 (TID 39, quickstart.cloudera, executor 4, partition 15, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Finished task 8.0 in stage 2.0 (TID 32) in 927 ms on quickstart.cloudera (executor 4) (10/200)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Starting task 16.0 in stage 2.0 (TID 40, quickstart.cloudera, executor 2, partition 16, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:43 INFO scheduler.TaskSetManager: Finished task 10.0 in stage 2.0 (TID 34) in 917 ms on quickstart.cloudera (executor 2) (11/200)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Starting task 17.0 in stage 2.0 (TID 41, quickstart.cloudera, executor 3, partition 17, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Finished task 11.0 in stage 2.0 (TID 35) in 1105 ms on quickstart.cloudera (executor 3) (12/200)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Starting task 18.0 in stage 2.0 (TID 42, quickstart.cloudera, executor 6, partition 18, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Finished task 12.0 in stage 2.0 (TID 36) in 838 ms on quickstart.cloudera (executor 6) (13/200)
17/08/15 12:48:44 INFO spark.ExecutorAllocationManager: Requesting 128 new executors because tasks are backlogged (new desired total will be 262)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Starting task 19.0 in stage 2.0 (TID 43, quickstart.cloudera, executor 5, partition 19, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Finished task 13.0 in stage 2.0 (TID 37) in 801 ms on quickstart.cloudera (executor 5) (14/200)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Starting task 20.0 in stage 2.0 (TID 44, quickstart.cloudera, executor 4, partition 20, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Finished task 15.0 in stage 2.0 (TID 39) in 797 ms on quickstart.cloudera (executor 4) (15/200)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Starting task 21.0 in stage 2.0 (TID 45, quickstart.cloudera, executor 1, partition 21, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Finished task 14.0 in stage 2.0 (TID 38) in 822 ms on quickstart.cloudera (executor 1) (16/200)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Starting task 22.0 in stage 2.0 (TID 46, quickstart.cloudera, executor 2, partition 22, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:44 INFO scheduler.TaskSetManager: Finished task 16.0 in stage 2.0 (TID 40) in 866 ms on quickstart.cloudera (executor 2) (17/200)
17/08/15 12:48:45 INFO scheduler.TaskSetManager: Starting task 23.0 in stage 2.0 (TID 47, quickstart.cloudera, executor 3, partition 23, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:45 INFO scheduler.TaskSetManager: Finished task 17.0 in stage 2.0 (TID 41) in 955 ms on quickstart.cloudera (executor 3) (18/200)
17/08/15 12:48:45 INFO scheduler.TaskSetManager: Starting task 24.0 in stage 2.0 (TID 48, quickstart.cloudera, executor 6, partition 24, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:45 INFO scheduler.TaskSetManager: Finished task 18.0 in stage 2.0 (TID 42) in 910 ms on quickstart.cloudera (executor 6) (19/200)
17/08/15 12:48:47 INFO scheduler.TaskSetManager: Starting task 25.0 in stage 2.0 (TID 49, quickstart.cloudera, executor 5, partition 25, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:47 INFO scheduler.TaskSetManager: Finished task 19.0 in stage 2.0 (TID 43) in 2883 ms on quickstart.cloudera (executor 5) (20/200)
17/08/15 12:48:47 INFO spark.ExecutorAllocationManager: Requesting 108 new executors because tasks are backlogged (new desired total will be 370)
17/08/15 12:48:47 INFO scheduler.TaskSetManager: Starting task 26.0 in stage 2.0 (TID 50, quickstart.cloudera, executor 1, partition 26, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:47 INFO scheduler.TaskSetManager: Finished task 21.0 in stage 2.0 (TID 45) in 2825 ms on quickstart.cloudera (executor 1) (21/200)
17/08/15 12:48:47 INFO scheduler.TaskSetManager: Starting task 27.0 in stage 2.0 (TID 51, quickstart.cloudera, executor 4, partition 27, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:47 INFO scheduler.TaskSetManager: Finished task 20.0 in stage 2.0 (TID 44) in 2873 ms on quickstart.cloudera (executor 4) (22/200)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Starting task 28.0 in stage 2.0 (TID 52, quickstart.cloudera, executor 3, partition 28, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Finished task 23.0 in stage 2.0 (TID 47) in 3055 ms on quickstart.cloudera (executor 3) (23/200)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Starting task 29.0 in stage 2.0 (TID 53, quickstart.cloudera, executor 2, partition 29, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Finished task 22.0 in stage 2.0 (TID 46) in 3343 ms on quickstart.cloudera (executor 2) (24/200)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Starting task 30.0 in stage 2.0 (TID 54, quickstart.cloudera, executor 6, partition 30, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Finished task 24.0 in stage 2.0 (TID 48) in 3021 ms on quickstart.cloudera (executor 6) (25/200)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Starting task 31.0 in stage 2.0 (TID 55, quickstart.cloudera, executor 5, partition 31, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Finished task 25.0 in stage 2.0 (TID 49) in 1176 ms on quickstart.cloudera (executor 5) (26/200)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Starting task 32.0 in stage 2.0 (TID 56, quickstart.cloudera, executor 4, partition 32, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Finished task 27.0 in stage 2.0 (TID 51) in 1154 ms on quickstart.cloudera (executor 4) (27/200)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Starting task 33.0 in stage 2.0 (TID 57, quickstart.cloudera, executor 1, partition 33, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:48 INFO scheduler.TaskSetManager: Finished task 26.0 in stage 2.0 (TID 50) in 1193 ms on quickstart.cloudera (executor 1) (28/200)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Starting task 34.0 in stage 2.0 (TID 58, quickstart.cloudera, executor 3, partition 34, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Finished task 28.0 in stage 2.0 (TID 52) in 1043 ms on quickstart.cloudera (executor 3) (29/200)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Starting task 35.0 in stage 2.0 (TID 59, quickstart.cloudera, executor 4, partition 35, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Finished task 32.0 in stage 2.0 (TID 56) in 830 ms on quickstart.cloudera (executor 4) (30/200)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Starting task 36.0 in stage 2.0 (TID 60, quickstart.cloudera, executor 6, partition 36, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Finished task 30.0 in stage 2.0 (TID 54) in 1386 ms on quickstart.cloudera (executor 6) (31/200)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Starting task 37.0 in stage 2.0 (TID 61, quickstart.cloudera, executor 5, partition 37, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Finished task 31.0 in stage 2.0 (TID 55) in 874 ms on quickstart.cloudera (executor 5) (32/200)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Starting task 38.0 in stage 2.0 (TID 62, quickstart.cloudera, executor 2, partition 38, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Finished task 29.0 in stage 2.0 (TID 53) in 1396 ms on quickstart.cloudera (executor 2) (33/200)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Starting task 39.0 in stage 2.0 (TID 63, quickstart.cloudera, executor 1, partition 39, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:49 INFO scheduler.TaskSetManager: Finished task 33.0 in stage 2.0 (TID 57) in 893 ms on quickstart.cloudera (executor 1) (34/200)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Starting task 40.0 in stage 2.0 (TID 64, quickstart.cloudera, executor 3, partition 40, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Finished task 34.0 in stage 2.0 (TID 58) in 1000 ms on quickstart.cloudera (executor 3) (35/200)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Starting task 41.0 in stage 2.0 (TID 65, quickstart.cloudera, executor 6, partition 41, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Finished task 36.0 in stage 2.0 (TID 60) in 829 ms on quickstart.cloudera (executor 6) (36/200)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Starting task 42.0 in stage 2.0 (TID 66, quickstart.cloudera, executor 4, partition 42, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Finished task 35.0 in stage 2.0 (TID 59) in 846 ms on quickstart.cloudera (executor 4) (37/200)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Starting task 43.0 in stage 2.0 (TID 67, quickstart.cloudera, executor 5, partition 43, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Finished task 37.0 in stage 2.0 (TID 61) in 845 ms on quickstart.cloudera (executor 5) (38/200)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Starting task 44.0 in stage 2.0 (TID 68, quickstart.cloudera, executor 1, partition 44, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:50 INFO scheduler.TaskSetManager: Finished task 39.0 in stage 2.0 (TID 63) in 846 ms on quickstart.cloudera (executor 1) (39/200)
17/08/15 12:48:51 INFO scheduler.TaskSetManager: Starting task 45.0 in stage 2.0 (TID 69, quickstart.cloudera, executor 3, partition 45, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:51 INFO scheduler.TaskSetManager: Finished task 40.0 in stage 2.0 (TID 64) in 1514 ms on quickstart.cloudera (executor 3) (40/200)
17/08/15 12:48:51 INFO scheduler.TaskSetManager: Starting task 46.0 in stage 2.0 (TID 70, quickstart.cloudera, executor 2, partition 46, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:51 INFO scheduler.TaskSetManager: Finished task 38.0 in stage 2.0 (TID 62) in 2175 ms on quickstart.cloudera (executor 2) (41/200)
17/08/15 12:48:51 INFO scheduler.TaskSetManager: Starting task 47.0 in stage 2.0 (TID 71, quickstart.cloudera, executor 4, partition 47, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:51 INFO scheduler.TaskSetManager: Finished task 42.0 in stage 2.0 (TID 66) in 1449 ms on quickstart.cloudera (executor 4) (42/200)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Starting task 48.0 in stage 2.0 (TID 72, quickstart.cloudera, executor 1, partition 48, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Finished task 44.0 in stage 2.0 (TID 68) in 1612 ms on quickstart.cloudera (executor 1) (43/200)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Starting task 49.0 in stage 2.0 (TID 73, quickstart.cloudera, executor 5, partition 49, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Finished task 43.0 in stage 2.0 (TID 67) in 2349 ms on quickstart.cloudera (executor 5) (44/200)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Starting task 50.0 in stage 2.0 (TID 74, quickstart.cloudera, executor 6, partition 50, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Finished task 41.0 in stage 2.0 (TID 65) in 2370 ms on quickstart.cloudera (executor 6) (45/200)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Starting task 51.0 in stage 2.0 (TID 75, quickstart.cloudera, executor 3, partition 51, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Finished task 45.0 in stage 2.0 (TID 69) in 1183 ms on quickstart.cloudera (executor 3) (46/200)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Starting task 52.0 in stage 2.0 (TID 76, quickstart.cloudera, executor 4, partition 52, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Finished task 47.0 in stage 2.0 (TID 71) in 1149 ms on quickstart.cloudera (executor 4) (47/200)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Starting task 53.0 in stage 2.0 (TID 77, quickstart.cloudera, executor 2, partition 53, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:52 INFO scheduler.TaskSetManager: Finished task 46.0 in stage 2.0 (TID 70) in 1287 ms on quickstart.cloudera (executor 2) (48/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 54.0 in stage 2.0 (TID 78, quickstart.cloudera, executor 1, partition 54, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 48.0 in stage 2.0 (TID 72) in 1647 ms on quickstart.cloudera (executor 1) (49/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 55.0 in stage 2.0 (TID 79, quickstart.cloudera, executor 5, partition 55, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 49.0 in stage 2.0 (TID 73) in 1060 ms on quickstart.cloudera (executor 5) (50/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 56.0 in stage 2.0 (TID 80, quickstart.cloudera, executor 6, partition 56, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 50.0 in stage 2.0 (TID 74) in 1062 ms on quickstart.cloudera (executor 6) (51/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 57.0 in stage 2.0 (TID 81, quickstart.cloudera, executor 1, partition 57, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 54.0 in stage 2.0 (TID 78) in 107 ms on quickstart.cloudera (executor 1) (52/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 58.0 in stage 2.0 (TID 82, quickstart.cloudera, executor 2, partition 58, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 53.0 in stage 2.0 (TID 77) in 808 ms on quickstart.cloudera (executor 2) (53/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 59.0 in stage 2.0 (TID 83, quickstart.cloudera, executor 3, partition 59, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 51.0 in stage 2.0 (TID 75) in 944 ms on quickstart.cloudera (executor 3) (54/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 60.0 in stage 2.0 (TID 84, quickstart.cloudera, executor 6, partition 60, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 56.0 in stage 2.0 (TID 80) in 146 ms on quickstart.cloudera (executor 6) (55/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 61.0 in stage 2.0 (TID 85, quickstart.cloudera, executor 1, partition 61, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 57.0 in stage 2.0 (TID 81) in 160 ms on quickstart.cloudera (executor 1) (56/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 62.0 in stage 2.0 (TID 86, quickstart.cloudera, executor 3, partition 62, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 59.0 in stage 2.0 (TID 83) in 153 ms on quickstart.cloudera (executor 3) (57/200)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Starting task 63.0 in stage 2.0 (TID 87, quickstart.cloudera, executor 2, partition 63, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:53 INFO scheduler.TaskSetManager: Finished task 58.0 in stage 2.0 (TID 82) in 186 ms on quickstart.cloudera (executor 2) (58/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 64.0 in stage 2.0 (TID 88, quickstart.cloudera, executor 6, partition 64, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 60.0 in stage 2.0 (TID 84) in 83 ms on quickstart.cloudera (executor 6) (59/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 65.0 in stage 2.0 (TID 89, quickstart.cloudera, executor 1, partition 65, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 61.0 in stage 2.0 (TID 85) in 78 ms on quickstart.cloudera (executor 1) (60/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 66.0 in stage 2.0 (TID 90, quickstart.cloudera, executor 2, partition 66, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 63.0 in stage 2.0 (TID 87) in 83 ms on quickstart.cloudera (executor 2) (61/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 67.0 in stage 2.0 (TID 91, quickstart.cloudera, executor 3, partition 67, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 62.0 in stage 2.0 (TID 86) in 113 ms on quickstart.cloudera (executor 3) (62/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 68.0 in stage 2.0 (TID 92, quickstart.cloudera, executor 1, partition 68, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 65.0 in stage 2.0 (TID 89) in 69 ms on quickstart.cloudera (executor 1) (63/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 69.0 in stage 2.0 (TID 93, quickstart.cloudera, executor 6, partition 69, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 64.0 in stage 2.0 (TID 88) in 107 ms on quickstart.cloudera (executor 6) (64/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 70.0 in stage 2.0 (TID 94, quickstart.cloudera, executor 1, partition 70, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 68.0 in stage 2.0 (TID 92) in 69 ms on quickstart.cloudera (executor 1) (65/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 71.0 in stage 2.0 (TID 95, quickstart.cloudera, executor 2, partition 71, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 66.0 in stage 2.0 (TID 90) in 112 ms on quickstart.cloudera (executor 2) (66/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 72.0 in stage 2.0 (TID 96, quickstart.cloudera, executor 4, partition 72, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 73.0 in stage 2.0 (TID 97, quickstart.cloudera, executor 3, partition 73, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 52.0 in stage 2.0 (TID 76) in 1228 ms on quickstart.cloudera (executor 4) (67/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 67.0 in stage 2.0 (TID 91) in 109 ms on quickstart.cloudera (executor 3) (68/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 74.0 in stage 2.0 (TID 98, quickstart.cloudera, executor 6, partition 74, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 69.0 in stage 2.0 (TID 93) in 78 ms on quickstart.cloudera (executor 6) (69/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 75.0 in stage 2.0 (TID 99, quickstart.cloudera, executor 6, partition 75, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 76.0 in stage 2.0 (TID 100, quickstart.cloudera, executor 4, partition 76, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 72.0 in stage 2.0 (TID 96) in 94 ms on quickstart.cloudera (executor 4) (70/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 74.0 in stage 2.0 (TID 98) in 82 ms on quickstart.cloudera (executor 6) (71/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 77.0 in stage 2.0 (TID 101, quickstart.cloudera, executor 1, partition 77, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 70.0 in stage 2.0 (TID 94) in 124 ms on quickstart.cloudera (executor 1) (72/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 78.0 in stage 2.0 (TID 102, quickstart.cloudera, executor 3, partition 78, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 73.0 in stage 2.0 (TID 97) in 147 ms on quickstart.cloudera (executor 3) (73/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 79.0 in stage 2.0 (TID 103, quickstart.cloudera, executor 5, partition 79, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 55.0 in stage 2.0 (TID 79) in 555 ms on quickstart.cloudera (executor 5) (74/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 80.0 in stage 2.0 (TID 104, quickstart.cloudera, executor 4, partition 80, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 76.0 in stage 2.0 (TID 100) in 63 ms on quickstart.cloudera (executor 4) (75/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 81.0 in stage 2.0 (TID 105, quickstart.cloudera, executor 1, partition 81, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 77.0 in stage 2.0 (TID 101) in 136 ms on quickstart.cloudera (executor 1) (76/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 82.0 in stage 2.0 (TID 106, quickstart.cloudera, executor 6, partition 82, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 75.0 in stage 2.0 (TID 99) in 150 ms on quickstart.cloudera (executor 6) (77/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 83.0 in stage 2.0 (TID 107, quickstart.cloudera, executor 3, partition 83, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 78.0 in stage 2.0 (TID 102) in 108 ms on quickstart.cloudera (executor 3) (78/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 84.0 in stage 2.0 (TID 108, quickstart.cloudera, executor 5, partition 84, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 79.0 in stage 2.0 (TID 103) in 113 ms on quickstart.cloudera (executor 5) (79/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 85.0 in stage 2.0 (TID 109, quickstart.cloudera, executor 4, partition 85, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 80.0 in stage 2.0 (TID 104) in 116 ms on quickstart.cloudera (executor 4) (80/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 86.0 in stage 2.0 (TID 110, quickstart.cloudera, executor 1, partition 86, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 81.0 in stage 2.0 (TID 105) in 76 ms on quickstart.cloudera (executor 1) (81/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 87.0 in stage 2.0 (TID 111, quickstart.cloudera, executor 4, partition 87, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 85.0 in stage 2.0 (TID 109) in 124 ms on quickstart.cloudera (executor 4) (82/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 88.0 in stage 2.0 (TID 112, quickstart.cloudera, executor 6, partition 88, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 89.0 in stage 2.0 (TID 113, quickstart.cloudera, executor 5, partition 89, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 84.0 in stage 2.0 (TID 108) in 133 ms on quickstart.cloudera (executor 5) (83/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 82.0 in stage 2.0 (TID 106) in 159 ms on quickstart.cloudera (executor 6) (84/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 90.0 in stage 2.0 (TID 114, quickstart.cloudera, executor 3, partition 90, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 83.0 in stage 2.0 (TID 107) in 148 ms on quickstart.cloudera (executor 3) (85/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 91.0 in stage 2.0 (TID 115, quickstart.cloudera, executor 1, partition 91, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 86.0 in stage 2.0 (TID 110) in 161 ms on quickstart.cloudera (executor 1) (86/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 92.0 in stage 2.0 (TID 116, quickstart.cloudera, executor 2, partition 92, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 71.0 in stage 2.0 (TID 95) in 522 ms on quickstart.cloudera (executor 2) (87/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 93.0 in stage 2.0 (TID 117, quickstart.cloudera, executor 6, partition 93, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 94.0 in stage 2.0 (TID 118, quickstart.cloudera, executor 4, partition 94, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 88.0 in stage 2.0 (TID 112) in 161 ms on quickstart.cloudera (executor 6) (88/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 87.0 in stage 2.0 (TID 111) in 170 ms on quickstart.cloudera (executor 4) (89/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 95.0 in stage 2.0 (TID 119, quickstart.cloudera, executor 3, partition 95, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 90.0 in stage 2.0 (TID 114) in 189 ms on quickstart.cloudera (executor 3) (90/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 96.0 in stage 2.0 (TID 120, quickstart.cloudera, executor 1, partition 96, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 97.0 in stage 2.0 (TID 121, quickstart.cloudera, executor 5, partition 97, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 89.0 in stage 2.0 (TID 113) in 245 ms on quickstart.cloudera (executor 5) (91/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 91.0 in stage 2.0 (TID 115) in 168 ms on quickstart.cloudera (executor 1) (92/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 98.0 in stage 2.0 (TID 122, quickstart.cloudera, executor 6, partition 98, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 93.0 in stage 2.0 (TID 117) in 130 ms on quickstart.cloudera (executor 6) (93/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 99.0 in stage 2.0 (TID 123, quickstart.cloudera, executor 4, partition 99, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 94.0 in stage 2.0 (TID 118) in 175 ms on quickstart.cloudera (executor 4) (94/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 100.0 in stage 2.0 (TID 124, quickstart.cloudera, executor 3, partition 100, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 95.0 in stage 2.0 (TID 119) in 161 ms on quickstart.cloudera (executor 3) (95/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 101.0 in stage 2.0 (TID 125, quickstart.cloudera, executor 2, partition 101, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 92.0 in stage 2.0 (TID 116) in 238 ms on quickstart.cloudera (executor 2) (96/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 102.0 in stage 2.0 (TID 126, quickstart.cloudera, executor 1, partition 102, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 96.0 in stage 2.0 (TID 120) in 148 ms on quickstart.cloudera (executor 1) (97/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 103.0 in stage 2.0 (TID 127, quickstart.cloudera, executor 6, partition 103, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 98.0 in stage 2.0 (TID 122) in 112 ms on quickstart.cloudera (executor 6) (98/200)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Starting task 104.0 in stage 2.0 (TID 128, quickstart.cloudera, executor 5, partition 104, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:54 INFO scheduler.TaskSetManager: Finished task 97.0 in stage 2.0 (TID 121) in 157 ms on quickstart.cloudera (executor 5) (99/200)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Starting task 105.0 in stage 2.0 (TID 129, quickstart.cloudera, executor 2, partition 105, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Finished task 101.0 in stage 2.0 (TID 125) in 109 ms on quickstart.cloudera (executor 2) (100/200)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Starting task 106.0 in stage 2.0 (TID 130, quickstart.cloudera, executor 6, partition 106, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Finished task 103.0 in stage 2.0 (TID 127) in 111 ms on quickstart.cloudera (executor 6) (101/200)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Starting task 107.0 in stage 2.0 (TID 131, quickstart.cloudera, executor 5, partition 107, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Finished task 104.0 in stage 2.0 (TID 128) in 140 ms on quickstart.cloudera (executor 5) (102/200)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Starting task 108.0 in stage 2.0 (TID 132, quickstart.cloudera, executor 3, partition 108, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Starting task 109.0 in stage 2.0 (TID 133, quickstart.cloudera, executor 1, partition 109, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Finished task 100.0 in stage 2.0 (TID 124) in 191 ms on quickstart.cloudera (executor 3) (103/200)
17/08/15 12:48:55 INFO scheduler.TaskSetManager: Finished task 102.0 in stage 2.0 (TID 126) in 157 ms on quickstart.cloudera (executor 1) (104/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 110.0 in stage 2.0 (TID 134, quickstart.cloudera, executor 4, partition 110, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 99.0 in stage 2.0 (TID 123) in 45782 ms on quickstart.cloudera (executor 4) (105/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 106.0 in stage 2.0 (TID 130) in 45613 ms on quickstart.cloudera (executor 6) (106/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 111.0 in stage 2.0 (TID 135, quickstart.cloudera, executor 6, partition 111, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 112.0 in stage 2.0 (TID 136, quickstart.cloudera, executor 1, partition 112, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 113.0 in stage 2.0 (TID 137, quickstart.cloudera, executor 2, partition 113, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 114.0 in stage 2.0 (TID 138, quickstart.cloudera, executor 5, partition 114, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 109.0 in stage 2.0 (TID 133) in 45574 ms on quickstart.cloudera (executor 1) (107/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 115.0 in stage 2.0 (TID 139, quickstart.cloudera, executor 3, partition 115, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 108.0 in stage 2.0 (TID 132) in 45582 ms on quickstart.cloudera (executor 3) (108/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 105.0 in stage 2.0 (TID 129) in 45663 ms on quickstart.cloudera (executor 2) (109/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 107.0 in stage 2.0 (TID 131) in 45618 ms on quickstart.cloudera (executor 5) (110/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 116.0 in stage 2.0 (TID 140, quickstart.cloudera, executor 1, partition 116, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 112.0 in stage 2.0 (TID 136) in 194 ms on quickstart.cloudera (executor 1) (111/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 117.0 in stage 2.0 (TID 141, quickstart.cloudera, executor 4, partition 117, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 118.0 in stage 2.0 (TID 142, quickstart.cloudera, executor 5, partition 118, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 110.0 in stage 2.0 (TID 134) in 228 ms on quickstart.cloudera (executor 4) (112/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 114.0 in stage 2.0 (TID 138) in 223 ms on quickstart.cloudera (executor 5) (113/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 119.0 in stage 2.0 (TID 143, quickstart.cloudera, executor 3, partition 119, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 115.0 in stage 2.0 (TID 139) in 258 ms on quickstart.cloudera (executor 3) (114/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 120.0 in stage 2.0 (TID 144, quickstart.cloudera, executor 2, partition 120, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 113.0 in stage 2.0 (TID 137) in 267 ms on quickstart.cloudera (executor 2) (115/200)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Starting task 121.0 in stage 2.0 (TID 145, quickstart.cloudera, executor 1, partition 121, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:40 INFO scheduler.TaskSetManager: Finished task 116.0 in stage 2.0 (TID 140) in 88 ms on quickstart.cloudera (executor 1) (116/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 122.0 in stage 2.0 (TID 146, quickstart.cloudera, executor 5, partition 122, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 118.0 in stage 2.0 (TID 142) in 112 ms on quickstart.cloudera (executor 5) (117/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 123.0 in stage 2.0 (TID 147, quickstart.cloudera, executor 3, partition 123, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 119.0 in stage 2.0 (TID 143) in 109 ms on quickstart.cloudera (executor 3) (118/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 124.0 in stage 2.0 (TID 148, quickstart.cloudera, executor 2, partition 124, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 120.0 in stage 2.0 (TID 144) in 108 ms on quickstart.cloudera (executor 2) (119/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 125.0 in stage 2.0 (TID 149, quickstart.cloudera, executor 1, partition 125, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 121.0 in stage 2.0 (TID 145) in 107 ms on quickstart.cloudera (executor 1) (120/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 126.0 in stage 2.0 (TID 150, quickstart.cloudera, executor 5, partition 126, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 122.0 in stage 2.0 (TID 146) in 111 ms on quickstart.cloudera (executor 5) (121/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 127.0 in stage 2.0 (TID 151, quickstart.cloudera, executor 3, partition 127, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 123.0 in stage 2.0 (TID 147) in 82 ms on quickstart.cloudera (executor 3) (122/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 128.0 in stage 2.0 (TID 152, quickstart.cloudera, executor 2, partition 128, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 124.0 in stage 2.0 (TID 148) in 83 ms on quickstart.cloudera (executor 2) (123/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 129.0 in stage 2.0 (TID 153, quickstart.cloudera, executor 3, partition 129, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 127.0 in stage 2.0 (TID 151) in 57 ms on quickstart.cloudera (executor 3) (124/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 130.0 in stage 2.0 (TID 154, quickstart.cloudera, executor 5, partition 130, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 126.0 in stage 2.0 (TID 150) in 79 ms on quickstart.cloudera (executor 5) (125/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 131.0 in stage 2.0 (TID 155, quickstart.cloudera, executor 3, partition 131, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 129.0 in stage 2.0 (TID 153) in 69 ms on quickstart.cloudera (executor 3) (126/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 132.0 in stage 2.0 (TID 156, quickstart.cloudera, executor 2, partition 132, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 128.0 in stage 2.0 (TID 152) in 120 ms on quickstart.cloudera (executor 2) (127/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 133.0 in stage 2.0 (TID 157, quickstart.cloudera, executor 5, partition 133, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 130.0 in stage 2.0 (TID 154) in 113 ms on quickstart.cloudera (executor 5) (128/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 134.0 in stage 2.0 (TID 158, quickstart.cloudera, executor 6, partition 134, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 111.0 in stage 2.0 (TID 135) in 637 ms on quickstart.cloudera (executor 6) (129/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 135.0 in stage 2.0 (TID 159, quickstart.cloudera, executor 2, partition 135, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 132.0 in stage 2.0 (TID 156) in 73 ms on quickstart.cloudera (executor 2) (130/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 136.0 in stage 2.0 (TID 160, quickstart.cloudera, executor 6, partition 136, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 134.0 in stage 2.0 (TID 158) in 63 ms on quickstart.cloudera (executor 6) (131/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 137.0 in stage 2.0 (TID 161, quickstart.cloudera, executor 5, partition 137, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 133.0 in stage 2.0 (TID 157) in 74 ms on quickstart.cloudera (executor 5) (132/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 138.0 in stage 2.0 (TID 162, quickstart.cloudera, executor 2, partition 138, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 135.0 in stage 2.0 (TID 159) in 79 ms on quickstart.cloudera (executor 2) (133/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 139.0 in stage 2.0 (TID 163, quickstart.cloudera, executor 5, partition 139, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 137.0 in stage 2.0 (TID 161) in 71 ms on quickstart.cloudera (executor 5) (134/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 140.0 in stage 2.0 (TID 164, quickstart.cloudera, executor 6, partition 140, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 136.0 in stage 2.0 (TID 160) in 81 ms on quickstart.cloudera (executor 6) (135/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 141.0 in stage 2.0 (TID 165, quickstart.cloudera, executor 4, partition 141, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 117.0 in stage 2.0 (TID 141) in 565 ms on quickstart.cloudera (executor 4) (136/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 142.0 in stage 2.0 (TID 166, quickstart.cloudera, executor 2, partition 142, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 138.0 in stage 2.0 (TID 162) in 91 ms on quickstart.cloudera (executor 2) (137/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 143.0 in stage 2.0 (TID 167, quickstart.cloudera, executor 6, partition 143, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 140.0 in stage 2.0 (TID 164) in 72 ms on quickstart.cloudera (executor 6) (138/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 144.0 in stage 2.0 (TID 168, quickstart.cloudera, executor 5, partition 144, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 139.0 in stage 2.0 (TID 163) in 79 ms on quickstart.cloudera (executor 5) (139/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 145.0 in stage 2.0 (TID 169, quickstart.cloudera, executor 1, partition 145, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 125.0 in stage 2.0 (TID 149) in 499 ms on quickstart.cloudera (executor 1) (140/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 146.0 in stage 2.0 (TID 170, quickstart.cloudera, executor 4, partition 146, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 141.0 in stage 2.0 (TID 165) in 100 ms on quickstart.cloudera (executor 4) (141/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 147.0 in stage 2.0 (TID 171, quickstart.cloudera, executor 2, partition 147, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 142.0 in stage 2.0 (TID 166) in 104 ms on quickstart.cloudera (executor 2) (142/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 148.0 in stage 2.0 (TID 172, quickstart.cloudera, executor 6, partition 148, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 143.0 in stage 2.0 (TID 167) in 78 ms on quickstart.cloudera (executor 6) (143/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 149.0 in stage 2.0 (TID 173, quickstart.cloudera, executor 5, partition 149, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 144.0 in stage 2.0 (TID 168) in 121 ms on quickstart.cloudera (executor 5) (144/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 150.0 in stage 2.0 (TID 174, quickstart.cloudera, executor 1, partition 150, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 145.0 in stage 2.0 (TID 169) in 105 ms on quickstart.cloudera (executor 1) (145/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 151.0 in stage 2.0 (TID 175, quickstart.cloudera, executor 4, partition 151, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 146.0 in stage 2.0 (TID 170) in 108 ms on quickstart.cloudera (executor 4) (146/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 152.0 in stage 2.0 (TID 176, quickstart.cloudera, executor 6, partition 152, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 148.0 in stage 2.0 (TID 172) in 74 ms on quickstart.cloudera (executor 6) (147/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 153.0 in stage 2.0 (TID 177, quickstart.cloudera, executor 2, partition 153, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 147.0 in stage 2.0 (TID 171) in 115 ms on quickstart.cloudera (executor 2) (148/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 154.0 in stage 2.0 (TID 178, quickstart.cloudera, executor 3, partition 154, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 131.0 in stage 2.0 (TID 155) in 497 ms on quickstart.cloudera (executor 3) (149/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 155.0 in stage 2.0 (TID 179, quickstart.cloudera, executor 4, partition 155, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 156.0 in stage 2.0 (TID 180, quickstart.cloudera, executor 1, partition 156, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 150.0 in stage 2.0 (TID 174) in 117 ms on quickstart.cloudera (executor 1) (150/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 151.0 in stage 2.0 (TID 175) in 114 ms on quickstart.cloudera (executor 4) (151/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 157.0 in stage 2.0 (TID 181, quickstart.cloudera, executor 2, partition 157, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 153.0 in stage 2.0 (TID 177) in 110 ms on quickstart.cloudera (executor 2) (152/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 158.0 in stage 2.0 (TID 182, quickstart.cloudera, executor 3, partition 158, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 154.0 in stage 2.0 (TID 178) in 84 ms on quickstart.cloudera (executor 3) (153/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 159.0 in stage 2.0 (TID 183, quickstart.cloudera, executor 4, partition 159, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 155.0 in stage 2.0 (TID 179) in 107 ms on quickstart.cloudera (executor 4) (154/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 160.0 in stage 2.0 (TID 184, quickstart.cloudera, executor 3, partition 160, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 158.0 in stage 2.0 (TID 182) in 86 ms on quickstart.cloudera (executor 3) (155/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 161.0 in stage 2.0 (TID 185, quickstart.cloudera, executor 2, partition 161, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 157.0 in stage 2.0 (TID 181) in 107 ms on quickstart.cloudera (executor 2) (156/200)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Starting task 162.0 in stage 2.0 (TID 186, quickstart.cloudera, executor 3, partition 162, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:41 INFO scheduler.TaskSetManager: Finished task 160.0 in stage 2.0 (TID 184) in 79 ms on quickstart.cloudera (executor 3) (157/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 163.0 in stage 2.0 (TID 187, quickstart.cloudera, executor 2, partition 163, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 161.0 in stage 2.0 (TID 185) in 106 ms on quickstart.cloudera (executor 2) (158/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 164.0 in stage 2.0 (TID 188, quickstart.cloudera, executor 3, partition 164, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 162.0 in stage 2.0 (TID 186) in 62 ms on quickstart.cloudera (executor 3) (159/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 165.0 in stage 2.0 (TID 189, quickstart.cloudera, executor 2, partition 165, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 163.0 in stage 2.0 (TID 187) in 72 ms on quickstart.cloudera (executor 2) (160/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 166.0 in stage 2.0 (TID 190, quickstart.cloudera, executor 3, partition 166, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 167.0 in stage 2.0 (TID 191, quickstart.cloudera, executor 5, partition 167, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 149.0 in stage 2.0 (TID 173) in 467 ms on quickstart.cloudera (executor 5) (161/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 164.0 in stage 2.0 (TID 188) in 73 ms on quickstart.cloudera (executor 3) (162/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 168.0 in stage 2.0 (TID 192, quickstart.cloudera, executor 5, partition 168, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 167.0 in stage 2.0 (TID 191) in 60 ms on quickstart.cloudera (executor 5) (163/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 169.0 in stage 2.0 (TID 193, quickstart.cloudera, executor 3, partition 169, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 166.0 in stage 2.0 (TID 190) in 69 ms on quickstart.cloudera (executor 3) (164/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 170.0 in stage 2.0 (TID 194, quickstart.cloudera, executor 6, partition 170, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 152.0 in stage 2.0 (TID 176) in 519 ms on quickstart.cloudera (executor 6) (165/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 171.0 in stage 2.0 (TID 195, quickstart.cloudera, executor 5, partition 171, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 168.0 in stage 2.0 (TID 192) in 77 ms on quickstart.cloudera (executor 5) (166/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 172.0 in stage 2.0 (TID 196, quickstart.cloudera, executor 6, partition 172, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 170.0 in stage 2.0 (TID 194) in 80 ms on quickstart.cloudera (executor 6) (167/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 173.0 in stage 2.0 (TID 197, quickstart.cloudera, executor 1, partition 173, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 156.0 in stage 2.0 (TID 180) in 507 ms on quickstart.cloudera (executor 1) (168/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 174.0 in stage 2.0 (TID 198, quickstart.cloudera, executor 3, partition 174, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 169.0 in stage 2.0 (TID 193) in 122 ms on quickstart.cloudera (executor 3) (169/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 175.0 in stage 2.0 (TID 199, quickstart.cloudera, executor 5, partition 175, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 171.0 in stage 2.0 (TID 195) in 116 ms on quickstart.cloudera (executor 5) (170/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 176.0 in stage 2.0 (TID 200, quickstart.cloudera, executor 1, partition 176, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 173.0 in stage 2.0 (TID 197) in 118 ms on quickstart.cloudera (executor 1) (171/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 177.0 in stage 2.0 (TID 201, quickstart.cloudera, executor 3, partition 177, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 174.0 in stage 2.0 (TID 198) in 102 ms on quickstart.cloudera (executor 3) (172/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 178.0 in stage 2.0 (TID 202, quickstart.cloudera, executor 4, partition 178, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 179.0 in stage 2.0 (TID 203, quickstart.cloudera, executor 6, partition 179, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 159.0 in stage 2.0 (TID 183) in 527 ms on quickstart.cloudera (executor 4) (173/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 172.0 in stage 2.0 (TID 196) in 144 ms on quickstart.cloudera (executor 6) (174/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 180.0 in stage 2.0 (TID 204, quickstart.cloudera, executor 5, partition 180, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 175.0 in stage 2.0 (TID 199) in 121 ms on quickstart.cloudera (executor 5) (175/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 181.0 in stage 2.0 (TID 205, quickstart.cloudera, executor 4, partition 181, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 182.0 in stage 2.0 (TID 206, quickstart.cloudera, executor 1, partition 182, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 178.0 in stage 2.0 (TID 202) in 124 ms on quickstart.cloudera (executor 4) (176/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 176.0 in stage 2.0 (TID 200) in 133 ms on quickstart.cloudera (executor 1) (177/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 183.0 in stage 2.0 (TID 207, quickstart.cloudera, executor 3, partition 183, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 177.0 in stage 2.0 (TID 201) in 153 ms on quickstart.cloudera (executor 3) (178/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 184.0 in stage 2.0 (TID 208, quickstart.cloudera, executor 5, partition 184, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 180.0 in stage 2.0 (TID 204) in 101 ms on quickstart.cloudera (executor 5) (179/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 185.0 in stage 2.0 (TID 209, quickstart.cloudera, executor 2, partition 185, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 165.0 in stage 2.0 (TID 189) in 508 ms on quickstart.cloudera (executor 2) (180/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 186.0 in stage 2.0 (TID 210, quickstart.cloudera, executor 4, partition 186, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 181.0 in stage 2.0 (TID 205) in 100 ms on quickstart.cloudera (executor 4) (181/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 187.0 in stage 2.0 (TID 211, quickstart.cloudera, executor 3, partition 187, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 183.0 in stage 2.0 (TID 207) in 104 ms on quickstart.cloudera (executor 3) (182/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 188.0 in stage 2.0 (TID 212, quickstart.cloudera, executor 2, partition 188, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 185.0 in stage 2.0 (TID 209) in 93 ms on quickstart.cloudera (executor 2) (183/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 189.0 in stage 2.0 (TID 213, quickstart.cloudera, executor 4, partition 189, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 186.0 in stage 2.0 (TID 210) in 123 ms on quickstart.cloudera (executor 4) (184/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 190.0 in stage 2.0 (TID 214, quickstart.cloudera, executor 3, partition 190, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 187.0 in stage 2.0 (TID 211) in 128 ms on quickstart.cloudera (executor 3) (185/200)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Starting task 191.0 in stage 2.0 (TID 215, quickstart.cloudera, executor 2, partition 191, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:42 INFO scheduler.TaskSetManager: Finished task 188.0 in stage 2.0 (TID 212) in 170 ms on quickstart.cloudera (executor 2) (186/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 192.0 in stage 2.0 (TID 216, quickstart.cloudera, executor 6, partition 192, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 179.0 in stage 2.0 (TID 203) in 597 ms on quickstart.cloudera (executor 6) (187/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 193.0 in stage 2.0 (TID 217, quickstart.cloudera, executor 3, partition 193, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 190.0 in stage 2.0 (TID 214) in 236 ms on quickstart.cloudera (executor 3) (188/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 194.0 in stage 2.0 (TID 218, quickstart.cloudera, executor 5, partition 194, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 184.0 in stage 2.0 (TID 208) in 560 ms on quickstart.cloudera (executor 5) (189/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 195.0 in stage 2.0 (TID 219, quickstart.cloudera, executor 1, partition 195, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 182.0 in stage 2.0 (TID 206) in 636 ms on quickstart.cloudera (executor 1) (190/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 196.0 in stage 2.0 (TID 220, quickstart.cloudera, executor 3, partition 196, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 193.0 in stage 2.0 (TID 217) in 221 ms on quickstart.cloudera (executor 3) (191/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 197.0 in stage 2.0 (TID 221, quickstart.cloudera, executor 4, partition 197, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 189.0 in stage 2.0 (TID 213) in 539 ms on quickstart.cloudera (executor 4) (192/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 198.0 in stage 2.0 (TID 222, quickstart.cloudera, executor 5, partition 198, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 194.0 in stage 2.0 (TID 218) in 147 ms on quickstart.cloudera (executor 5) (193/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 199.0 in stage 2.0 (TID 223, quickstart.cloudera, executor 1, partition 199, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 195.0 in stage 2.0 (TID 219) in 203 ms on quickstart.cloudera (executor 1) (194/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 11.0 in stage 4.0 (TID 224, quickstart.cloudera, executor 3, partition 11, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 196.0 in stage 2.0 (TID 220) in 238 ms on quickstart.cloudera (executor 3) (195/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 12.0 in stage 4.0 (TID 225, quickstart.cloudera, executor 5, partition 12, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 198.0 in stage 2.0 (TID 222) in 201 ms on quickstart.cloudera (executor 5) (196/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 13.0 in stage 4.0 (TID 226, quickstart.cloudera, executor 4, partition 13, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 197.0 in stage 2.0 (TID 221) in 216 ms on quickstart.cloudera (executor 4) (197/200)
17/08/15 12:49:43 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35767
17/08/15 12:49:43 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35776
17/08/15 12:49:43 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35763
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 14.0 in stage 4.0 (TID 227, quickstart.cloudera, executor 2, partition 14, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 191.0 in stage 2.0 (TID 215) in 756 ms on quickstart.cloudera (executor 2) (198/200)
17/08/15 12:49:43 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35760
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 15.0 in stage 4.0 (TID 228, quickstart.cloudera, executor 5, partition 15, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 12.0 in stage 4.0 (TID 225) in 124 ms on quickstart.cloudera (executor 5) (12/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 16.0 in stage 4.0 (TID 229, quickstart.cloudera, executor 6, partition 16, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 192.0 in stage 2.0 (TID 216) in 734 ms on quickstart.cloudera (executor 6) (199/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 17.0 in stage 4.0 (TID 230, quickstart.cloudera, executor 4, partition 17, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 13.0 in stage 4.0 (TID 226) in 244 ms on quickstart.cloudera (executor 4) (13/200)
17/08/15 12:49:43 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35774
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 18.0 in stage 4.0 (TID 231, quickstart.cloudera, executor 2, partition 18, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 14.0 in stage 4.0 (TID 227) in 222 ms on quickstart.cloudera (executor 2) (14/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 19.0 in stage 4.0 (TID 232, quickstart.cloudera, executor 5, partition 19, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 15.0 in stage 4.0 (TID 228) in 225 ms on quickstart.cloudera (executor 5) (15/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 20.0 in stage 4.0 (TID 233, quickstart.cloudera, executor 6, partition 20, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 16.0 in stage 4.0 (TID 229) in 122 ms on quickstart.cloudera (executor 6) (16/200)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 21.0 in stage 4.0 (TID 234, quickstart.cloudera, executor 5, partition 21, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Starting task 22.0 in stage 4.0 (TID 235, quickstart.cloudera, executor 1, partition 22, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 199.0 in stage 2.0 (TID 223) in 617 ms on quickstart.cloudera (executor 1) (200/200)
17/08/15 12:49:43 INFO cluster.YarnScheduler: Removed TaskSet 2.0, whose tasks have all completed, from pool
17/08/15 12:49:43 INFO scheduler.TaskSetManager: Finished task 19.0 in stage 4.0 (TID 232) in 151 ms on quickstart.cloudera (executor 5) (17/200)
17/08/15 12:49:44 INFO scheduler.DAGScheduler: ResultStage 2 (start at com.gss.mainController.StreamingJob1.java:51) finished in 64.459 s
17/08/15 12:49:44 INFO scheduler.DAGScheduler: Job 1 finished: start at com.gss.mainController.StreamingJob1.java:51, took 81.597098 s
17/08/15 12:49:44 INFO spark.MapOutputTrackerMasterEndpoint: Asked to send map output locations for shuffle 0 to 192.168.1.116:35764
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 23.0 in stage 4.0 (TID 236, quickstart.cloudera, executor 3, partition 23, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 11.0 in stage 4.0 (TID 224) in 624 ms on quickstart.cloudera (executor 3) (18/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 24.0 in stage 4.0 (TID 237, quickstart.cloudera, executor 5, partition 24, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 21.0 in stage 4.0 (TID 234) in 175 ms on quickstart.cloudera (executor 5) (19/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 25.0 in stage 4.0 (TID 238, quickstart.cloudera, executor 1, partition 25, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 22.0 in stage 4.0 (TID 235) in 239 ms on quickstart.cloudera (executor 1) (20/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 26.0 in stage 4.0 (TID 239, quickstart.cloudera, executor 4, partition 26, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 17.0 in stage 4.0 (TID 230) in 559 ms on quickstart.cloudera (executor 4) (21/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 27.0 in stage 4.0 (TID 240, quickstart.cloudera, executor 2, partition 27, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 18.0 in stage 4.0 (TID 231) in 525 ms on quickstart.cloudera (executor 2) (22/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 28.0 in stage 4.0 (TID 241, quickstart.cloudera, executor 3, partition 28, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 23.0 in stage 4.0 (TID 236) in 267 ms on quickstart.cloudera (executor 3) (23/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 29.0 in stage 4.0 (TID 242, quickstart.cloudera, executor 5, partition 29, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 24.0 in stage 4.0 (TID 237) in 212 ms on quickstart.cloudera (executor 5) (24/200)
17/08/15 12:49:44 INFO spark.SparkContext: Starting job: start at com.gss.mainController.StreamingJob1.java:51
17/08/15 12:49:44 INFO scheduler.DAGScheduler: Got job 3 (start at com.gss.mainController.StreamingJob1.java:51) with 1 output partitions
17/08/15 12:49:44 INFO scheduler.DAGScheduler: Final stage: ResultStage 5 (start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:49:44 INFO scheduler.DAGScheduler: Parents of final stage: List()
17/08/15 12:49:44 INFO scheduler.DAGScheduler: Missing parents: List()
17/08/15 12:49:44 INFO scheduler.DAGScheduler: Submitting ResultStage 5 (MapPartitionsRDD[27] at start at com.gss.mainController.StreamingJob1.java:51), which has no missing parents
17/08/15 12:49:44 INFO memory.MemoryStore: Block broadcast_11 stored as values in memory (estimated size 7.8 KB, free 364.1 MB)
17/08/15 12:49:44 INFO memory.MemoryStore: Block broadcast_11_piece0 stored as bytes in memory (estimated size 4.3 KB, free 364.1 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Added broadcast_11_piece0 in memory on 192.168.1.116:60495 (size: 4.3 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO spark.SparkContext: Created broadcast 11 from broadcast at DAGScheduler.scala:996
17/08/15 12:49:44 INFO scheduler.DAGScheduler: Submitting 1 missing tasks from ResultStage 5 (MapPartitionsRDD[27] at start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:49:44 INFO cluster.YarnScheduler: Adding task set 5.0 with 1 tasks
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 30.0 in stage 4.0 (TID 243, quickstart.cloudera, executor 6, partition 30, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 20.0 in stage 4.0 (TID 233) in 564 ms on quickstart.cloudera (executor 6) (25/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 31.0 in stage 4.0 (TID 244, quickstart.cloudera, executor 4, partition 31, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 26.0 in stage 4.0 (TID 239) in 124 ms on quickstart.cloudera (executor 4) (26/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 32.0 in stage 4.0 (TID 245, quickstart.cloudera, executor 3, partition 32, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 28.0 in stage 4.0 (TID 241) in 89 ms on quickstart.cloudera (executor 3) (27/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 33.0 in stage 4.0 (TID 246, quickstart.cloudera, executor 5, partition 33, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 29.0 in stage 4.0 (TID 242) in 93 ms on quickstart.cloudera (executor 5) (28/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 34.0 in stage 4.0 (TID 247, quickstart.cloudera, executor 4, partition 34, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 31.0 in stage 4.0 (TID 244) in 74 ms on quickstart.cloudera (executor 4) (29/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 35.0 in stage 4.0 (TID 248, quickstart.cloudera, executor 3, partition 35, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 32.0 in stage 4.0 (TID 245) in 70 ms on quickstart.cloudera (executor 3) (30/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 36.0 in stage 4.0 (TID 249, quickstart.cloudera, executor 6, partition 36, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 30.0 in stage 4.0 (TID 243) in 101 ms on quickstart.cloudera (executor 6) (31/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 37.0 in stage 4.0 (TID 250, quickstart.cloudera, executor 4, partition 37, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 34.0 in stage 4.0 (TID 247) in 63 ms on quickstart.cloudera (executor 4) (32/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 38.0 in stage 4.0 (TID 251, quickstart.cloudera, executor 3, partition 38, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 35.0 in stage 4.0 (TID 248) in 54 ms on quickstart.cloudera (executor 3) (33/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 39.0 in stage 4.0 (TID 252, quickstart.cloudera, executor 4, partition 39, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 37.0 in stage 4.0 (TID 250) in 43 ms on quickstart.cloudera (executor 4) (34/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 40.0 in stage 4.0 (TID 253, quickstart.cloudera, executor 3, partition 40, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 38.0 in stage 4.0 (TID 251) in 43 ms on quickstart.cloudera (executor 3) (35/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 41.0 in stage 4.0 (TID 254, quickstart.cloudera, executor 4, partition 41, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 39.0 in stage 4.0 (TID 252) in 39 ms on quickstart.cloudera (executor 4) (36/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 42.0 in stage 4.0 (TID 255, quickstart.cloudera, executor 3, partition 42, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 40.0 in stage 4.0 (TID 253) in 39 ms on quickstart.cloudera (executor 3) (37/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 43.0 in stage 4.0 (TID 256, quickstart.cloudera, executor 4, partition 43, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 41.0 in stage 4.0 (TID 254) in 38 ms on quickstart.cloudera (executor 4) (38/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 44.0 in stage 4.0 (TID 257, quickstart.cloudera, executor 3, partition 44, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 42.0 in stage 4.0 (TID 255) in 46 ms on quickstart.cloudera (executor 3) (39/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 45.0 in stage 4.0 (TID 258, quickstart.cloudera, executor 3, partition 45, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 44.0 in stage 4.0 (TID 257) in 33 ms on quickstart.cloudera (executor 3) (40/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 46.0 in stage 4.0 (TID 259, quickstart.cloudera, executor 4, partition 46, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 43.0 in stage 4.0 (TID 256) in 49 ms on quickstart.cloudera (executor 4) (41/200)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_4_piece0 on 192.168.1.116:60495 in memory (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_4_piece0 on quickstart.cloudera:44013 in memory (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 47.0 in stage 4.0 (TID 260, quickstart.cloudera, executor 1, partition 47, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_4_piece0 on quickstart.cloudera:34617 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 25.0 in stage 4.0 (TID 238) in 568 ms on quickstart.cloudera (executor 1) (42/200)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_4_piece0 on quickstart.cloudera:50242 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_4_piece0 on quickstart.cloudera:52065 in memory (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_4_piece0 on quickstart.cloudera:54741 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_4_piece0 on quickstart.cloudera:59510 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_5_piece0 on 192.168.1.116:60495 in memory (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_5_piece0 on quickstart.cloudera:54741 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_5_piece0 on quickstart.cloudera:52065 in memory (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_5_piece0 on quickstart.cloudera:34617 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_5_piece0 on quickstart.cloudera:50242 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_5_piece0 on quickstart.cloudera:59510 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_5_piece0 on quickstart.cloudera:44013 in memory (size: 28.8 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 48.0 in stage 4.0 (TID 261, quickstart.cloudera, executor 3, partition 48, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 45.0 in stage 4.0 (TID 258) in 95 ms on quickstart.cloudera (executor 3) (43/200)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_7_piece0 on 192.168.1.116:60495 in memory (size: 9.4 KB, free: 366.1 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_7_piece0 on quickstart.cloudera:52065 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_7_piece0 on quickstart.cloudera:44013 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_7_piece0 on quickstart.cloudera:50242 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_7_piece0 on quickstart.cloudera:54741 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_7_piece0 on quickstart.cloudera:34617 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_7_piece0 on quickstart.cloudera:59510 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_8_piece0 on 192.168.1.116:60495 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 49.0 in stage 4.0 (TID 262, quickstart.cloudera, executor 2, partition 49, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 27.0 in stage 4.0 (TID 240) in 534 ms on quickstart.cloudera (executor 2) (44/200)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_8_piece0 on quickstart.cloudera:52065 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_8_piece0 on quickstart.cloudera:44013 in memory (size: 9.4 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_10_piece0 on 192.168.1.116:60495 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_10_piece0 on quickstart.cloudera:34617 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_10_piece0 on quickstart.cloudera:52065 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_10_piece0 on quickstart.cloudera:44013 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_10_piece0 on quickstart.cloudera:59510 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_10_piece0 on quickstart.cloudera:50242 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO storage.BlockManagerInfo: Removed broadcast_10_piece0 on quickstart.cloudera:54741 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 50.0 in stage 4.0 (TID 263, quickstart.cloudera, executor 3, partition 50, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 48.0 in stage 4.0 (TID 261) in 78 ms on quickstart.cloudera (executor 3) (45/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 51.0 in stage 4.0 (TID 264, quickstart.cloudera, executor 5, partition 51, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 33.0 in stage 4.0 (TID 246) in 464 ms on quickstart.cloudera (executor 5) (46/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 52.0 in stage 4.0 (TID 265, quickstart.cloudera, executor 2, partition 52, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 49.0 in stage 4.0 (TID 262) in 71 ms on quickstart.cloudera (executor 2) (47/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 53.0 in stage 4.0 (TID 266, quickstart.cloudera, executor 3, partition 53, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 50.0 in stage 4.0 (TID 263) in 48 ms on quickstart.cloudera (executor 3) (48/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 54.0 in stage 4.0 (TID 267, quickstart.cloudera, executor 5, partition 54, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 51.0 in stage 4.0 (TID 264) in 45 ms on quickstart.cloudera (executor 5) (49/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 55.0 in stage 4.0 (TID 268, quickstart.cloudera, executor 6, partition 55, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 36.0 in stage 4.0 (TID 249) in 459 ms on quickstart.cloudera (executor 6) (50/200)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Starting task 56.0 in stage 4.0 (TID 269, quickstart.cloudera, executor 3, partition 56, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:44 INFO scheduler.TaskSetManager: Finished task 53.0 in stage 4.0 (TID 266) in 47 ms on quickstart.cloudera (executor 3) (51/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 57.0 in stage 4.0 (TID 270, quickstart.cloudera, executor 2, partition 57, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 52.0 in stage 4.0 (TID 265) in 69 ms on quickstart.cloudera (executor 2) (52/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 58.0 in stage 4.0 (TID 271, quickstart.cloudera, executor 3, partition 58, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 56.0 in stage 4.0 (TID 269) in 50 ms on quickstart.cloudera (executor 3) (53/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 59.0 in stage 4.0 (TID 272, quickstart.cloudera, executor 5, partition 59, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 54.0 in stage 4.0 (TID 267) in 76 ms on quickstart.cloudera (executor 5) (54/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 60.0 in stage 4.0 (TID 273, quickstart.cloudera, executor 2, partition 60, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 57.0 in stage 4.0 (TID 270) in 56 ms on quickstart.cloudera (executor 2) (55/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 61.0 in stage 4.0 (TID 274, quickstart.cloudera, executor 6, partition 61, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 55.0 in stage 4.0 (TID 268) in 104 ms on quickstart.cloudera (executor 6) (56/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 62.0 in stage 4.0 (TID 275, quickstart.cloudera, executor 3, partition 62, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 58.0 in stage 4.0 (TID 271) in 50 ms on quickstart.cloudera (executor 3) (57/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 63.0 in stage 4.0 (TID 276, quickstart.cloudera, executor 2, partition 63, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 60.0 in stage 4.0 (TID 273) in 68 ms on quickstart.cloudera (executor 2) (58/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 64.0 in stage 4.0 (TID 277, quickstart.cloudera, executor 2, partition 64, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 63.0 in stage 4.0 (TID 276) in 36 ms on quickstart.cloudera (executor 2) (59/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 65.0 in stage 4.0 (TID 278, quickstart.cloudera, executor 2, partition 65, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 64.0 in stage 4.0 (TID 277) in 39 ms on quickstart.cloudera (executor 2) (60/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 66.0 in stage 4.0 (TID 279, quickstart.cloudera, executor 2, partition 66, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 65.0 in stage 4.0 (TID 278) in 34 ms on quickstart.cloudera (executor 2) (61/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 67.0 in stage 4.0 (TID 280, quickstart.cloudera, executor 4, partition 67, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 46.0 in stage 4.0 (TID 259) in 520 ms on quickstart.cloudera (executor 4) (62/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 68.0 in stage 4.0 (TID 281, quickstart.cloudera, executor 1, partition 68, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 47.0 in stage 4.0 (TID 260) in 523 ms on quickstart.cloudera (executor 1) (63/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 69.0 in stage 4.0 (TID 282, quickstart.cloudera, executor 4, partition 69, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 67.0 in stage 4.0 (TID 280) in 135 ms on quickstart.cloudera (executor 4) (64/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 70.0 in stage 4.0 (TID 283, quickstart.cloudera, executor 2, partition 70, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 66.0 in stage 4.0 (TID 279) in 159 ms on quickstart.cloudera (executor 2) (65/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 71.0 in stage 4.0 (TID 284, quickstart.cloudera, executor 4, partition 71, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 69.0 in stage 4.0 (TID 282) in 83 ms on quickstart.cloudera (executor 4) (66/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 72.0 in stage 4.0 (TID 285, quickstart.cloudera, executor 2, partition 72, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 70.0 in stage 4.0 (TID 283) in 173 ms on quickstart.cloudera (executor 2) (67/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 73.0 in stage 4.0 (TID 286, quickstart.cloudera, executor 5, partition 73, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 59.0 in stage 4.0 (TID 272) in 526 ms on quickstart.cloudera (executor 5) (68/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 74.0 in stage 4.0 (TID 287, quickstart.cloudera, executor 3, partition 74, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 62.0 in stage 4.0 (TID 275) in 484 ms on quickstart.cloudera (executor 3) (69/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 75.0 in stage 4.0 (TID 288, quickstart.cloudera, executor 6, partition 75, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 61.0 in stage 4.0 (TID 274) in 507 ms on quickstart.cloudera (executor 6) (70/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 76.0 in stage 4.0 (TID 289, quickstart.cloudera, executor 4, partition 76, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 71.0 in stage 4.0 (TID 284) in 155 ms on quickstart.cloudera (executor 4) (71/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 77.0 in stage 4.0 (TID 290, quickstart.cloudera, executor 3, partition 77, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 74.0 in stage 4.0 (TID 287) in 92 ms on quickstart.cloudera (executor 3) (72/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 78.0 in stage 4.0 (TID 291, quickstart.cloudera, executor 5, partition 78, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 73.0 in stage 4.0 (TID 286) in 111 ms on quickstart.cloudera (executor 5) (73/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 79.0 in stage 4.0 (TID 292, quickstart.cloudera, executor 6, partition 79, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 75.0 in stage 4.0 (TID 288) in 116 ms on quickstart.cloudera (executor 6) (74/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 80.0 in stage 4.0 (TID 293, quickstart.cloudera, executor 4, partition 80, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 81.0 in stage 4.0 (TID 294, quickstart.cloudera, executor 2, partition 81, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 76.0 in stage 4.0 (TID 289) in 100 ms on quickstart.cloudera (executor 4) (75/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 72.0 in stage 4.0 (TID 285) in 156 ms on quickstart.cloudera (executor 2) (76/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 82.0 in stage 4.0 (TID 295, quickstart.cloudera, executor 5, partition 82, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 78.0 in stage 4.0 (TID 291) in 78 ms on quickstart.cloudera (executor 5) (77/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 83.0 in stage 4.0 (TID 296, quickstart.cloudera, executor 6, partition 83, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 79.0 in stage 4.0 (TID 292) in 68 ms on quickstart.cloudera (executor 6) (78/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 84.0 in stage 4.0 (TID 297, quickstart.cloudera, executor 2, partition 84, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 81.0 in stage 4.0 (TID 294) in 73 ms on quickstart.cloudera (executor 2) (79/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 85.0 in stage 4.0 (TID 298, quickstart.cloudera, executor 5, partition 85, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 82.0 in stage 4.0 (TID 295) in 45 ms on quickstart.cloudera (executor 5) (80/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 86.0 in stage 4.0 (TID 299, quickstart.cloudera, executor 6, partition 86, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 83.0 in stage 4.0 (TID 296) in 45 ms on quickstart.cloudera (executor 6) (81/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 87.0 in stage 4.0 (TID 300, quickstart.cloudera, executor 2, partition 87, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 84.0 in stage 4.0 (TID 297) in 47 ms on quickstart.cloudera (executor 2) (82/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 88.0 in stage 4.0 (TID 301, quickstart.cloudera, executor 1, partition 88, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 68.0 in stage 4.0 (TID 281) in 523 ms on quickstart.cloudera (executor 1) (83/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 89.0 in stage 4.0 (TID 302, quickstart.cloudera, executor 6, partition 89, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 86.0 in stage 4.0 (TID 299) in 50 ms on quickstart.cloudera (executor 6) (84/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 90.0 in stage 4.0 (TID 303, quickstart.cloudera, executor 1, partition 90, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 88.0 in stage 4.0 (TID 301) in 40 ms on quickstart.cloudera (executor 1) (85/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 91.0 in stage 4.0 (TID 304, quickstart.cloudera, executor 2, partition 91, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 87.0 in stage 4.0 (TID 300) in 69 ms on quickstart.cloudera (executor 2) (86/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 92.0 in stage 4.0 (TID 305, quickstart.cloudera, executor 6, partition 92, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 89.0 in stage 4.0 (TID 302) in 49 ms on quickstart.cloudera (executor 6) (87/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 93.0 in stage 4.0 (TID 306, quickstart.cloudera, executor 2, partition 93, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 91.0 in stage 4.0 (TID 304) in 55 ms on quickstart.cloudera (executor 2) (88/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 94.0 in stage 4.0 (TID 307, quickstart.cloudera, executor 1, partition 94, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 90.0 in stage 4.0 (TID 303) in 95 ms on quickstart.cloudera (executor 1) (89/200)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Starting task 95.0 in stage 4.0 (TID 308, quickstart.cloudera, executor 6, partition 95, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:45 INFO scheduler.TaskSetManager: Finished task 92.0 in stage 4.0 (TID 305) in 65 ms on quickstart.cloudera (executor 6) (90/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 96.0 in stage 4.0 (TID 309, quickstart.cloudera, executor 2, partition 96, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 93.0 in stage 4.0 (TID 306) in 52 ms on quickstart.cloudera (executor 2) (91/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 97.0 in stage 4.0 (TID 310, quickstart.cloudera, executor 1, partition 97, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 94.0 in stage 4.0 (TID 307) in 50 ms on quickstart.cloudera (executor 1) (92/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 98.0 in stage 4.0 (TID 311, quickstart.cloudera, executor 6, partition 98, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 95.0 in stage 4.0 (TID 308) in 72 ms on quickstart.cloudera (executor 6) (93/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 99.0 in stage 4.0 (TID 312, quickstart.cloudera, executor 1, partition 99, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 97.0 in stage 4.0 (TID 310) in 48 ms on quickstart.cloudera (executor 1) (94/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 100.0 in stage 4.0 (TID 313, quickstart.cloudera, executor 4, partition 100, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 80.0 in stage 4.0 (TID 293) in 459 ms on quickstart.cloudera (executor 4) (95/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 101.0 in stage 4.0 (TID 314, quickstart.cloudera, executor 3, partition 101, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 77.0 in stage 4.0 (TID 290) in 511 ms on quickstart.cloudera (executor 3) (96/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 102.0 in stage 4.0 (TID 315, quickstart.cloudera, executor 3, partition 102, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 101.0 in stage 4.0 (TID 314) in 42 ms on quickstart.cloudera (executor 3) (97/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 103.0 in stage 4.0 (TID 316, quickstart.cloudera, executor 4, partition 103, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 100.0 in stage 4.0 (TID 313) in 68 ms on quickstart.cloudera (executor 4) (98/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 104.0 in stage 4.0 (TID 317, quickstart.cloudera, executor 5, partition 104, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 85.0 in stage 4.0 (TID 298) in 449 ms on quickstart.cloudera (executor 5) (99/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 105.0 in stage 4.0 (TID 318, quickstart.cloudera, executor 3, partition 105, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 102.0 in stage 4.0 (TID 315) in 38 ms on quickstart.cloudera (executor 3) (100/200)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Starting task 106.0 in stage 4.0 (TID 319, quickstart.cloudera, executor 3, partition 106, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:49:46 INFO scheduler.TaskSetManager: Finished task 105.0 in stage 4.0 (TID 318) in 40 ms on quickstart.cloudera (executor 3) (101/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 107.0 in stage 4.0 (TID 320, quickstart.cloudera, executor 5, partition 107, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 108.0 in stage 4.0 (TID 321, quickstart.cloudera, executor 3, partition 108, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 109.0 in stage 4.0 (TID 322, quickstart.cloudera, executor 2, partition 109, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 110.0 in stage 4.0 (TID 323, quickstart.cloudera, executor 6, partition 110, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 111.0 in stage 4.0 (TID 324, quickstart.cloudera, executor 1, partition 111, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 112.0 in stage 4.0 (TID 325, quickstart.cloudera, executor 4, partition 112, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 98.0 in stage 4.0 (TID 311) in 18824 ms on quickstart.cloudera (executor 6) (102/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 99.0 in stage 4.0 (TID 312) in 18811 ms on quickstart.cloudera (executor 1) (103/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 103.0 in stage 4.0 (TID 316) in 18636 ms on quickstart.cloudera (executor 4) (104/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 96.0 in stage 4.0 (TID 309) in 18868 ms on quickstart.cloudera (executor 2) (105/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 106.0 in stage 4.0 (TID 319) in 18582 ms on quickstart.cloudera (executor 3) (106/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 104.0 in stage 4.0 (TID 317) in 18631 ms on quickstart.cloudera (executor 5) (107/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 113.0 in stage 4.0 (TID 326, quickstart.cloudera, executor 3, partition 113, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Starting task 114.0 in stage 4.0 (TID 327, quickstart.cloudera, executor 2, partition 114, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 108.0 in stage 4.0 (TID 321) in 120 ms on quickstart.cloudera (executor 3) (108/200)
17/08/15 12:50:04 INFO scheduler.TaskSetManager: Finished task 109.0 in stage 4.0 (TID 322) in 120 ms on quickstart.cloudera (executor 2) (109/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 115.0 in stage 4.0 (TID 328, quickstart.cloudera, executor 1, partition 115, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 111.0 in stage 4.0 (TID 324) in 163 ms on quickstart.cloudera (executor 1) (110/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 116.0 in stage 4.0 (TID 329, quickstart.cloudera, executor 6, partition 116, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 110.0 in stage 4.0 (TID 323) in 168 ms on quickstart.cloudera (executor 6) (111/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 117.0 in stage 4.0 (TID 330, quickstart.cloudera, executor 4, partition 117, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 112.0 in stage 4.0 (TID 325) in 169 ms on quickstart.cloudera (executor 4) (112/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 118.0 in stage 4.0 (TID 331, quickstart.cloudera, executor 3, partition 118, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 113.0 in stage 4.0 (TID 326) in 80 ms on quickstart.cloudera (executor 3) (113/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 119.0 in stage 4.0 (TID 332, quickstart.cloudera, executor 2, partition 119, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 114.0 in stage 4.0 (TID 327) in 93 ms on quickstart.cloudera (executor 2) (114/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 120.0 in stage 4.0 (TID 333, quickstart.cloudera, executor 5, partition 120, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 107.0 in stage 4.0 (TID 320) in 234 ms on quickstart.cloudera (executor 5) (115/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 121.0 in stage 4.0 (TID 334, quickstart.cloudera, executor 1, partition 121, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 115.0 in stage 4.0 (TID 328) in 132 ms on quickstart.cloudera (executor 1) (116/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 122.0 in stage 4.0 (TID 335, quickstart.cloudera, executor 6, partition 122, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 116.0 in stage 4.0 (TID 329) in 185 ms on quickstart.cloudera (executor 6) (117/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 123.0 in stage 4.0 (TID 336, quickstart.cloudera, executor 2, partition 123, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 119.0 in stage 4.0 (TID 332) in 153 ms on quickstart.cloudera (executor 2) (118/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 124.0 in stage 4.0 (TID 337, quickstart.cloudera, executor 5, partition 124, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 120.0 in stage 4.0 (TID 333) in 139 ms on quickstart.cloudera (executor 5) (119/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 125.0 in stage 4.0 (TID 338, quickstart.cloudera, executor 1, partition 125, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 121.0 in stage 4.0 (TID 334) in 116 ms on quickstart.cloudera (executor 1) (120/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 126.0 in stage 4.0 (TID 339, quickstart.cloudera, executor 4, partition 126, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 117.0 in stage 4.0 (TID 330) in 464 ms on quickstart.cloudera (executor 4) (121/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 127.0 in stage 4.0 (TID 340, quickstart.cloudera, executor 3, partition 127, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 118.0 in stage 4.0 (TID 331) in 469 ms on quickstart.cloudera (executor 3) (122/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 128.0 in stage 4.0 (TID 341, quickstart.cloudera, executor 4, partition 128, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 126.0 in stage 4.0 (TID 339) in 54 ms on quickstart.cloudera (executor 4) (123/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 129.0 in stage 4.0 (TID 342, quickstart.cloudera, executor 3, partition 129, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 127.0 in stage 4.0 (TID 340) in 51 ms on quickstart.cloudera (executor 3) (124/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 130.0 in stage 4.0 (TID 343, quickstart.cloudera, executor 4, partition 130, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 128.0 in stage 4.0 (TID 341) in 47 ms on quickstart.cloudera (executor 4) (125/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 131.0 in stage 4.0 (TID 344, quickstart.cloudera, executor 4, partition 131, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 130.0 in stage 4.0 (TID 343) in 38 ms on quickstart.cloudera (executor 4) (126/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 132.0 in stage 4.0 (TID 345, quickstart.cloudera, executor 3, partition 132, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 129.0 in stage 4.0 (TID 342) in 92 ms on quickstart.cloudera (executor 3) (127/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 133.0 in stage 4.0 (TID 346, quickstart.cloudera, executor 4, partition 133, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 131.0 in stage 4.0 (TID 344) in 45 ms on quickstart.cloudera (executor 4) (128/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 134.0 in stage 4.0 (TID 347, quickstart.cloudera, executor 3, partition 134, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 132.0 in stage 4.0 (TID 345) in 44 ms on quickstart.cloudera (executor 3) (129/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 135.0 in stage 4.0 (TID 348, quickstart.cloudera, executor 4, partition 135, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 133.0 in stage 4.0 (TID 346) in 48 ms on quickstart.cloudera (executor 4) (130/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 136.0 in stage 4.0 (TID 349, quickstart.cloudera, executor 5, partition 136, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 124.0 in stage 4.0 (TID 337) in 509 ms on quickstart.cloudera (executor 5) (131/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 137.0 in stage 4.0 (TID 350, quickstart.cloudera, executor 2, partition 137, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 123.0 in stage 4.0 (TID 336) in 533 ms on quickstart.cloudera (executor 2) (132/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 138.0 in stage 4.0 (TID 351, quickstart.cloudera, executor 1, partition 138, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 125.0 in stage 4.0 (TID 338) in 518 ms on quickstart.cloudera (executor 1) (133/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 139.0 in stage 4.0 (TID 352, quickstart.cloudera, executor 6, partition 139, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 122.0 in stage 4.0 (TID 335) in 563 ms on quickstart.cloudera (executor 6) (134/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 140.0 in stage 4.0 (TID 353, quickstart.cloudera, executor 3, partition 140, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 134.0 in stage 4.0 (TID 347) in 103 ms on quickstart.cloudera (executor 3) (135/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 141.0 in stage 4.0 (TID 354, quickstart.cloudera, executor 4, partition 141, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 135.0 in stage 4.0 (TID 348) in 100 ms on quickstart.cloudera (executor 4) (136/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 142.0 in stage 4.0 (TID 355, quickstart.cloudera, executor 2, partition 142, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 137.0 in stage 4.0 (TID 350) in 77 ms on quickstart.cloudera (executor 2) (137/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 143.0 in stage 4.0 (TID 356, quickstart.cloudera, executor 1, partition 143, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 138.0 in stage 4.0 (TID 351) in 96 ms on quickstart.cloudera (executor 1) (138/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 144.0 in stage 4.0 (TID 357, quickstart.cloudera, executor 4, partition 144, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 141.0 in stage 4.0 (TID 354) in 56 ms on quickstart.cloudera (executor 4) (139/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 145.0 in stage 4.0 (TID 358, quickstart.cloudera, executor 1, partition 145, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 143.0 in stage 4.0 (TID 356) in 52 ms on quickstart.cloudera (executor 1) (140/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 146.0 in stage 4.0 (TID 359, quickstart.cloudera, executor 4, partition 146, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 144.0 in stage 4.0 (TID 357) in 59 ms on quickstart.cloudera (executor 4) (141/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 147.0 in stage 4.0 (TID 360, quickstart.cloudera, executor 1, partition 147, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 145.0 in stage 4.0 (TID 358) in 44 ms on quickstart.cloudera (executor 1) (142/200)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Starting task 148.0 in stage 4.0 (TID 361, quickstart.cloudera, executor 4, partition 148, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:05 INFO scheduler.TaskSetManager: Finished task 146.0 in stage 4.0 (TID 359) in 41 ms on quickstart.cloudera (executor 4) (143/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 149.0 in stage 4.0 (TID 362, quickstart.cloudera, executor 1, partition 149, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 147.0 in stage 4.0 (TID 360) in 71 ms on quickstart.cloudera (executor 1) (144/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 150.0 in stage 4.0 (TID 363, quickstart.cloudera, executor 1, partition 150, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 149.0 in stage 4.0 (TID 362) in 37 ms on quickstart.cloudera (executor 1) (145/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 151.0 in stage 4.0 (TID 364, quickstart.cloudera, executor 1, partition 151, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 150.0 in stage 4.0 (TID 363) in 35 ms on quickstart.cloudera (executor 1) (146/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 152.0 in stage 4.0 (TID 365, quickstart.cloudera, executor 1, partition 152, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 151.0 in stage 4.0 (TID 364) in 35 ms on quickstart.cloudera (executor 1) (147/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 153.0 in stage 4.0 (TID 366, quickstart.cloudera, executor 5, partition 153, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 136.0 in stage 4.0 (TID 349) in 480 ms on quickstart.cloudera (executor 5) (148/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 154.0 in stage 4.0 (TID 367, quickstart.cloudera, executor 6, partition 154, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 139.0 in stage 4.0 (TID 352) in 450 ms on quickstart.cloudera (executor 6) (149/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 155.0 in stage 4.0 (TID 368, quickstart.cloudera, executor 5, partition 155, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 153.0 in stage 4.0 (TID 366) in 41 ms on quickstart.cloudera (executor 5) (150/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 156.0 in stage 4.0 (TID 369, quickstart.cloudera, executor 1, partition 156, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 152.0 in stage 4.0 (TID 365) in 141 ms on quickstart.cloudera (executor 1) (151/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 157.0 in stage 4.0 (TID 370, quickstart.cloudera, executor 6, partition 157, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 154.0 in stage 4.0 (TID 367) in 60 ms on quickstart.cloudera (executor 6) (152/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 142.0 in stage 4.0 (TID 355) in 455 ms on quickstart.cloudera (executor 2) (153/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 158.0 in stage 4.0 (TID 371, quickstart.cloudera, executor 2, partition 158, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 159.0 in stage 4.0 (TID 372, quickstart.cloudera, executor 3, partition 159, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 140.0 in stage 4.0 (TID 353) in 495 ms on quickstart.cloudera (executor 3) (154/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 160.0 in stage 4.0 (TID 373, quickstart.cloudera, executor 1, partition 160, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 156.0 in stage 4.0 (TID 369) in 88 ms on quickstart.cloudera (executor 1) (155/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 161.0 in stage 4.0 (TID 374, quickstart.cloudera, executor 6, partition 161, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 157.0 in stage 4.0 (TID 370) in 65 ms on quickstart.cloudera (executor 6) (156/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 162.0 in stage 4.0 (TID 375, quickstart.cloudera, executor 2, partition 162, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 158.0 in stage 4.0 (TID 371) in 70 ms on quickstart.cloudera (executor 2) (157/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 163.0 in stage 4.0 (TID 376, quickstart.cloudera, executor 3, partition 163, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 159.0 in stage 4.0 (TID 372) in 75 ms on quickstart.cloudera (executor 3) (158/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 164.0 in stage 4.0 (TID 377, quickstart.cloudera, executor 6, partition 164, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 161.0 in stage 4.0 (TID 374) in 57 ms on quickstart.cloudera (executor 6) (159/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 165.0 in stage 4.0 (TID 378, quickstart.cloudera, executor 1, partition 165, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 160.0 in stage 4.0 (TID 373) in 66 ms on quickstart.cloudera (executor 1) (160/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 166.0 in stage 4.0 (TID 379, quickstart.cloudera, executor 2, partition 166, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 162.0 in stage 4.0 (TID 375) in 61 ms on quickstart.cloudera (executor 2) (161/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 167.0 in stage 4.0 (TID 380, quickstart.cloudera, executor 4, partition 167, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 168.0 in stage 4.0 (TID 381, quickstart.cloudera, executor 3, partition 168, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 148.0 in stage 4.0 (TID 361) in 482 ms on quickstart.cloudera (executor 4) (162/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 163.0 in stage 4.0 (TID 376) in 82 ms on quickstart.cloudera (executor 3) (163/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 169.0 in stage 4.0 (TID 382, quickstart.cloudera, executor 2, partition 169, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 166.0 in stage 4.0 (TID 379) in 64 ms on quickstart.cloudera (executor 2) (164/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 170.0 in stage 4.0 (TID 383, quickstart.cloudera, executor 1, partition 170, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 165.0 in stage 4.0 (TID 378) in 85 ms on quickstart.cloudera (executor 1) (165/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 171.0 in stage 4.0 (TID 384, quickstart.cloudera, executor 4, partition 171, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 167.0 in stage 4.0 (TID 380) in 63 ms on quickstart.cloudera (executor 4) (166/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 172.0 in stage 4.0 (TID 385, quickstart.cloudera, executor 3, partition 172, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 168.0 in stage 4.0 (TID 381) in 66 ms on quickstart.cloudera (executor 3) (167/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 173.0 in stage 4.0 (TID 386, quickstart.cloudera, executor 2, partition 173, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 169.0 in stage 4.0 (TID 382) in 61 ms on quickstart.cloudera (executor 2) (168/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 174.0 in stage 4.0 (TID 387, quickstart.cloudera, executor 1, partition 174, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 170.0 in stage 4.0 (TID 383) in 73 ms on quickstart.cloudera (executor 1) (169/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 175.0 in stage 4.0 (TID 388, quickstart.cloudera, executor 4, partition 175, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 171.0 in stage 4.0 (TID 384) in 66 ms on quickstart.cloudera (executor 4) (170/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 176.0 in stage 4.0 (TID 389, quickstart.cloudera, executor 2, partition 176, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 173.0 in stage 4.0 (TID 386) in 51 ms on quickstart.cloudera (executor 2) (171/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 177.0 in stage 4.0 (TID 390, quickstart.cloudera, executor 1, partition 177, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 174.0 in stage 4.0 (TID 387) in 48 ms on quickstart.cloudera (executor 1) (172/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 178.0 in stage 4.0 (TID 391, quickstart.cloudera, executor 4, partition 178, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 175.0 in stage 4.0 (TID 388) in 60 ms on quickstart.cloudera (executor 4) (173/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 179.0 in stage 4.0 (TID 392, quickstart.cloudera, executor 1, partition 179, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 177.0 in stage 4.0 (TID 390) in 57 ms on quickstart.cloudera (executor 1) (174/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 180.0 in stage 4.0 (TID 393, quickstart.cloudera, executor 4, partition 180, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 178.0 in stage 4.0 (TID 391) in 43 ms on quickstart.cloudera (executor 4) (175/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 181.0 in stage 4.0 (TID 394, quickstart.cloudera, executor 1, partition 181, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 179.0 in stage 4.0 (TID 392) in 53 ms on quickstart.cloudera (executor 1) (176/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 182.0 in stage 4.0 (TID 395, quickstart.cloudera, executor 4, partition 182, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 180.0 in stage 4.0 (TID 393) in 42 ms on quickstart.cloudera (executor 4) (177/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 183.0 in stage 4.0 (TID 396, quickstart.cloudera, executor 5, partition 183, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 155.0 in stage 4.0 (TID 368) in 486 ms on quickstart.cloudera (executor 5) (178/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 184.0 in stage 4.0 (TID 397, quickstart.cloudera, executor 1, partition 184, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 181.0 in stage 4.0 (TID 394) in 45 ms on quickstart.cloudera (executor 1) (179/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 185.0 in stage 4.0 (TID 398, quickstart.cloudera, executor 4, partition 185, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 182.0 in stage 4.0 (TID 395) in 48 ms on quickstart.cloudera (executor 4) (180/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 186.0 in stage 4.0 (TID 399, quickstart.cloudera, executor 5, partition 186, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 183.0 in stage 4.0 (TID 396) in 50 ms on quickstart.cloudera (executor 5) (181/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 187.0 in stage 4.0 (TID 400, quickstart.cloudera, executor 1, partition 187, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 184.0 in stage 4.0 (TID 397) in 48 ms on quickstart.cloudera (executor 1) (182/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 188.0 in stage 4.0 (TID 401, quickstart.cloudera, executor 4, partition 188, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 185.0 in stage 4.0 (TID 398) in 72 ms on quickstart.cloudera (executor 4) (183/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 189.0 in stage 4.0 (TID 402, quickstart.cloudera, executor 5, partition 189, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 186.0 in stage 4.0 (TID 399) in 56 ms on quickstart.cloudera (executor 5) (184/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 190.0 in stage 4.0 (TID 403, quickstart.cloudera, executor 1, partition 190, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 187.0 in stage 4.0 (TID 400) in 44 ms on quickstart.cloudera (executor 1) (185/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 191.0 in stage 4.0 (TID 404, quickstart.cloudera, executor 6, partition 191, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 164.0 in stage 4.0 (TID 377) in 483 ms on quickstart.cloudera (executor 6) (186/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 192.0 in stage 4.0 (TID 405, quickstart.cloudera, executor 5, partition 192, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 189.0 in stage 4.0 (TID 402) in 49 ms on quickstart.cloudera (executor 5) (187/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 193.0 in stage 4.0 (TID 406, quickstart.cloudera, executor 4, partition 193, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 188.0 in stage 4.0 (TID 401) in 54 ms on quickstart.cloudera (executor 4) (188/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 194.0 in stage 4.0 (TID 407, quickstart.cloudera, executor 1, partition 194, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 190.0 in stage 4.0 (TID 403) in 78 ms on quickstart.cloudera (executor 1) (189/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 195.0 in stage 4.0 (TID 408, quickstart.cloudera, executor 4, partition 195, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 193.0 in stage 4.0 (TID 406) in 41 ms on quickstart.cloudera (executor 4) (190/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 196.0 in stage 4.0 (TID 409, quickstart.cloudera, executor 6, partition 196, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 191.0 in stage 4.0 (TID 404) in 57 ms on quickstart.cloudera (executor 6) (191/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 197.0 in stage 4.0 (TID 410, quickstart.cloudera, executor 5, partition 197, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 192.0 in stage 4.0 (TID 405) in 55 ms on quickstart.cloudera (executor 5) (192/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 198.0 in stage 4.0 (TID 411, quickstart.cloudera, executor 4, partition 198, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 195.0 in stage 4.0 (TID 408) in 43 ms on quickstart.cloudera (executor 4) (193/200)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Starting task 199.0 in stage 4.0 (TID 412, quickstart.cloudera, executor 3, partition 199, PROCESS_LOCAL, 6230 bytes)
17/08/15 12:50:06 INFO scheduler.TaskSetManager: Finished task 172.0 in stage 4.0 (TID 385) in 465 ms on quickstart.cloudera (executor 3) (194/200)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 5.0 (TID 413, quickstart.cloudera, executor 5, partition 0, PROCESS_LOCAL, 6195 bytes)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 197.0 in stage 4.0 (TID 410) in 78 ms on quickstart.cloudera (executor 5) (195/200)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 194.0 in stage 4.0 (TID 407) in 97 ms on quickstart.cloudera (executor 1) (196/200)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 196.0 in stage 4.0 (TID 409) in 87 ms on quickstart.cloudera (executor 6) (197/200)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 198.0 in stage 4.0 (TID 411) in 56 ms on quickstart.cloudera (executor 4) (198/200)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 176.0 in stage 4.0 (TID 389) in 467 ms on quickstart.cloudera (executor 2) (199/200)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 199.0 in stage 4.0 (TID 412) in 66 ms on quickstart.cloudera (executor 3) (200/200)
17/08/15 12:50:07 INFO cluster.YarnScheduler: Removed TaskSet 4.0, whose tasks have all completed, from pool
17/08/15 12:50:07 INFO scheduler.DAGScheduler: ResultStage 4 (start at com.gss.mainController.StreamingJob1.java:57) finished in 91.662 s
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Job 2 finished: start at com.gss.mainController.StreamingJob1.java:57, took 104.598194 s
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_11_piece0 in memory on quickstart.cloudera:44013 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 5.0 (TID 413) in 115 ms on quickstart.cloudera (executor 5) (1/1)
17/08/15 12:50:07 INFO cluster.YarnScheduler: Removed TaskSet 5.0, whose tasks have all completed, from pool
17/08/15 12:50:07 INFO scheduler.DAGScheduler: ResultStage 5 (start at com.gss.mainController.StreamingJob1.java:51) finished in 22.710 s
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Job 3 finished: start at com.gss.mainController.StreamingJob1.java:51, took 22.724319 s
17/08/15 12:50:07 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "92ed3bc0-4671-4817-a8e0-fdb62a0a0773",
  "runId" : "e0a4c67a-a82a-4583-a813-42fb7f226540",
  "name" : "aggregates",
  "timestamp" : "2017-08-15T19:48:20.843Z",
  "numInputRows" : 44790215,
  "processedRowsPerSecond" : 421654.1774535185,
  "durationMs" : {
    "addBatch" : 105702,
    "getBatch" : 165,
    "getOffset" : 150,
    "queryPlanning" : 140,
    "triggerExecution" : 106225,
    "walCommit" : 50
  },
  "stateOperators" : [ {
    "numRowsTotal" : 0,
    "numRowsUpdated" : 0
  } ],
  "sources" : [ {
    "description" : "FileStreamSource[hdfs://quickstart.cloudera:8020/user/cloudera/parq]",
    "startOffset" : null,
    "endOffset" : {
      "logOffset" : 0
    },
    "numInputRows" : 44790215,
    "processedRowsPerSecond" : 421654.1774535185
  } ],
  "sink" : {
    "description" : "MemorySink"
  }
}
17/08/15 12:50:07 INFO spark.SparkContext: Starting job: start at com.gss.mainController.StreamingJob1.java:51
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Got job 4 (start at com.gss.mainController.StreamingJob1.java:51) with 4 output partitions
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Final stage: ResultStage 6 (start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Parents of final stage: List()
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Missing parents: List()
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Submitting ResultStage 6 (MapPartitionsRDD[27] at start at com.gss.mainController.StreamingJob1.java:51), which has no missing parents
17/08/15 12:50:07 INFO memory.MemoryStore: Block broadcast_12 stored as values in memory (estimated size 7.8 KB, free 364.9 MB)
17/08/15 12:50:07 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "92ed3bc0-4671-4817-a8e0-fdb62a0a0773",
  "runId" : "e0a4c67a-a82a-4583-a813-42fb7f226540",
  "name" : "aggregates",
  "timestamp" : "2017-08-15T19:50:07.150Z",
  "numInputRows" : 0,
  "inputRowsPerSecond" : 0.0,
  "processedRowsPerSecond" : 0.0,
  "durationMs" : {
    "getOffset" : 24,
    "triggerExecution" : 26
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
17/08/15 12:50:07 INFO memory.MemoryStore: Block broadcast_12_piece0 stored as bytes in memory (estimated size 4.3 KB, free 364.9 MB)
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_12_piece0 in memory on 192.168.1.116:60495 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO spark.SparkContext: Created broadcast 12 from broadcast at DAGScheduler.scala:996
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Submitting 4 missing tasks from ResultStage 6 (MapPartitionsRDD[27] at start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:50:07 INFO cluster.YarnScheduler: Adding task set 6.0 with 4 tasks
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 6.0 (TID 414, quickstart.cloudera, executor 3, partition 1, PROCESS_LOCAL, 6195 bytes)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Starting task 1.0 in stage 6.0 (TID 415, quickstart.cloudera, executor 4, partition 2, PROCESS_LOCAL, 6195 bytes)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Starting task 2.0 in stage 6.0 (TID 416, quickstart.cloudera, executor 1, partition 3, PROCESS_LOCAL, 6195 bytes)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Starting task 3.0 in stage 6.0 (TID 417, quickstart.cloudera, executor 2, partition 4, PROCESS_LOCAL, 6195 bytes)
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_12_piece0 in memory on quickstart.cloudera:54741 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_12_piece0 in memory on quickstart.cloudera:59510 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_12_piece0 in memory on quickstart.cloudera:34617 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_12_piece0 in memory on quickstart.cloudera:52065 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 2.0 in stage 6.0 (TID 416) in 253 ms on quickstart.cloudera (executor 1) (1/4)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 6.0 (TID 414) in 272 ms on quickstart.cloudera (executor 3) (2/4)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 3.0 in stage 6.0 (TID 417) in 264 ms on quickstart.cloudera (executor 2) (3/4)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 1.0 in stage 6.0 (TID 415) in 305 ms on quickstart.cloudera (executor 4) (4/4)
17/08/15 12:50:07 INFO cluster.YarnScheduler: Removed TaskSet 6.0, whose tasks have all completed, from pool
17/08/15 12:50:07 INFO scheduler.DAGScheduler: ResultStage 6 (start at com.gss.mainController.StreamingJob1.java:51) finished in 0.309 s
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Job 4 finished: start at com.gss.mainController.StreamingJob1.java:51, took 0.337030 s
17/08/15 12:50:07 INFO spark.SparkContext: Starting job: start at com.gss.mainController.StreamingJob1.java:51
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Got job 5 (start at com.gss.mainController.StreamingJob1.java:51) with 1 output partitions
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Final stage: ResultStage 7 (start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Parents of final stage: List()
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Missing parents: List()
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Submitting ResultStage 7 (MapPartitionsRDD[27] at start at com.gss.mainController.StreamingJob1.java:51), which has no missing parents
17/08/15 12:50:07 INFO memory.MemoryStore: Block broadcast_13 stored as values in memory (estimated size 7.8 KB, free 364.8 MB)
17/08/15 12:50:07 INFO memory.MemoryStore: Block broadcast_13_piece0 stored as bytes in memory (estimated size 4.3 KB, free 364.8 MB)
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_13_piece0 in memory on 192.168.1.116:60495 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO spark.SparkContext: Created broadcast 13 from broadcast at DAGScheduler.scala:996
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Submitting 1 missing tasks from ResultStage 7 (MapPartitionsRDD[27] at start at com.gss.mainController.StreamingJob1.java:51)
17/08/15 12:50:07 INFO cluster.YarnScheduler: Adding task set 7.0 with 1 tasks
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Starting task 0.0 in stage 7.0 (TID 418, quickstart.cloudera, executor 1, partition 5, PROCESS_LOCAL, 6195 bytes)
17/08/15 12:50:07 INFO storage.BlockManagerInfo: Added broadcast_13_piece0 in memory on quickstart.cloudera:54741 (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:07 INFO scheduler.TaskSetManager: Finished task 0.0 in stage 7.0 (TID 418) in 33 ms on quickstart.cloudera (executor 1) (1/1)
17/08/15 12:50:07 INFO cluster.YarnScheduler: Removed TaskSet 7.0, whose tasks have all completed, from pool
17/08/15 12:50:07 INFO scheduler.DAGScheduler: ResultStage 7 (start at com.gss.mainController.StreamingJob1.java:51) finished in 0.033 s
17/08/15 12:50:07 INFO scheduler.DAGScheduler: Job 5 finished: start at com.gss.mainController.StreamingJob1.java:51, took 0.041956 s
17/08/15 12:50:07 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "aa9574bb-6937-4df4-9009-ad661761fb86",
  "runId" : "e26c1f36-3fee-43a5-ae9c-76b1ac313411",
  "name" : null,
  "timestamp" : "2017-08-15T19:48:20.781Z",
  "numInputRows" : 44790215,
  "processedRowsPerSecond" : 419537.23738069145,
  "durationMs" : {
    "addBatch" : 106177,
    "getBatch" : 165,
    "getOffset" : 207,
    "queryPlanning" : 140,
    "triggerExecution" : 106760,
    "walCommit" : 50
  },
  "stateOperators" : [ {
    "numRowsTotal" : 0,
    "numRowsUpdated" : 0
  } ],
  "sources" : [ {
    "description" : "FileStreamSource[hdfs://quickstart.cloudera:8020/user/cloudera/parq]",
    "startOffset" : null,
    "endOffset" : {
      "logOffset" : 0
    },
    "numInputRows" : 44790215,
    "processedRowsPerSecond" : 419537.23738069145
  } ],
  "sink" : {
    "description" : "org.apache.spark.sql.execution.streaming.ConsoleSink@6676904e"
  }
}
17/08/15 12:50:07 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "aa9574bb-6937-4df4-9009-ad661761fb86",
  "runId" : "e26c1f36-3fee-43a5-ae9c-76b1ac313411",
  "name" : null,
  "timestamp" : "2017-08-15T19:50:07.543Z",
  "numInputRows" : 0,
  "inputRowsPerSecond" : 0.0,
  "processedRowsPerSecond" : 0.0,
  "durationMs" : {
    "getOffset" : 5,
    "triggerExecution" : 6
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
    "description" : "org.apache.spark.sql.execution.streaming.ConsoleSink@6676904e"
  }
}
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_3_piece0 on 192.168.1.116:60495 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_3_piece0 on quickstart.cloudera:52065 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_3_piece0 on quickstart.cloudera:44013 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_3_piece0 on quickstart.cloudera:54741 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_3_piece0 on quickstart.cloudera:34617 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_3_piece0 on quickstart.cloudera:59510 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_3_piece0 on quickstart.cloudera:50242 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_6_piece0 on 192.168.1.116:60495 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_6_piece0 on quickstart.cloudera:59510 in memory (size: 28.8 KB, free: 366.3 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_6_piece0 on quickstart.cloudera:44013 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_6_piece0 on quickstart.cloudera:54741 in memory (size: 28.8 KB, free: 366.3 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_6_piece0 on quickstart.cloudera:52065 in memory (size: 28.8 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_6_piece0 on quickstart.cloudera:50242 in memory (size: 28.8 KB, free: 366.3 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_6_piece0 on quickstart.cloudera:34617 in memory (size: 28.8 KB, free: 366.3 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_9_piece0 on 192.168.1.116:60495 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_9_piece0 on quickstart.cloudera:50242 in memory (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_9_piece0 on quickstart.cloudera:52065 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_9_piece0 on quickstart.cloudera:54741 in memory (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:50:08 INFO storage.BlockManagerInfo: Removed broadcast_9_piece0 on quickstart.cloudera:44013 in memory (size: 12.5 KB, free: 366.2 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_9_piece0 on quickstart.cloudera:59510 in memory (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_9_piece0 on quickstart.cloudera:34617 in memory (size: 12.5 KB, free: 366.3 MB)
17/08/15 12:50:09 INFO spark.ContextCleaner: Cleaned accumulator 5963
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_11_piece0 on 192.168.1.116:60495 in memory (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_11_piece0 on quickstart.cloudera:44013 in memory (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_12_piece0 on 192.168.1.116:60495 in memory (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_12_piece0 on quickstart.cloudera:54741 in memory (size: 4.3 KB, free: 366.3 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_12_piece0 on quickstart.cloudera:52065 in memory (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_12_piece0 on quickstart.cloudera:34617 in memory (size: 4.3 KB, free: 366.3 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_12_piece0 on quickstart.cloudera:59510 in memory (size: 4.3 KB, free: 366.3 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_13_piece0 on 192.168.1.116:60495 in memory (size: 4.3 KB, free: 366.2 MB)
17/08/15 12:50:09 INFO storage.BlockManagerInfo: Removed broadcast_13_piece0 on quickstart.cloudera:54741 in memory (size: 4.3 KB, free: 366.3 MB)
17/08/15 12:50:17 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "92ed3bc0-4671-4817-a8e0-fdb62a0a0773",
  "runId" : "e0a4c67a-a82a-4583-a813-42fb7f226540",
  "name" : "aggregates",
  "timestamp" : "2017-08-15T19:50:17.181Z",
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
17/08/15 12:50:17 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "aa9574bb-6937-4df4-9009-ad661761fb86",
  "runId" : "e26c1f36-3fee-43a5-ae9c-76b1ac313411",
  "name" : null,
  "timestamp" : "2017-08-15T19:50:17.554Z",
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
    "description" : "org.apache.spark.sql.execution.streaming.ConsoleSink@6676904e"
  }
}
17/08/15 12:50:27 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "92ed3bc0-4671-4817-a8e0-fdb62a0a0773",
  "runId" : "e0a4c67a-a82a-4583-a813-42fb7f226540",
  "name" : "aggregates",
  "timestamp" : "2017-08-15T19:50:27.188Z",
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
17/08/15 12:50:27 INFO streaming.StreamExecution: Streaming query made progress: {
  "id" : "aa9574bb-6937-4df4-9009-ad661761fb86",
  "runId" : "e26c1f36-3fee-43a5-ae9c-76b1ac313411",
  "name" : null,
  "timestamp" : "2017-08-15T19:50:27.558Z",
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
    "description" : "org.apache.spark.sql.execution.streaming.ConsoleSink@6676904e"
  }
}
^C17/08/15 12:50:28 INFO spark.SparkContext: Invoking stop() from shutdown hook
17/08/15 12:50:28 INFO server.ServerConnector: Stopped ServerConnector@2b5c74f8{HTTP/1.1}{0.0.0.0:4040}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@4042cd6d{/stages/stage/kill,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@3c65a8e8{/jobs/job/kill,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@680f1da0{/api,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@2c6d9611{/,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@6992b930{/static,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@33ccee5f{/executors/threadDump/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@70e68814{/executors/threadDump,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@13bad01b{/executors/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@2ceedd53{/executors,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@5a632146{/environment/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@7bd30d9d{/environment,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@9f6d3b6{/storage/rdd/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@3bd9a455{/storage/rdd,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@28c12a13{/storage/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@4957700d{/storage,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@20b255e5{/stages/pool/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@5c09f05e{/stages/pool,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@78d32490{/stages/stage/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@782225c3{/stages/stage,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@17cd6143{/stages/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@2d113de1{/stages,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@618c2fb8{/jobs/job/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@62f1be3f{/jobs/job,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@40df572f{/jobs/json,null,UNAVAILABLE}
17/08/15 12:50:29 INFO handler.ContextHandler: Stopped o.s.j.s.ServletContextHandler@fe87727{/jobs,null,UNAVAILABLE}
17/08/15 12:50:29 INFO ui.SparkUI: Stopped Spark web UI at http://192.168.1.116:4040
17/08/15 12:50:29 INFO cluster.YarnClientSchedulerBackend: Interrupting monitor thread
17/08/15 12:50:29 INFO cluster.YarnClientSchedulerBackend: Shutting down all executors
17/08/15 12:50:29 INFO cluster.YarnSchedulerBackend$YarnDriverEndpoint: Asking each executor to shut down
17/08/15 12:50:29 ERROR scheduler.LiveListenerBus: SparkListenerBus has already stopped! Dropping event SparkListenerExecutorMetricsUpdate(4,WrappedArray())
17/08/15 12:50:29 INFO cluster.SchedulerExtensionServices: Stopping SchedulerExtensionServices
(serviceOption=None,
 services=List(),
 started=false)
17/08/15 12:50:29 INFO cluster.YarnClientSchedulerBackend: Stopped
17/08/15 12:50:29 INFO spark.MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
17/08/15 12:50:29 INFO memory.MemoryStore: MemoryStore cleared
17/08/15 12:50:29 INFO storage.BlockManager: BlockManager stopped
17/08/15 12:50:29 INFO storage.BlockManagerMaster: BlockManagerMaster stopped
17/08/15 12:50:29 INFO scheduler.OutputCommitCoordinator$OutputCommitCoordinatorEndpoint: OutputCommitCoordinator stopped!
17/08/15 12:50:29 INFO spark.SparkContext: Successfully stopped SparkContext
17/08/15 12:50:29 INFO util.ShutdownHookManager: Shutdown hook called
17/08/15 12:50:29 INFO util.ShutdownHookManager: Deleting directory /tmp/temporary-763fa043-dc88-4a9d-abf0-059779aba639
17/08/15 12:50:29 INFO util.ShutdownHookManager: Deleting directory /tmp/spark-69adf009-79ee-4e8e-bf82-94ff0c308943
17/08/15 12:50:29 INFO util.ShutdownHookManager: Deleting directory /tmp/temporary-fd51991d-d87d-4ec2-a197-63fd745ff90e

