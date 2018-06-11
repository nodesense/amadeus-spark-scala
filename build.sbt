name := "amadeus-spark-scala"

version := "0.1"

scalaVersion := "2.11.12"

import Dependencies._

//dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.9"
//dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.9"


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "ai.nodesense",
      scalaVersion := "2.11.12",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "sparkpro",
    libraryDependencies += scalaTest % Test,

    libraryDependencies ++= {
      val sparkVer = "2.3.0"
      Seq(
        "org.apache.spark" %% "spark-core" % sparkVer ,
        "org.apache.spark" %% "spark-sql" % sparkVer    ,
        "org.apache.spark" %% "spark-streaming" % sparkVer
      )
    },


    // https://mvnrepository.com/artifact/org.eclipse.jetty/jetty-client
    libraryDependencies += "org.eclipse.jetty"  % "jetty-client" % "8.1.14.v20131031",

    // https://mvnrepository.com/artifact/au.com.bytecode/opencsv
    libraryDependencies += "au.com.bytecode" % "opencsv" % "2.4",


    libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % "2.7.3"  % "provided" ,
    // https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-common
    libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.3" % "provided",



    libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6",

    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.7",
    // https://mvnrepository.com/artifact/com.typesafe.play/play-json-joda
    //libraryDependencies += "com.typesafe.play" %% "play-json-joda" % "2.6.9",

    // https://mvnrepository.com/artifact/com.fasterxml.jackson.module/jackson-module-scala
    libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.5",

    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
    libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.5"

  )

//mainClass := Some("ai.nodesense.spark.SparkHDFS")

