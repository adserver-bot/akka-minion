organization := "akka"
name := "akka-minion"

scalaVersion := "2.12.3"

val AkkaVersion = "2.5.6"
val AkkaHttpVersion = "10.0.10"

libraryDependencies ++= Seq(
  "com.typesafe.akka"  %% "akka-actor"           % AkkaVersion,
  "com.typesafe.akka"  %% "akka-stream"          % AkkaVersion,
  "com.typesafe.akka"  %% "akka-http"            % AkkaHttpVersion,
  "com.typesafe.akka"  %% "akka-http-spray-json" % AkkaHttpVersion,
  "com.lihaoyi"        %% "scalatags"            % "0.6.3",
  "io.spray"           %% "spray-json"           % "1.3.3",
  "com.github.blemale" %% "scaffeine"            % "2.0.0"
)

scalafmtOnCompile in ThisBuild := true

enablePlugins(JavaAppPackaging)
