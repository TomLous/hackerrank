package algorithms.strings

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class Pangrams$Test extends WordSpec with Matchers {

  "Pangrams" should {
    "Test Case #0" in {
      assert(
        Pangrams.runMain("We promptly judged antique ivory buckles for the next prize") == "pangram"
      )
    }
    "Test Case #1" in {
      assert(
        Pangrams.runMain("We promptly judged antique ivory buckles for the prize") == "not pangram"
      )
    }
  }
}