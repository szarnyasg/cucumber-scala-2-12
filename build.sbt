import sbt._

name := "cucumber-with-scala-2.12"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "info.cukes" %% "cucumber-scala" % "1.2.5",
  "org.scalatest" %% "scalatest" % "3.0.0"
)

mainClass in(Compile, run) := Some("cucumber.api.cli.Main")
