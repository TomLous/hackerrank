package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class SimpleArraySum$Test extends WordSpec with Matchers {

  "SimpleArraySum" should {
    "Test Case #0" in {
      assert(
        SimpleArraySum.runMain("6\n1 2 3 4 10 11") == "31"
      )
    }
  }
}
