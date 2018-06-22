package chapter3

import chapter3.Exercise3_9.foldRight

/**
  * Exercise 18: Write a function that turns each value in a List[Double] into a String.
  */
object Exercise3_18 extends App {

  def map[A, B](as: List[A])(f: A => B): List[B] =
    foldRight(as, Nil: List[B])((h, t) => Cons(f(h), t))


  val ls = List(1.0, 2.0, 3.0, 4.0, 5.0)

  println(ls)
  println(map(ls)(x => x * 2))
}