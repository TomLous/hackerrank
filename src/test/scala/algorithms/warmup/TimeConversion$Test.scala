package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class TimeConversion$Test extends WordSpec with Matchers {

  "TimeConversion" should {
    "Test Case #0" in {
      assert(
        TimeConversion.runMain("07:05:45PM") == "19:05:45"
      )
    }
  }
}