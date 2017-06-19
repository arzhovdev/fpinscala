package chapter2

/**
  * Exercise 2: Implement a polymorphic function to check whether an `Array[A]` is sorted
  */
object Exercise2_2 extends App {
  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if(n >= as.length - 1) true
      else if (gt(as(n), as(n + 1))) loop(n +1)
      else false
    }

    loop(0)
  }

  import scala.runtime.ScalaRunTime.stringOf

  private val as1 = Array(1, 2, 3, 4, 5)
  println("Is %s ordered ACS- %b".format( stringOf(as1), isSorted[Int](as1, (x, y)=> x < y)) )

  private val as2 = Array(1, 2, 3, 1, 5)
  println("Is %s ordered ACS- %b".format( stringOf(as2), isSorted[Int](as2, (x, y)=> x < y)) )
}