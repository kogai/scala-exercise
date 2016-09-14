object exercise_2_2 {
  def isSorted[A](as: Array[A], compare: (A, A) => Boolean): Boolean = {
    if (as.length == 0 || as.length == 1) true else compare(as(0), as(1)) && isSorted(as.tail, compare)
  }

  def main(args: Array[String]): Unit = {
//    val array = Array(1,2,3,4,5)
    val array = Array(1,3,2,5,4)
    val compare = (a: Int, b: Int) => a < b
    val result = isSorted[Int](array, compare)

    print(result)
  }
}
