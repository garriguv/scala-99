class P03Spec extends UnitSpec {

  "nth" should "return the nth element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P03.nth(3, list) should be (3)
  }

  "nth" should "throw an assertion if n < 0" in {
    val list = List(1, 1, 2, 3, 5, 8)

    an[NoSuchElementException] should be thrownBy P03.nth(-1, list)
  }

  "nth" should "throw an assertion if is bigger than the length of the list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    an[IndexOutOfBoundsException] should be thrownBy P03.nth(100, list)
  }

  "recursiveNth" should "return the nth element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P03.recursiveNth(3, list) should be (3)
  }

  "recursiveNth" should "throw an assertion if n < 0" in {
    val list = List(1, 1, 2, 3, 5, 8)

    an[NoSuchElementException] should be thrownBy P03.recursiveNth(-1, list)
  }

  "recursiveNth" should "throw an assertion if is bigger than the length of the list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    an[NoSuchElementException] should be thrownBy P03.recursiveNth(100, list)
  }

}
