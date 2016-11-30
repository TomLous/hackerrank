package algorithms.warmup

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/staircase
  *
  * Consider a staircase of size :
  * *
  * #
  * ##
  * ###
  * ####
  * Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
  * *
  * Write a program that prints a staircase of size .
  * *
  * Input Format
  * *
  * A single integer, , denoting the size of the staircase.
  * *
  * Output Format
  * *
  * Print a staircase of size  using # symbols and spaces.
  * *
  * Note: The last line must have  spaces in it.
  * *
  * Sample Input
  * *
  * 6
  * Sample Output
  * *
  * #
  * ##
  * ###
  * ####
  * #####
  * ######
  * Explanation
  * *
  * The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
  */
object Staircase extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()

    def rec(h: Int, s: Int): Unit = {
      if (s >= 0) {
        println((" " * s) + ("#" * h))
        rec(h + 1, s - 1)
      }
    }
    rec(1, n - 1)
  }
}

