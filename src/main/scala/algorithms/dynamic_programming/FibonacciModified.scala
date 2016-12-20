package algorithms.dynamic_programming

import utils.Solution

import scala.annotation.tailrec

/**
  * Created by Tom Lous on 20/12/16.
  * https://www.hackerrank.com/challenges/fibonacci-modified
  * We define a modified Fibonacci sequence using the following definition:
  * *
  * Given terms  and  where , term  is computed using the following relation:
  * For example, if term  and , term , term , term , and so on.
  * *
  * Given three integers, , , and , compute and print term  of a modified Fibonacci sequence.
  * *
  * Note: The value of  may far exceed the range of a -bit integer. Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++), you will need to be more creative in your solution to compensate for the limitations of your chosen submission language.
  * *
  * Input Format
  * *
  * A single line of three space-separated integers describing the respective values of , , and .
  * *
  * Constraints
  * *
  * may far exceed the range of a -bit integer.
  * Output Format
  * *
  * Print a single integer denoting the value of term  in the modified Fibonacci sequence where the first two terms are  and .
  * *
  * Sample Input
  * *
  * 0 1 5
  * Sample Output
  * *
  * 5
  * Explanation
  * *
  * The first two terms of the sequence are  and , which gives us a modified Fibonacci sequence of . Because , we print term , which is .
  */
object FibonacciModified extends Solution {

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val t1 = sc.nextInt()
    val t2 = sc.nextInt()
    val n = sc.nextInt()
    assert(t1 >= 0 && t1 <= 2)
    assert(t2 >= 0 && t2 <= 2)
    assert(n >= 3 && n <= 20)

    @tailrec
    def fib(ti: BigInt, ti2: BigInt, n: Int): BigInt = {
      val ti3 = ti + ti2 * ti2
      //      println(s"\n$n: $ti + $ti2^2 = $ti3")
      if (n == 0) ti3
      else fib(ti2, ti3, n - 1)
    }

    val res = fib(t1, t2, n - 3)

    print(res)
  }
}
