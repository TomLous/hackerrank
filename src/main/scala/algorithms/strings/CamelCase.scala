package algorithms.strings

import utils.Solution

/**
  * Created by Tom Lous on 30/11/16.
  *
  * https://www.hackerrank.com/challenges/camelcase
  * Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:
  * *
  * It is a concatenation of one or more words consisting of English letters.
  * All letters in the first word are lowercase.
  * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
  * Given , print the number of words in  on a new line.
  * *
  * Input Format
  * *
  * A single line containing string .
  * *
  * Constraints
  * *
  * Output Format
  * *
  * Print the number of words in string .
  * *
  * Sample Input
  * *
  * saveChangesInTheEditor
  * Sample Output
  * *
  * 5
  * Explanation
  * *
  * String  contains five words:
  * *
  * save
  * Changes
  * In
  * The
  * Editor
  * Thus, we print  on a new line.
  */
object CamelCase extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var s = sc.next()
    print(s.toList.map(_.toInt).filter(_ <= 90).count(_ >= 65) + 1)


  }

}
