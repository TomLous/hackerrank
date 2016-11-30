package algorithms.strings

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class CamelCase$Test extends WordSpec with Matchers {

  "CamelCase" should {
    "Test Case #0" in {
      assert(
        CamelCase.runMain("saveChangesInTheEditor") == "5"
      )
    }
  }
}