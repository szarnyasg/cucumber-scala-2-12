import sbt._

name := "cucumber-with-scala-2.12"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "io.cucumber" %% "cucumber-scala" % "2.0.0-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "3.0.0"
)

mainClass in(Compile, run) := Some("cucumber.api.cli.Main")

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
