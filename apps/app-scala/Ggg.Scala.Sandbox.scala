import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/** https://stackoverflow.com/questions/33733174/spark-error-not-found-value-sc */
/** Spark : Error Not found value SC */

val conf = new SparkConf().setAppName("Simple Application")
val sc = new SparkContext(conf)
var sc = SparkContext.getOrCreate()

/** Create Data */
val data = 1 to 10000

/** HDFS is a Java-based file system that provides scalable and reliable data storage, and it was designed to span large clusters of commodity servers. HDFS has demonstrated production scalability of up to 200 PB of storage and a single cluster of 4500 servers, supporting close to a billion files and blocks. */

/** Create RDD */
/** Resilient Distributed Datasets (RDD) is a fundamental data structure of Spark. It is an immutable distributed collection of objects. Each dataset in RDD is divided into logical partitions, which may be computed on different nodes of the cluster. */
val distData = sc.parallelize(data)

/** Filter */
distData.filter( _ < 10).collect()

val f = sc.textFile("README.md")
