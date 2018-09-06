name := "twitter_processor"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.3.1",
  "org.apache.spark" % "spark-streaming_2.11" % "2.3.1",
  "org.apache.logging.log4j" % "log4j-api" % "2.11.1",
  "org.apache.logging.log4j" % "log4j-core" % "2.11.1"
)