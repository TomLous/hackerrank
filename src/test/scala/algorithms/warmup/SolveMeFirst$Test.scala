package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class SolveMeFirst$Test extends WordSpec with Matchers {

  "SolveMeFirst" should {
    "Test Case #0" in {
      assert(
        SolveMeFirst.runMain("1\n3") == "4"
      )
    }
  }
}
