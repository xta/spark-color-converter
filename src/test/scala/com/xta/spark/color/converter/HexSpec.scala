package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */

import org.scalatest._

class HexSpec extends FlatSpec with ShouldMatchers {

  it should "set & get its value" in {
    val black = new Hex("#000000")
    black.value should equal("#000000")
  }

  it should "be comparable" in {
    val black = new Hex("#000000")
    val anotherBlack = new Hex("#000000")
    val white = new Hex("#FFFFFF")

    black should equal(anotherBlack)
    (black === white) should equal(false)
  }

  it should "have red, green, and blue values" in {
    val blueColor = new Hex("#0074D9")

    blueColor.red should equal("00")
    blueColor.green should equal("74")
    blueColor.blue should equal("D9")
  }

}