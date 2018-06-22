package chapter3

import chapter3.Exercise3_9.foldRight

/**
  * Exercise 17: Write a function that turns each value in a List[Double] into a String.
  */
object Exercise3_17 extends App {

  def doubleToString(ls: List[Double]): List[String] =
    foldRight(ls, Nil: List[String])((h, t) => Cons(h.toString, t))

  val ls = List(1.0, 2.0, 3.0, 4.0, 5.0)

  println(ls)
  println(doubleToString(ls))
}