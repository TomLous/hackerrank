package algorithms.implementation

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/sock-merchant
  * *
  * John's clothing store has a pile of  loose socks where each sock  is labeled with an integer, , denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks, and , are a single matching pair if .
  * *
  * Given  and the color of each sock, how many pairs of socks can John sell?
  * *
  * Input Format
  * *
  * The first line contains an integer, , denoting the number of socks.
  * The second line contains  space-separated integers describing the respective values of .
  * *
  * Constraints
  * *
  * Output Format
  * *
  * Print the total number of matching pairs of socks that John can sell.
  * *
  * Sample Input
  * *
  * 9
  * 10 20 20 10 10 30 50 10 20
  * Sample Output
  * *
  * 3
  * Explanation
  * *
  *sock.png
  * *
  * As you can see from the figure above, we can match three pairs of socks. Thus, we print  on a new line.
  */
object SockMerchant extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()


    val h = scala.collection.mutable.HashMap.empty[Int, Int]
    for (_ <- 0 until n) {
      val sn = sc.nextInt()

      val ss = h.getOrElse(sn, 0)
      h.put(sn, ss + 1)
    }

    val t = h.map(_._2 / 2).sum

    print(t)

  }

}