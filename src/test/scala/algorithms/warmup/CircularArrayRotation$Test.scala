package algorithms.warmup

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class CircularArrayRotation$Test extends WordSpec with Matchers {

  "CircularArrayRotation" should {
    "Test Case #0" in {
      assert(
        CircularArrayRotation.runMain("3 2 3\n1 2 3\n0\n1\n2") == "2\n3\n1"
      )
    }
  }
}