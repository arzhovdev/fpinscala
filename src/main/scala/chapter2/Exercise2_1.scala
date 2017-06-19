package chapter2

import scala.annotation.tailrec

/**
  * Exercise 1: Write a function to compute the nth fibonacci number
  */
object Exercise2_1 extends App {
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 2) + fib(n - 1)
  }

  def fibTR(n: Int): Int = {
    @tailrec
    def loop(n: Int, acc: (Int, Int)): Int = {
      if (n == 0) {acc._1}
      else if (n == 1) {acc._2}
      else {loop(n - 1, (acc._2, acc._1 + acc._2))}
    }

    loop(n, (0, 1))
  }

  for (n <- 0 to 10) {
    println(s"${fib(n)} ${fibTR(n)}")
  }
}