package com.nberserk.spark.example

import org.apache.spark.sql.SparkSession


/**
 * Hello world!
 *
 */
object App {
  def main(args: Array[String]) {
    println( "Hello World!" )

    val logFile = "./README.md" // Should be some file on your system
    val session = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData = session.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    session.stop()
  }

}
