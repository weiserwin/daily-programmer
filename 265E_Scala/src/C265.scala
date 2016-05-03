object C265 {

  def indexInPermutations(size : Int, index : Int) : String = {
    return (0 until size).permutations.drop(index - 1).next().mkString(" ")
  }

  def indexInCombinations(size : Int, bound : Int, index : Int) : String = {
    return (0 until bound).combinations(size).drop(index - 1).next().mkString(" ")
  }

  def main(args: Array[String]) {
    println("Permutations : ")
    println(indexInPermutations(6, 240))
    println(indexInPermutations(7, 3240))
    println("Combinations : ")
    println(indexInCombinations(3, 8, 24))
    println(indexInCombinations(4, 9, 112))
  }
}
