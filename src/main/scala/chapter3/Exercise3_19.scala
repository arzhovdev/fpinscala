package chapter3

import chapter3.Exercise3_9.foldRight

/**
  * Exercise 19: Write a function filter that removes elements from a list unless they satisfy a given predicate.
  * Use it to remove all odd numbers from a List[Int].
  */
object Exercise3_19 extends App {

  def filter[A](as: List[A])(f: A => Boolean): List[A] =
    foldRight(as, Nil: List[A])((h, t) => if (f(h)) Cons(h, t) else t)


  val ls = List(1, -2, 3, -4, 5)

  println(ls)
  println(filter(ls)(_ > 0))
}