import scala.collection.mutable.ListBuffer

class Anagram(s: String) {
  def matches(strings: Seq[String]) = {
    val listBuffer = ListBuffer[String]()
    for(chaine <- strings) {
      if(chaine.permutations.contains(s)) {
        listBuffer.append(chaine)
      }
    }
    listBuffer.toList
  }

}
