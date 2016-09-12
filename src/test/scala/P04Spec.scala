class P04Spec extends UnitSpec {
  "length" should " return the length of a List" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P04.length(list) should be (6)
  }

  "length" should " return the length of an empty List" in {
    val list = List.empty

    P04.length(list) should be (0)
  }

  "recursiveLength" should " return the length of a List" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P04.recursiveLength(list) should be (6)
  }

  "recursiveLength" should " return the length of an empty List" in {
    val list = List.empty

    P04.recursiveLength(list) should be (0)
  }
}
