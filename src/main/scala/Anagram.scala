import scala.collection.mutable.ListBuffer

//TODO : Clean code ;-)
class Anagram(s: String) {
  def matches(strings: Seq[String]) = {
    val listBuffer = ListBuffer[String]()
    for(chaine <- strings)
    {
      if(chaine.toLowerCase.permutations.contains(s.toLowerCase))
      {
        if(!chaine.toLowerCase.equals(s.toLowerCase))
        {
          listBuffer.append(chaine)
        }
      }
    }
    listBuffer.toList
  }

}
