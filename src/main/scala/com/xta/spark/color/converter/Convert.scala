package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */

object Convert {

  def RgbToHex(rgb: Rgb): Hex = {
    new Hex("#" + intToHexString(rgb.red) + intToHexString(rgb.green) + intToHexString(rgb.blue))
  }

  private def intToHexString(number: Int): String = {
    val rawHex = Integer.toString(number, 16)
    val upperHex = rawHex.toUpperCase

    if (upperHex.length == 1) {
      "0" + upperHex
    } else {
      upperHex
    }
  }

  def HexToRgb(hex: Hex): Rgb = {
    new Rgb((hexStringToInt(hex.red)), hexStringToInt(hex.green), hexStringToInt(hex.blue))
  }

  private def hexStringToInt(hex: String): Int = {
    Integer.parseInt(hex, 16)
  }

}
