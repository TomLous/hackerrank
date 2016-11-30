package algorithms.warmup

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/simple-array-sum/submissions/code/33104816
  * Given an array of  integers, can you find the sum of its elements?
  * *
  * Input Format
  * *
  * The first line contains an integer, , denoting the size of the array.
  * The second line contains  space-separated integers representing the array's elements.
  * *
  * Output Format
  * *
  * Print the sum of the array's elements as a single integer.
  * *
  * Sample Input
  * *
  * 6
  * 1 2 3 4 10 11
  * Sample Output
  * *
  * 31
  * Explanation
  * *
  * We print the sum of the array's elements, which is: .
  */
object SimpleArraySum extends Solution {

  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).toList(1).split(" ").map(_.toInt).sum)
  }
}
