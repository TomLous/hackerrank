package algorithms.implementation

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class RepeatedString$Test extends WordSpec with Matchers {

  "RepeatedString" should {
    "Test Case #0" in {
      assert(
        RepeatedString.runMain("aba\n10") == "7"
      )
    }
    "Test Case #1" in {
      assert(
        RepeatedString.runMain("a\n1000000000000") == "1000000000000"
      )
    }
  }

}
