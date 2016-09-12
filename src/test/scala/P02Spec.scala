class P02Spec extends UnitSpec {

  "penultimate" should "return the last but one element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P02.penultimate(list) should be (5)
  }

  "penultimate" should "throw an Exception if the list is empty" in {
    val list = List.empty

    an[Exception] should be thrownBy P02.penultimate(list)
  }

  "recursivePenultimate" should "return the last but one element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P02.recursivePenultimate(list) should be (5)
  }

  "recursivePenultimate" should "throw an Exception if the list is empty" in {
    val list = List.empty

    an[Exception] should be thrownBy P02.recursivePenultimate(list)
  }

}
