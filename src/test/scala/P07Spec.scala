class P07Spec extends UnitSpec {

  "flatten" should "flatten a list of lists" in {
    val list = List(List(1, 1), 2, List(3, List(5, 8)))

    P07.flatten(list) should be (List(1, 1, 2, 3, 5, 8))
  }

  "flatten" should "flatten a list with a single element" in {
    val list = List(1)

    P07.flatten(list) should be (List(1))
  }

  "flatten" should "flatten a list with a single list element" in {
    val list = List(List(1))

    P07.flatten(list) should be (List(1))
  }

  "flatten" should "flatten an empty list" in {
    val list = List.empty

    P07.flatten(list) should be (List.empty)
  }

  "flatMapFlatten" should "flatten a list of lists" in {
    val list = List(List(1, 1), 2, List(3, List(5, 8)))

    P07.flatMapFlatten(list) should be (List(1, 1, 2, 3, 5, 8))
  }

  "flatMapFlatten" should "flatten a list with a single element" in {
    val list = List(1)

    P07.flatMapFlatten(list) should be (List(1))
  }

  "flatMapFlatten" should "flatten a list with a single list element" in {
    val list = List(List(1))

    P07.flatMapFlatten(list) should be (List(1))
  }

  "flatMapFlatten" should "flatten an empty list" in {
    val list = List.empty

    P07.flatMapFlatten(list) should be (List.empty)
  }

}
