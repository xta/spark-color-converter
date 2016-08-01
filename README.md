# Spark Color Converter

---

# Usage

## Setup

#### command line

    # cd to your $SPARK_HOME directory
    ./bin/spark-shell --packages xta:spark-color-converter:0.0.3
    import com.xta.spark.color.converter._

#### databricks.com

    # create library & attach to cluster per https://databricks.com/blog/2015/07/28/using-3rd-party-libraries-in-databricks-apache-spark-packages-and-maven-libraries.html
    import com.xta.spark.color.converter._

## Methods

    # convert RGB to Hex
    val black = new Rgb((0, 0, 0))
    val hex = Convert.RgbToHex(black)
    hex.value
    // String = #000000

    # convert Hex to RGB
    val blue = new Hex("#0074D9")
    val rgb = Convert.HexToRgb(blue)
    rgb.value
    // (Int, Int, Int) = (0,116,217)

---

# Meta

## Development

    sbt test

## New Releases

    sbt spPublish
    # while logged in, register a release at https://spark-packages.org/package/xta/spark-color-converter
