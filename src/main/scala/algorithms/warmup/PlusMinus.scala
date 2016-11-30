package algorithms.warmup

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/plus-minus
  *
  * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
  * *
  * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
  * *
  * Input Format
  * *
  * The first line contains an integer, , denoting the size of the array.
  * The second line contains  space-separated integers describing an array of numbers .
  * *
  * Output Format
  * *
  * You must print the following  lines:
  * *
  * A decimal representing of the fraction of positive numbers in the array.
  * A decimal representing of the fraction of negative numbers in the array.
  * A decimal representing of the fraction of zeroes in the array.
  * Sample Input
  * *
  * 6
  * -4 3 -9 0 4 1
  * Sample Output
  * *
  *0.500000
  *0.333333
  *0.166667
  * Explanation
  * *
  * There are  positive numbers,  negative numbers, and  zero in the array.
  * The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.
  */
object PlusMinus extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arr = new Array[Int](n)
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt()
    }

    val res = arr.map(x => if (x > 0) 1 else if (x < 0) -1 else 0).groupBy(identity).map(x => x._1 -> f"${x._2.length.toDouble / arr.length}%1.6f")


    val dv = "0.000000"
    println(res.getOrElse(1, dv))
    println(res.getOrElse(-1, dv))
    println(res.getOrElse(0, dv))

  }
}
