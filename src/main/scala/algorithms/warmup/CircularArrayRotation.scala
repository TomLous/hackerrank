package algorithms.warmup

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/circular-array-rotation
  *
  * John Watson performs an operation called a right circular rotation on an array of integers, . After performing one right circular rotation operation, the array is transformed from  to .
  * *
  * Watson performs this operation  times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks  queries, where each query consists of a single integer, , for which you must print the element at index  in the rotated array (i.e., the value of ).
  * *
  * Input Format
  * *
  * The first line contains  space-separated integers, , , and , respectively.
  * The second line contains  space-separated integers, where each integer  describes array element  (where ).
  * Each of the  subsequent lines contains a single integer denoting .
  * *
  * Constraints
  * *
  * Output Format
  * *
  * For each query, print the value of the element at index  of the rotated array on a new line.
  * *
  * Sample Input
  * *
  * 3 2 3
  * 1 2 3
  * 0
  * 1
  * 2
  * Sample Output
  * *
  * 2
  * 3
  * 1
  * Explanation
  * *
  * After the first rotation, the array becomes .
  * After the second (and final) rotation, the array becomes .
  * *
  * Let's refer to the array's final state as array . For each query, we just have to print the value of  on a new line:
  * *
  * , so we print  on a new line.
  * , so we print  on a new line.
  * , so we print  on a new line.
  */
object CircularArrayRotation extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val q = sc.nextInt()
    val a = new Array[Int](n)
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt()
    }

    def rotate(i: Int) = (a.view.drop(n - i % n) ++ a.view.take(n - i % n)).toList
    val r = rotate(k)

    var a0 = 0;
    while (a0 < q) {
      val m = sc.nextInt()
      println(r(m))
      a0 += 1;
    }


  }
}
