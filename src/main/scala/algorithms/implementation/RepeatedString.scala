package algorithms.implementation

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/repeated-string
  * Lilah has a string, , of lowercase English letters that she repeated infinitely many times.
  * *
  * Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.
  * *
  * Input Format
  * *
  * The first line contains a single string, .
  * The second line contains an integer, .
  * *
  * Constraints
  * *
  * For  of the test cases, .
  * Output Format
  * *
  * Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.
  * *
  * Sample Input 0
  * *
  * aba
  * 10
  * Sample Output 0
  * *
  * 7
  * Explanation 0
  * The first  letters of the infinite string are abaabaabaa. Because there are  a's, we print  on a new line.
  * *
  * Sample Input 1
  * *
  * a
  * 1000000000000
  * Sample Output 1
  * *
  * 1000000000000
  * Explanation 1
  * Because all of the first  letters of the infinite string are a, we print  on a new line.
  */
object RepeatedString extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val s = sc.next()
    val n = sc.nextLong()
    val i = n / s.length
    val numA = s.toList.count(_ == 'a')
    val rem = (n % s.length).toInt
    val numARem = s.substring(0, rem).toList.count(_ == 'a')


    val t = (numA * i) + numARem
    print(t)
  }
}