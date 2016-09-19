import scala.annotation.tailrec

object P06 {

  def isPalindrome[A](list: List[A]): Boolean = {

    @tailrec
    def isPalindrome[B](list: List[B], reverse: List[B]): Boolean = {
      (list, reverse) match {
        case (e1 :: Nil, e2 :: Nil) if e1 == e2 => true
        case (e1 :: tail1, e2 :: tail2) if e1 == e2 => isPalindrome(tail1, tail2)
        case _ => false
      }
    }

    list match {
      case Nil => true
      case e :: Nil => true
      case _ => isPalindrome(list, P05.reverse(list))
    }
  }

}
