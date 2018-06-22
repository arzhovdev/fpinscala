package chapter3

/**
  * Exercise 3: Implement the function setHead for replacing the first element
  * of a List with a different value.
  */
object Exercise3_3 extends App {

  def setHead[A](l: List[A], h: A): List[A] = l match {
    case Nil => sys.error("Try to set head into empty list")
    case Cons(_, tail) => Cons(h, tail)
  }

  val ls = List(1, 2, 3, 4, 5)

  println(setHead(ls, 0))
}