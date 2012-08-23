import sbt._
import Keys._

name := "Banno-Predict"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-swing" % "2.9.1",
  "net.debasishg" %% "sjson" % "0.15",
  "org.specs2" %% "specs2" % "1.8.1"
)
