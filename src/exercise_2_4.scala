object exercise_2_4 {
  def uncurry[A, B, C] (f: A => B => C): (A, B) => C = {
    return (a, b) => f(a)(b)
  }

  def main(args: Array[String]): Unit = {
    val f = (a: Int) => (b: Int) => a.toString() + b.toString()
    val uncurried = uncurry(f)
    println(f(1)(2))
    println(uncurried(1, 2))
  }
}
