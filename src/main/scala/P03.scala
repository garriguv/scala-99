object P03 {

  def nth[A](index: Int, list: List[A]): A =
    if (index >= 0) {
      list(index)
    } else {
      throw new NoSuchElementException
    }

}
