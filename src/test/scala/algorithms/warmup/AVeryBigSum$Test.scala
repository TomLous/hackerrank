package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class AVeryBigSum$Test extends WordSpec with Matchers {

  "AVeryBigSum" should {
    "Test Case #0" in {
      assert(
        AVeryBigSum.runMain("5\n1000000001 1000000002 1000000003 1000000004 1000000005") == "5000000015"
      )
    }
  }
}