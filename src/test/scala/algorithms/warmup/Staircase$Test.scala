package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class Staircase$Test extends WordSpec with Matchers {

  "Staircase" should {
    "Test Case #0" in {
      assert(
        Staircase.runMain("6") == "     #\n    ##\n   ###\n  ####\n #####\n######".trim
      )
    }
  }
}

