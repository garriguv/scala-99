import org.scalatest.{FlatSpec, Matchers}

class P01Spec extends FlatSpec with Matchers {

  "last" should "return the last element in a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P01.last(list) should be (8)
  }

  "last" should "throw a NoSuchElementException if the list is empty" in {
    val list = List.empty

    an[NoSuchElementException] should be thrownBy P01.last(list)
  }

}
