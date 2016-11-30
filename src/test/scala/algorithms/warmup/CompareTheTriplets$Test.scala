package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class CompareTheTriplets$Test extends WordSpec with Matchers {

  "CompareTheTriplets" should {
    "Test Case #0" in {
      assert(
        CompareTheTriplets.runMain("5 6 7\n3 6 10") == "1 1"
      )
    }
  }
}