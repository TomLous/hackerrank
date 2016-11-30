package algorithms.warmup

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/time-conversion
  *
  * Given a time in -hour AM/PM format, convert it to military (-hour) time.
  * *
  * Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.
  * *
  * Input Format
  * *
  * A single string containing a time in -hour clock format (i.e.:  or ), where  and .
  * *
  * Output Format
  * *
  * Convert and print the given time in -hour format, where .
  * *
  * Sample Input
  * *
  * 07:05:45PM
  * Sample Output
  * *
  * 19:05:45
  */
object TimeConversion extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val time = sc.next()
    val inFormat = new java.text.SimpleDateFormat("hh:mm:ssaa")
    val outFormat = new java.text.SimpleDateFormat("HH:mm:ss")

    print(outFormat.format(inFormat.parse(time)))
  }
}
