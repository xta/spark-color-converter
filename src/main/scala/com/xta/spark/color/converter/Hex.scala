package com.xta.spark.color.converter

/**
  * Created by Rex on 7/25/16.
  */
class Hex(v: String) {

  val value = v

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
