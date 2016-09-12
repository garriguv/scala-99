import org.scalatest.{FlatSpec, Matchers}

class P02Spec extends FlatSpec with Matchers {

  "penultimate" should "return the last but one element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P02.penultimate(list) should be (5)
  }

  "penultimate" should "throw a NoSuchElementException if the list is empty" in {
    val list = List.empty

    an[NoSuchElementException] should be thrownBy P02.penultimate(list)
  }

}
