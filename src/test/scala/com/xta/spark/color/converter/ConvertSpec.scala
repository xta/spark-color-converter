package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */

import org.scalatest._

class ConvertSpec extends FlatSpec with ShouldMatchers {

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

}