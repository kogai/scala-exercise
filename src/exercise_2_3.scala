object exercise_2_3 {
  def curry[A, B, C] (f: (A, B) => C): A => B => C = a => b => f(a, b)

  def main(args: Array[String]): Unit = {
    val c = (a: Int, b: Int) => a.toString() + b.toString()
    val curried = curry(c)
    println(c(1, 2))
    println(curried(1)(2))
  }
}
