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
    val white = new Hex("#ffffff")

    black should equal(anotherBlack)
    (black === white) should equal(false)
  }

}