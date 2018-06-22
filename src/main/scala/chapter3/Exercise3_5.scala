package chapter3

/**
  * Exercise 5: Implement dropWhile function, which removes elements from the List prefix
  * as long as they match a predicate.
  */
object Exercise3_5 extends App {

  @annotation.tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(h, t) => if (f(h)) dropWhile(t, f) else l
  }

  val ls = List(1, 2, 3, 4, 5)

  println(dropWhile[Int](ls, x => x < 3))
}