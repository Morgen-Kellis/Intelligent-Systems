package ai.predict

import org.specs2.mutable._

object TestSpec extends Specification {
  "This test" should {
    "contain 11 chars" in {
      "Hello World" must have size(11)
    }
  }
}
