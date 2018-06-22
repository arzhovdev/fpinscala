package chapter3

/**
  * Exercise 4: Implement drop function, which removes the first n elements from a list.
  */
object Exercise3_4 extends App {

  @annotation.tailrec
  def drop[A](l: List[A], n: Int): List[A] = (l, n) match {
    case (Nil, _) => sys.error("Try to drop from empty list")
    case (_, 0) => l
    case (Cons(_, t), _) => drop(t, n - 1)
  }

  val ls = List(1, 2, 3, 4, 5)

  println(drop(ls, 3))
}