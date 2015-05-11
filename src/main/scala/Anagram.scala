class Anagram(s: String) {
  def matches(strings: Seq[String]) = {
    strings.filter(_.length == 3)
  }

}
