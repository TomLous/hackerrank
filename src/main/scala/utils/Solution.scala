package utils

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}

/**
  * Created by Tom Lous on 30/11/16.
  * Copyright © 2016 Datlinq B.V..
  */
trait Solution {

  def main(args: Array[String])

  def runMain(input: String, args: Array[String]=Array[String]()):String = {
    val in = new ByteArrayInputStream(input.getBytes)
    val out = new ByteArrayOutputStream
    System.setIn(in)
    Console.withOut(out)(main(args))

    out.toString
  }
}
