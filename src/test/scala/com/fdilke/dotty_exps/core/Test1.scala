package com.fdilke.dotty_exps.core

import org.junit.Test
//import org.scalatest.{Matchers, FunSpec}
//import Matchers._
import com.fdilke.dotty_exps.utility.PoorMansShouldBe._

class Test1 {
  @Test def t1(): Unit = {
    Main.msg shouldBe "I was compiled by dotty :)"
  }
}

//class com.fdilke.dotty_exps.core.Test1 extends FunSpec {
//  describe("So I managed to set up a decent test framework") {
//    it("...like this!") {
//      Main.msg shouldBe "I was compiled by dotty :)"
//    }
//  }
//}