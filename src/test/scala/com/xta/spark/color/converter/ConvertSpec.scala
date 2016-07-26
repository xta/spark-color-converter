package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */

import org.scalatest._

class ConvertSpec extends FlatSpec with ShouldMatchers {

  //region Rgb to Hex

  "RGB black" should "convert to Hex" in {
    val color = new Rgb((0, 0, 0))
    Convert.RgbToHex(color) should equal(new Hex("#000000"))
  }

  "RGB red" should "convert to Hex" in {
    val color = new Rgb((255,65,54))
    Convert.RgbToHex(color) should equal(new Hex("#FF4136"))
  }

  "RGB green" should "convert to Hex" in {
    val color = new Rgb((46,204,64))
    Convert.RgbToHex(color) should equal(new Hex("#2ECC40"))
  }

  "RGB blue" should "convert to Hex" in {
    val color = new Rgb((0,116,217))
    Convert.RgbToHex(color) should equal(new Hex("#0074D9"))
  }

  "RGB white" should "convert to Hex" in {
    val color = new Rgb((255,255,255))
    Convert.RgbToHex(color) should equal(new Hex("#FFFFFF"))
  }

  //endregion

  //region Hex to Rgb

  "Hex black" should "convert to RGB" in {
    val color = new Hex("#000000")
    Convert.HexToRgb(color) should equal(new Rgb((0, 0, 0)))
  }

  "Hex red" should "convert to RGB" in {
    val color = new Hex("#FF4136")
    Convert.HexToRgb(color) should equal(new Rgb((255,65,54)))
  }

  "Hex green" should "convert to RGB" in {
    val color = new Hex("#2ECC40")
    Convert.HexToRgb(color) should equal(new Rgb((46,204,64)))
  }

  "Hex blue" should "convert to RGB" in {
    val color = new Hex("#0074D9")
    Convert.HexToRgb(color) should equal(new Rgb((0,116,217)))
  }

  "Hex white" should "convert to RGB" in {
    val color = new Hex("#FFFFFF")
    Convert.HexToRgb(color) should equal(new Rgb((255,255,255)))
  }
  
  //endregion

}