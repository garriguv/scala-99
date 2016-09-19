class P06Spec extends UnitSpec {

  "isPalindrome" should "return true when the list is a palindrome" in {
    val list = List(1, 2, 3, 2, 1)

    P06.isPalindrome(list) should be (true)
  }

  "isPalindrome" should "return true when the list contains only one element" in {
    val list = List(1)

    P06.isPalindrome(list) should be (true)
  }

  "isPalindrome" should "return true when the list is empty" in {
    val list = List.empty

    P06.isPalindrome(list) should be (true)
  }

  "isPalindrome" should "return false when the list is not a palindrome" in {
    val list = List(1, 2)

    P06.isPalindrome(list) should be (false)
  }

}
