package chapter3

import chapter3.Exercise3_10.foldLeft

/**
  * Exercise 11: Write sum, product, and a function to compute the length of a list using foldLeft.
  */
object Exercise3_11 extends App {

  def sum(ns: List[Int]) =
    foldLeft(ns, 0)((x,y) => x + y) // `_ + _` is more concise notation for `(x,y) => x + y`; see sidebar

  def product(ns: List[Int]) =
    foldLeft(ns, 1.0)(_ * _) // `_ * _` is more concise notation for `(x,y) => x * y`; see sidebar

  val ls = List(1, 2, 3, 4, 5)

  println(sum(ls))
  println(product(ls))
}