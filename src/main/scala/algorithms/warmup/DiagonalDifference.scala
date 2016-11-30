package algorithms.warmup

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/diagonal-difference
  * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
  * *
  * Input Format
  * *
  * The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.
  * *
  * Output Format
  * *
  * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
  * *
  * Sample Input
  * *
  * 3
  * 11 2 4
  * 4 5 6
  * 10 8 -12
  * Sample Output
  * *
  * 15
  * Explanation
  * *
  * The primary diagonal is:
  * 11
  * 5
  * -12
  * *
  * Sum across the primary diagonal: 11 + 5 - 12 = 4
  * *
  * The secondary diagonal is:
  * 4
  * 5
  * 10
  * Sum across the secondary diagonal: 4 + 5 + 10 = 19
  * Difference: |4 - 19| = 15
  */
object DiagonalDifference extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val a = Array.ofDim[Int](n, n)
    var sum1 = 0
    var sum2 = 0
    for (a_i <- 0 to n - 1) {
      for (a_j <- 0 to n - 1) {
        a(a_i)(a_j) = sc.nextInt()
        if (a_i == a_j) sum1 += a(a_i)(a_j)
        if (a_i + a_j == n - 1) sum2 += a(a_i)(a_j)

      }
    }

    //        print(s"$sum1 $sum2")

    print(Math.abs(sum1 - sum2))

  }
}

