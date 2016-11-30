package algorithms.implementation

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
class SockMerchant$Test extends WordSpec with Matchers {

  "SockMerchant" should {
    "Test Case #0" in {
      assert(
        SockMerchant.runMain("9\n10 20 20 10 10 30 50 10 20") == "3"
      )
    }
  }

}
