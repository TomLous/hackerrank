package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class DiagonalDifference$Test extends WordSpec with Matchers {

  "DiagonalDifference" should {
    "Test Case #0" in {
      assert(
        DiagonalDifference.runMain("3\n11 2 4\n4 5 6\n10 8 -12") == "15"
      )
    }
  }
}
