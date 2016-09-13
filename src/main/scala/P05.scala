object P05 {
  def reverse[A](list: List[A]): List[A] = list.reverse

  def recursiveReverse[A](list: List[A], reverse: List[A] = List.empty): List[A] = list match {
    case element :: tail => recursiveReverse(tail, element :: reverse)
    case Nil => reverse
  }

}
