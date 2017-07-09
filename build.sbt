import sbt._

name := "cucumber-with-scala-2.12"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "io.cucumber" % "cucumber-scala_2.12" % "2.0.0-SNAPSHOT",
  "org.scalatest" % "scalatest_2.12" % "3.0.3"
)

mainClass in(Compile, run) := Some("cucumber.api.cli.Main")

resolvers += Resolver.mavenLocal
