package chapter3

/**
  * Exercise 1: What will be the result of the following match expression?
  */
object Exercise3_1 extends App {
  import List._

  val z = List(1,2,3,4,5) match {
    case Cons(i, Cons(2, Cons(4, _))) => i
    case Nil => 42
    case Cons(i, Cons(y, Cons(3, Cons(4, _)))) => i + y
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }

  println(s"z = $z")
}