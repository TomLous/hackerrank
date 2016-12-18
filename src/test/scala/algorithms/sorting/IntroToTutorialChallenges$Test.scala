package algorithms.sorting

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 18/12/16.
  * Copyright © 2016 Datlinq B.V..
  */
class IntroToTutorialChallenges$Test extends WordSpec with Matchers {

  "IntroToTutorialChallenges" should {
    "Test Case #0" in {
      assert(
        IntroToTutorialChallenges.runMain("4\n6\n1 4 5 7 9 12") == "1"
      )
      assert(
        IntroToTutorialChallenges.runMain("9\n6\n1 4 5 7 9 12") == "4"
      )
    }
  }
}