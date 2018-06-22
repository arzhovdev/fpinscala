package chapter3

import chapter3.Exercise3_9.foldRight

/**
  * Exercise 16: Write a function that transforms a list of integers by adding 1 to each element.
  */
object Exercise3_16 extends App {

  def addOne(ls: List[Int]): List[Int] =
    foldRight(ls, Nil: List[Int])((h, t) => Cons(h + 1, t))

  val ls = List(1, 2, 3, 4, 5)

  println(ls)
  println(addOne(ls))
}