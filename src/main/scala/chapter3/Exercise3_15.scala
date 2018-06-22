package chapter3

import chapter3.Exercise3_14.append

/**
  * Exercise 15: Write a function that concatenates a list of lists into a single list. Its runtime
  * should be linear in the total length of all lists. Try to use functions we have already defined.
  */
object Exercise3_15 extends App {

  def concat[A](lls: List[List[A]]): List[A] = lls match {
    case Nil => Nil
    case Cons(h, t) => append(h, concat(t))
  }


  private val ls1 = List(1, 2, 3)
  private val ls2 = List(4, 5)
  private val ls3 = List(6, 7, 8)
  private val ls4 = List(9)

  private val lls = List(ls1, ls2, ls3, ls4)

  println(concat(lls))
}