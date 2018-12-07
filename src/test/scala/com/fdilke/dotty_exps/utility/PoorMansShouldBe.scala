package com.fdilke.dotty_exps.utility

import org.junit.Assert.assertEquals

object PoorMansShouldBe {
  implicit class PoorMansShouldBe[T](t: T) {
    def shouldBe(expected: T): Unit = {
      assertEquals(expected, t)
    }
  }
}
