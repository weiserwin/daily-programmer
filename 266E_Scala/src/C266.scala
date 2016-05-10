object C266 {

  def computeDegrees(edges: String): Unit = {
    val edgesArr = edges.split("""\s""")
    val res = (1 to edgesArr.head.toInt).map(n => (n, edgesArr.tail.count(_ == n.toString)))
    res.foreach(t => println(s"Node ${t._1} has a degree of ${t._2}"))
  }

  def main(args: Array[String]) {
    val edges = "16\n1 2\n1 3\n2 3\n1 4\n3 4\n1 5\n2 5\n1 6\n2 6\n3 6\n3 7\n5 7\n6 7\n3 8\n4 8\n6 8\n7 8\n2 9\n5 9\n6 9\n2 10\n9 10\n6 11\n7 11\n8 11\n9 11\n10 11\n1 12\n6 12\n7 12\n8 12\n11 12\n6 13\n7 13\n9 13\n10 13\n11 13\n5 14\n8 14\n12 14\n13 14\n1 15\n2 15\n5 15\n9 15\n10 15\n11 15\n12 15\n13 15\n1 16\n2 16\n5 16\n6 16\n11 16\n12 16\n13 16\n14 16\n15 16"
    computeDegrees(edges)
  }
}


