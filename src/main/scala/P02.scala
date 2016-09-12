object P02 {

  def penultimate[A](list: List[A]): A =
    list.init.last

  def recursivePenultimate[A](list: List[A]): A = list match {
    case element :: _ :: Nil => element
    case _ :: tail => recursivePenultimate(tail)
    case _ => throw new NoSuchElementException
  }
}
