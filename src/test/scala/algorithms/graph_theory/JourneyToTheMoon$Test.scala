package algorithms.graph_theory

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 19/12/16.
  * Copyright © 2016 Datlinq B.V..
  */
class JourneyToTheMoon$Test extends WordSpec with Matchers {

  "IntroToTutorialChallenges" should {
    "Test Case #0" in {
      assert(
        JourneyToTheMoon.runMain("4 2\n0 1\n2 3") == "4"
      )
    }
    "Test Case #1" in {
      assert(
        JourneyToTheMoon.runMain("10 7\n0 2\n1 8\n1 4\n2 8\n2 6\n3 5\n6 9") == "23"
      )
    }
    "Test Case #2" in {
      assert(
        JourneyToTheMoon.runMain("1000 2\n1 2\n3 4") == "499499"
      )
    }

    "Test Case #3" in {
      assert(
        JourneyToTheMoon.runMain("6 1\n0 1") == "14"
      )
    }
  }
}