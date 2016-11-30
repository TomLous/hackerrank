package algorithms.warmup

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  *
  * https://www.hackerrank.com/challenges/compare-the-triplets
  * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.
  * *
  * We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .
  * *
  * Your task is to find their comparison scores by comparing  with ,  with , and  with .
  * *
  * If , then Alice is awarded  point.
  * If , then Bob is awarded  point.
  * If , then neither person receives a point.
  * Given  and , can you compare the two challenges and print their respective comparison points?
  * *
  * Input Format
  * *
  * The first line contains  space-separated integers, , , and , describing the respective values in triplet .
  * The second line contains  space-separated integers, , , and , describing the respective values in triplet .
  * *
  * Constraints
  * *
  * Output Format
  * *
  * Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.
  * *
  * Sample Input
  * *
  * 5 6 7
  * 3 6 10
  * Sample Output
  * *
  * 1 1
  * Explanation
  * *
  * In this example:
  * *
  * Now, let's compare each individual score:
  * *
  * , so Alice receives  point.
  * , so nobody receives a point.
  * , so Bob receives  point.
  * Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.
  *
  */
object CompareTheTriplets extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val a0 = sc.nextInt()
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val b0 = sc.nextInt()
    val b1 = sc.nextInt()
    val b2 = sc.nextInt()
    val a = List(a0, a1, a2)
    val b = List(b0, b1, b2)
    val (ra, rb) = a.zip(b).foldLeft((0, 0)) { case ((a, b), (c, d)) => if (c > d) (a + 1, b) else if (d > c) (a, b + 1) else (a, b) }
    print(s"$ra $rb")
  }
}
