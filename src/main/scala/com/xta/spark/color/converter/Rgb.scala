package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */

class Rgb(v: (Int, Int, Int)) {

  val value = v

  def red: Int = { value._1 }

  def green: Int = { value._2 }

  def blue: Int = { value._3 }

  //region equality

  private def canEqual(a: Any) = a.isInstanceOf[Rgb]

  override def equals(that: Any): Boolean =
    that match {
      case that: Rgb => that.canEqual(this) && this.hashCode == that.hashCode
      case _ => false
    }

  override def hashCode:Int = {
    value.hashCode()
  }

  //endregion

}
