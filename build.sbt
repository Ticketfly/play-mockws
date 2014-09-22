name := "play-mockws"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

scalacOptions += "-deprecation"

organization := "de.leanovate.play-mockws"

version := "0.11.1-SNAPSHOT"

val playVersion = "2.3.4"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % playVersion % "provided",
  "com.typesafe.play" %% "play-ws" % playVersion % "provided",
  "com.typesafe.play" %% "play-test" % playVersion % "provided"
)


publishTo := Some("tfly-snaps" at "http://build.ticketfly.com/artifactory/libs-snapshot-local")

credentials += Credentials(Path.userHome / ".artifactory" / ".credentials")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "test"

instrumentSettings

ScoverageKeys.highlighting := true
