package algorithms.strings

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class TwoCharacters$Test extends WordSpec with Matchers {

  "TwoCharacters" should {
    "Test Case #0" in {
      assert(
        TwoCharacters.runMain("10\nbeabeefeab") == "5"
      )
    }
  }
}