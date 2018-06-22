package chapter3

/**
  * Exercise 10: Write another general list-recursion function, foldLeft, that is tail-recursive
  */
object Exercise3_10 extends App {

  @annotation.tailrec
  def foldLeft[A,B](l: List[A], z: B)(f: (B, A) => B): B = l match {
    case Nil => z
    case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
  }

  val ls = List(1, 2, 3, 4, 5)

  println(foldLeft(ls, 0)(_ + _))
}