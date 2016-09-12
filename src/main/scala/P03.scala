object P03 {

  def nth[A](index: Int, list: List[A]): A =
    if (index >= 0) {
      list(index)
    } else {
      throw new NoSuchElementException
    }

  def recursiveNth[A](index: Int, list: List[A]): A = (index, list) match {
    case (0, element :: _) => element
    case (idx, _ :: tail) => recursiveNth(idx - 1, tail)
    case _ => throw new NoSuchElementException
  }

}
