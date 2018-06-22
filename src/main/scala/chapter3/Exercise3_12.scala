package chapter3

import chapter3.Exercise3_10.foldLeft

/**
  * Exercise 12: Write a function that returns the reverse of a list
  */
object Exercise3_12 extends App {

  def reverse[A](l: List[A]): List[A] = {
    foldLeft(l, List[A]())((z,x)=> Cons(x, z))
  }

  val ls = List(1, 2, 3, 4, 5)

  println(reverse(ls))
}