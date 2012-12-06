name := "inflector"

version := "0.5"

organization := "com.zestia"

crossScalaVersions := Seq("2.9.1", "2.9.2")

libraryDependencies ++= Seq(
  "org.mockito" % "mockito-all" % "1.8.5" % "test",
  "org.specs2" % "specs2_2.9.1" % "1.9" % "test"
)
