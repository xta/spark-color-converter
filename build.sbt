// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.10.6"

sparkVersion := "1.4.0"

// Don't forget to set the version
version := "0.0.1"

// All Spark Packages need a license
licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

// Add Spark components this package depends on, e.g, "mllib", ....
// sparkComponents ++= Seq("sql", "mllib")

// uncomment and change the value below to change the directory where your zip artifact will be created
// spDistDirectory := target.value

// add any Spark Package dependencies using spDependencies.
// e.g. spDependencies += "databricks/spark-avro:0.1"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

// spark-packages.org

spName := "xta/spark-color-converter"

spShortDescription := "Color RGB to Hex converter"

spDescription := "Convert between RGB & Hex colors"

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
