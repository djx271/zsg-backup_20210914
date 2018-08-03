resolvers += "scala-integration" at
  "https://scala-ci.typesafe.com/artifactory/scala-integration/"

scalaVersion := "2.13.0-pre-29f6907"

scalacOptions ++= Seq("-feature", "-deprecation")
/*libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.3"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.25" % Test*/

lazy val core = (project in file("../core"))

dependsOn(core)