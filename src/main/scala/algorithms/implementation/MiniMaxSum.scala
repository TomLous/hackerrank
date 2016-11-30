package algorithms.implementation

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  * https://www.hackerrank.com/challenges/mini-max-sum
  *

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
As you can see, the minimal sum is  and the maximal sum is . Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.
  */


object MiniMaxSum extends Solution {

  def main(args: Array[String]) {
    print(io.Source.stdin.getLines()
      .next
      .split(" ")
      .map(_.toLong)
      .combinations(4)
      .map(_.sum)
      .foldLeft(Long.MaxValue, Long.MinValue) {
        case ((mn, mx), i) => (i min mn, i max mx)
      }
      .productIterator
      .toList
      .mkString(" "))
  }

}
