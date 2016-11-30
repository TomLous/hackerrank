package algorithms.implementation

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class MiniMaxSum$Test extends WordSpec with Matchers {

  "MiniMaxSum" should {
    "Test Case #0" in {
      assert(
        MiniMaxSum.runMain("1 2 3 4 5") == "10 14"
      )
    }
  }

}
