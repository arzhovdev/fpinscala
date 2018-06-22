package chapter3

/**
  * Exercise 6: Implement a function, init , that returns a List
  * consisting of all but the last element of a List.
  */
object Exercise3_6 extends App {

  def init[A](l: List[A]): List[A] = l match {
    case Nil => sys.error("Try to init empty list")
    case Cons(_, Nil) => Nil
    case Cons(h, tail) => Cons(h, init(tail))
  }

  val ls = List(1, 2, 3, 4, 5)

  println(init[Int](ls))
}