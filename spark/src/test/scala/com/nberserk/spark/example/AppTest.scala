package com.nberserk.spark.example

import grizzled.slf4j.Logging
import org.apache.spark.sql.SparkSession
import org.scalatest.{Outcome, fixture}


class AppTest extends fixture.FunSuite with Logging {
  type FixtureParam = SparkSession

  def withFixture(test: OneArgTest): Outcome = {
    val sparkSession = SparkSession.builder
      .appName("Test-Spark-Local")
      .master("local[2]")
      .getOrCreate()
    try {
      withFixture(test.toNoArgTest(sparkSession))
    } finally sparkSession.stop
  }

  test("empsRDD rowcount") { spark =>
    val empsRDD = spark.sparkContext.parallelize(Array(1,2,34,5))
    assert(empsRDD.count === 4)
  }




}



