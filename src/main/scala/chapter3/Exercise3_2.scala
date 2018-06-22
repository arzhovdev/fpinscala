package chapter3

/**
  * Exercise 2: Implement the function tail for removing the first element of a List.
  */
object Exercise3_2 extends App {

  def tail[A](l: List[A]): List[A] = l match {
    case Nil => sys.error("Try to get tail of empty list")
    case Cons(_, tail) => tail
  }

  val ls = List(1, 2, 3, 4, 5)

  println(s"tail of list $ls is ${tail(ls)}")
}