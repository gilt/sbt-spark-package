addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

sbtPlugin := true

name := "sbt-spark-package"

organization := "org.spark-packages"

version := "0.2.7-SNAPSHOT"

description := "sbt plugin to develop, use, and publish Spark Packages"

libraryDependencies += "org.scalaj" %% "scalaj-http" % "2.3.0"

libraryDependencies += "commons-codec" % "commons-codec" % "1.11"

licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

publishTo := Some("Spark Package Main Repo" at
    s"https://api.bintray.com/content/spark-packages/maven/spark-packages_sbt-spark-package/${version.value}")
