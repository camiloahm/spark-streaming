name := "twitter_processor"

version := "1.0.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % "2.0.1",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.0.1",
  "org.apache.logging.log4j" % "log4j-api" % "2.11.1",
  "org.apache.logging.log4j" % "log4j-core" % "2.11.1"
)