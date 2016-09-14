object exercise_2_1 {
  def fib(n: Int): Int = {
    if (n == 0 || n == 1) {
      return n
    }
    return fib(n - 2) + fib(n - 1)
  }

  def main(args: Array[String]): Unit = {
    val result = fib(7)
    println(result)
  }
}