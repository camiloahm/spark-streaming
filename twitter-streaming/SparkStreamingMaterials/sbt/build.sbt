name := "WordCount"

version := "1.0"

organization := "com.sundogsoftware"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "1.6.1" % "provided",
"org.apache.spark" %% "spark-streaming" % "1.6.1" % "provided"
)
