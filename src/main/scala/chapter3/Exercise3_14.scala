package chapter3

import chapter3.Exercise3_9.foldRight
import chapter3.Exercise3_10.foldLeft
import chapter3.Exercise3_12.reverse

/**
  * Exercise 14: Implement append in terms of either foldLeft or foldRight.
  */
object Exercise3_14 extends App {

  def append[A](a1: List[A], a2: List[A]): List[A] = {
    foldRight(a1, a2)((x, y) => Cons(x, y))
  }

  def append2[A](a1: List[A], a2: List[A]): List[A] = {
    foldLeft(reverse(a1), a2)((x, y) => Cons(y, x))
  }

  private val ls1 = List(1, 2, 3)
  private val ls2 = List(4, 5)

  println(append(ls1, ls2))
  println(append2(ls1, ls2))
}