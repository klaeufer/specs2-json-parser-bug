package com.oax.specs2

import org.junit.runner.RunWith
import org.specs2.mutable._
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class JsonSpec extends Specification {

  val json = """{"hello": "dude"}"""

  "this stuff" should {
    "just work" in {
      json must */("hello" -> "dude") and */("hello" -> "dude")
    }
  }

  "this stuff" should {
    "just work many times" in {
      forall(1 to 1000) { _ =>
        json must */("hello" -> "dude") and */("hello" -> "dude")
      }
    }
  }

  "this stuff" should {
    "just work many more times" in {
      forall(1 to 1000) { _ =>
        json must */("hello" -> "dude") and */("hello" -> "dude")
      }
    }
  }
}
