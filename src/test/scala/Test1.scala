import org.junit.Test
import org.junit.Assert._
//import org.scalatest.{Matchers, FunSpec}
//import Matchers._

class Test1 {
  @Test def t1(): Unit = {
    assertEquals("I was compiled by dotty :)", Main.msg)
  }
}

//class Test1 extends FunSpec {
//  describe("So I managed to set up a decent test framework") {
//    it("...like this!") {
//      Main.msg shouldBe "I was compiled by dotty :)"
//    }
//  }
//}