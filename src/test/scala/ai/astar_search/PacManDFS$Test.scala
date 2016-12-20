package ai.astar_search

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 20/12/16.
  * Copyright © 2016 Datlinq B.V..
  */
class PacManDFS$Test extends WordSpec with Matchers {

  "PacManDFS" should {
    "Test Case #0" in {
      assert(
        PacManDFS.runMain("3 9  \n5 1  \n7 20  \n%%%%%%%%%%%%%%%%%%%%\n%--------------%---%  \n%-%%-%%-%%-%%-%%-%-%  \n%--------P-------%-%  \n%%%%%%%%%%%%%%%%%%-%  \n%.-----------------%  \n%%%%%%%%%%%%%%%%%%%% ") == "33\n3 9\n3 10\n3 11\n3 12\n3 13\n3 14\n3 15\n3 16\n2 16\n1 16\n1 17\n1 18\n2 18\n3 18\n4 18\n5 18\n5 17\n5 16\n5 15\n5 14\n5 13\n5 12\n5 11\n5 10\n5 9\n5 8\n5 7\n5 6\n5 5\n5 4\n5 3\n5 2\n5 1\n32\n3 9\n3 10\n3 11\n3 12\n3 13\n3 14\n3 15\n3 16\n2 16\n1 16\n1 17\n1 18\n2 18\n3 18\n4 18\n5 18\n5 17\n5 16\n5 15\n5 14\n5 13\n5 12\n5 11\n5 10\n5 9\n5 8\n5 7\n5 6\n5 5\n5 4\n5 3\n5 2\n5 1"
      )
    }
  }

}
