# Spark Color Converter

## Usage

    # convert RGB to Hex
    val black = new Rgb((0, 0, 0))
    val hex = Convert.RgbToHex(black)
    hex.value
    // "#000000"

    # convert Hex to RGB
    val blue = new Hex("#0074D9")
    val rgb = Convert.HexToRgb(blue)
    blue.value
    // (0,116,217)

## Development

    sbt test

## New Releases

    sbt spPublish
    # while logged in, register a release at https://spark-packages.org/package/xta/spark-color-converter
