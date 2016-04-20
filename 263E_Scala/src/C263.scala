object C263 {

  def log2 (n : Double) : Double = Math.log(n) / Math.log(2)

  def entropy(input : String): Double = {
    var charMap = collection.mutable.Map[Char,Int]()
    val N : Int = input.length
    input.foreach(c => {
      if (charMap contains c) charMap += (c -> (charMap(c) + 1))
      else charMap += (c -> 1)
    })
    return -charMap.map(el => (el._2.toDouble / N) * log2(el._2.toDouble / N)).sum
  }



  def main(args: Array[String]): Unit = {
    println(entropy("122333444455555666666777777788888888"))
    println(entropy("563881467447538846567288767728553786"))
    println(entropy("https://www.reddit.com/r/dailyprogrammer"))
    println(entropy("int main(int argc, char *argv[])"))
  }

}
