object exercise_2_5 {
  def compose [A, B, C] (f: B => C, g: A => B): A => C = a => f(g(a))
  def main(args: Array[String]): Unit = {
    val f = (n: Double) => n.toString()
    val g = (n: Int) => n.toDouble / 2
    println(compose(f, g)(3))
  }
}
