package chapter3

/**
  * Exercise 9: Compute the length of a list using foldRight
  */
object Exercise3_9 extends App {

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = // Utility functions
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def length[A](as: List[A]): Int = {
    foldRight(as, 0) ((_, y) => y + 1 )
  }

  val ls = List(1, 2, 3, 4, 5)

  println(length(ls))
}