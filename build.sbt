import sbtassembly.Plugin._
import AssemblyKeys._

name := "Banno-Predict"

Specs2.settings

Specs2.version := "1.8.1"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-swing" % "2.9.1",
  "net.debasishg" %% "sjson" % "0.15"
)
