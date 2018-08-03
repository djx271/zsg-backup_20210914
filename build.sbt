resolvers += "scala-integration" at
  "https://scala-ci.typesafe.com/artifactory/scala-integration/"

scalaVersion := "2.13.0-pre-29f6907"

scalacOptions ++= Seq("-feature", "-deprecation"/*, "-Xlog-implicits"*/)

/*addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.6" cross CrossVersion.binary)*/

lazy val core = (project in file("./core"))
lazy val helper = (project in file("./helper"))

lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core).dependsOn(helper).aggregate(helper)