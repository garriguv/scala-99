object P01 {
  def last[A](list: List[A]): A = list.last

  def recursiveLast[A](list: List[A]): A = list match {
    case element :: Nil => element
    case _ :: tail => recursiveLast(tail)
    case _ => throw new NoSuchElementException
  }
}
