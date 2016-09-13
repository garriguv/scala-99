class P05Spec extends UnitSpec {

  "reverse" should "reverse a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P05.reverse(list) should be (List(8, 5, 3, 2, 1, 1))
  }

  "reverse" should "reverse an empty list" in {
    val list = List.empty

    P05.reverse(list) should be (List.empty)
  }

  "reverse" should "reverse a list with one element" in {
    val list = List(42)

    P05.reverse(list) should be (List(42))
  }

  "recursiveReverse" should "reverse a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P05.recursiveReverse(list) should be (List(8, 5, 3, 2, 1, 1))
  }

  "recursiveReverse" should "reverse an empty list" in {
    val list = List.empty

    P05.recursiveReverse(list) should be (List.empty)
  }

  "recursiveReverse" should "reverse a list with one element" in {
    val list = List(42)

    P05.recursiveReverse(list) should be (List(42))
  }

}
