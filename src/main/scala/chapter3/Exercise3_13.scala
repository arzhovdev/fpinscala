package chapter3

import chapter3.Exercise3_10.foldLeft
import chapter3.Exercise3_12.reverse
import chapter3.Exercise3_9.foldRight

/**
  * Exercise 13: Can you write foldLeft in terms of foldRight? How about the other way around?
  * Implementing foldRight via foldLeft is useful because it lets us implement foldRight tail-recursively,
  * which means it works even for large lists without overflowing the stack.
  */
object Exercise3_13 extends App {

  def foldRight2[A, B](ls: List[A], z: B)(f: (A, B) => B): B =
    foldLeft(reverse(ls), z)((a, b) => f(b, a))


  def foldLeft2[A, B](ls: List[A], z: B)(f: (A, B) => B): B =
    foldRight(reverse(ls), z)((a, b) => f(a, b))


  val ls = List(1, 2, 3, 4, 5)

  println(foldRight2(ls, 0)(_ + _))
  println(foldLeft2(ls, 0)(_ + _))
}