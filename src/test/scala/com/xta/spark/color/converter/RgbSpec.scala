package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */

import org.scalatest._

class RgbSpec extends FlatSpec with ShouldMatchers {

  it should "set & get its value" in {
    val black = new Rgb((0, 0, 0))
    black.value should equal((0, 0, 0))
  }

  it should "have red value" in {
    val black = new Rgb((0, 0, 0))
    black.red should equal(0)
  }

  it should "have blue value" in {
    val black = new Rgb((0, 0, 0))
    black.blue should equal(0)
  }

  it should "have green value" in {
    val black = new Rgb((0, 0, 0))
    black.green should equal(0)
  }

  it should "be comparable" in {
    val black = new Rgb((0, 0, 0))
    val anotherBlack = new Rgb((0, 0, 0))
    val white = new Rgb(255,255,255)

    black should equal(anotherBlack)
    (black === white) should equal(false)
  }

}