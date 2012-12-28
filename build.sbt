name := "inflector"

version := "0.5"

organization := "com.zestia"

crossScalaVersions := Seq("2.9.1", "2.9.2")

javacOptions in Compile ++= Seq("-target", "6", "-source", "6", "-encoding", "UTF-8")

libraryDependencies ++= Seq(
	"com.typesafe" % "config" % "1.0.0",
	"org.specs2" % "specs2_2.9.1" % "1.9" % "test"
)
