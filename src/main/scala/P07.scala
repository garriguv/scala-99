object P07 {

  def flatten(list: List[Any]): List[Any] = list match {
    case (list: List[_]) :: tail => flatten(list) ::: flatten(tail)
    case element :: tail => element :: flatten(tail)
    case Nil => List.empty
  }

  def flatMapFlatten(list: List[Any]): List[Any] = list flatMap {
    case list: List[_] => flatMapFlatten(list)
    case element => List(element)
  }

}
