package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class PlusMinus$Test extends WordSpec with Matchers {

  "PlusMinus" should {
    "Test Case #0" in {
      assert(
        PlusMinus.runMain("6\n-4 3 -9 0 4 1") == "0.500000\n0.333333\n0.166667"
      )
    }
  }
}