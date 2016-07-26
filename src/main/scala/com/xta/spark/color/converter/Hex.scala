package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */
class Hex(v: String) {

  val value = v

  def red: String = rgb._1
  def green: String = rgb._2
  def blue: String = rgb._3

  private def rgb: (String, String, String) = {
    val startIndex = if (value.startsWith("#")) 1 else 0
    val redChars = value slice(startIndex, startIndex+2)
    val greenChars = value slice(startIndex+2, startIndex+4)
    val blueChars = value slice(startIndex+4, startIndex+6)
    (redChars, greenChars, blueChars)
  }

  //region equality

  private def canEqual(a: Any) = a.isInstanceOf[Hex]

  override def equals(that: Any): Boolean =
    that match {
      case that: Hex => that.canEqual(this) && this.hashCode == that.hashCode
      case _ => false
    }

  override def hashCode:Int = {
    val prime = 31
    var result = 1

    result * prime + value.hashCode()
  }

  //endregion

}
