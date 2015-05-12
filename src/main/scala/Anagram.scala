import scala.collection.mutable.ListBuffer

class Anagram(s: String) {
  def matches(strings: Seq[String]) = {
    val listBuffer = ListBuffer[String]()
    for(string <- strings)
    {
      if(string.toLowerCase.permutations.contains(s.toLowerCase)
        && !string.toLowerCase.equals(s.toLowerCase))
      {
          listBuffer.append(string)
      }
    }
    listBuffer.toList
  }

}
