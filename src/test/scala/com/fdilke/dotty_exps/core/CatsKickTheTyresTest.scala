package com.fdilke.dotty_exps.core

import org.junit.Test
import com.fdilke.dotty_exps.utility.PoorMansShouldBe._
import cats.Eq
import cats.instances.int._
import cats.instances.string._
import cats.syntax.eq._
import scala.language.implicitConversions

class CatsKickTheTyresTest {
  @Test def t1(): Unit = {
    val eqInt = Eq[Int]
    eqInt.eqv(5, 7) shouldBe false
//    (5 === 7) shouldBe false
//    ("mog" === "m" + "og") shouldBe false
    Eq[String].eqv("mog", "m" + "og") shouldBe true
  }
}
