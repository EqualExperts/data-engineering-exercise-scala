name := "ee-exercise-app"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "upickle" % "0.9.5",
  "com.h2database" % "h2" % "2.0.204",
  "org.scalatest" %% "scalatest" % "3.2.10" % Test
)