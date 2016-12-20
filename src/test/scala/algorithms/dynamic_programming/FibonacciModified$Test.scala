package algorithms.dynamic_programming

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 20/12/16.
  * Copyright © 2016 Datlinq B.V..
  */
class FibonacciModified$Test extends WordSpec with Matchers {

  "FibonacciModified" should {
    "Test Case #0" in {
      assert(
        FibonacciModified.runMain("0 1 5") == "5"
      )
    }
  }
}
