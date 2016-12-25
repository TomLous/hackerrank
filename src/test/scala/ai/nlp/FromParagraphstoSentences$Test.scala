package ai.nlp

import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Tom Lous on 21/12/16.
  * Copyright © 2016 Datlinq B.V..
  */
class FromParagraphstoSentences$Test extends WordSpec with Matchers {

  "FromParagraphstoSentences" should {
    "Test Case #0" in {
      assert(
        FromParagraphstoSentences$Check.checkF1Score(
          FromParagraphstoSentences.runMain("In the third category he included those Brothers (the majority) who saw nothing in Freemasonry but the external forms and ceremonies, and prized the strict performance of these forms without troubling about their purport or significance. Such were Willarski and even the Grand Master of the principal lodge. Finally, to the fourth category also a great many Brothers belonged, particularly those who had lately joined. These according to Pierre's observations were men who had no belief in anything, nor desire for anything, but joined the Freemasons merely to associate with the wealthy young Brothers who were influential through their connections or rank, and of whom there were very many in the lodge.Pierre began to feel dissatisfied with what he was doing. Freemasonry, at any rate as he saw it here, sometimes seemed to him based merely on externals. He did not think of doubting Freemasonry itself, but suspected that Russian Masonry had taken a wrong path and deviated from its original principles. And so toward the end of the year he went abroad to be initiated into the higher secrets of the order.What is to be done in these circumstances? To favor revolutions, overthrow everything, repel force by force?No! We are very far from that. Every violent reform deserves censure, for it quite fails to remedy evil while men remain what they are, and also because wisdom needs no violence. \"But what is there in running across it like that?\" said Ilagin's groom. \"Once she had missed it and turned it away, any mongrel could take it,\" Ilagin was saying at the same time, breathless from his gallop and his excitement.")
          , "In the third category he included those Brothers (the majority) who saw nothing in Freemasonry but the external forms and ceremonies, and prized the strict performance of these forms without troubling about their purport or significance.\nSuch were Willarski and even the Grand Master of the principal lodge.\nFinally, to the fourth category also a great many Brothers belonged, particularly those who had lately joined.\nThese according to Pierre's observations were men who had no belief in anything, nor desire for anything, but joined the Freemasons merely to associate with the wealthy young Brothers who were influential through their connections or rank, and of whom there were very many in the lodge.\nPierre began to feel dissatisfied with what he was doing.\nFreemasonry, at any rate as he saw it here, sometimes seemed to him based merely on externals.\nHe did not think of doubting Freemasonry itself, but suspected that Russian Masonry had taken a wrong path and deviated from its original principles.\nAnd so toward the end of the year he went abroad to be initiated into the higher secrets of the order.\nWhat is to be done in these circumstances?\nTo favor revolutions, overthrow everything, repel force by force?\nNo!\nWe are very far from that.\nEvery violent reform deserves censure, for it quite fails to remedy evil while men remain what they are, and also because wisdom needs no violence.\n\"But what is there in running across it like that?\" said Ilagin's groom.\n\"Once she had missed it and turned it away, any mongrel could take it,\" Ilagin was saying at the same time, breathless from his gallop and his excitement."
        ) >= FromParagraphstoSentences$Check.minScore
      )
    }
  }

  "FromParagraphstoSentences$Check" should {
    "Check F1 scores" in {
      assert(
        FromParagraphstoSentences$Check.checkF1Score("A\nB\nC\nD", "A\nB\nC\nD") == 1.0
      )
      assert(
        FromParagraphstoSentences$Check.checkF1Score("A\nC\nB\nD", "A\nB\nC\nD") == 1.0
      )
      assert(
        FromParagraphstoSentences$Check.checkF1Score("A\nCB\nD", "A\nB\nC\nD") == 0.57
      )
      assert(
        FromParagraphstoSentences$Check.checkF1Score("A\nCB\nD", "A\nBC\nD") == 0.66
      )
      assert(
        FromParagraphstoSentences$Check.checkF1Score("A\nCB\nD\nE\nF", "A\nB\nC\nD") == 0.44
      )
    }
  }
}

object FromParagraphstoSentences$Check {

  val minScore = 0.95

  def checkF1Score(output: String, target: String): Double = {
    val outputLines = output.split("\n").toSet
    val targetLines = target.split("\n").toSet

    val intesection = outputLines.intersect(targetLines)


    val precision = intesection.size / outputLines.size.toDouble

    val recall = intesection.size / targetLines.size.toDouble

    val f1 = (2 * precision * recall) / (precision + recall)

    Math.floor(f1 * 100) / 100
  }

}
