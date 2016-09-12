object P04 {
  def length[A](list: List[A]): Int = list.length

  def recursiveLength[A](list: List[A], length: Int = 0): Int = list match {
    case _ :: tail => recursiveLength(tail, length + 1)
    case Nil => length
  }
}
