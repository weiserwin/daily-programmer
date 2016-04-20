object C260 {
  import scala.util.{Try,Success,Failure}

  def maybeNumeric(input : String) : (Any,String) = {
    Try(BigDecimal(input)) match {
      case Success(number) => (number,"Number")
      case Failure(f) => (input,"String")
    }
  }

  def bonus2(input : String) : Unit = {
    println(s"\n***** $input *****")
    input.split("`").map(l =>
      l.split(" ").foreach(n =>
        println(maybeNumeric(n))
      )
    )
  }


  def main(args: Array[String]) {
//    println(maybeNumeric("123"))
//    println(maybeNumeric("44.234"))
//    println(maybeNumeric("0x123N"))
//    println(maybeNumeric("3.23e5"))
//    println(maybeNumeric("1293712938712938172938172391287319237192837329"))
//    println(maybeNumeric(".25"))

    bonus2("123")
    bonus2("44.234")
    bonus2("0x123N")
    bonus2("3.23e5")
    bonus2("1293712938712938172938172391287319237192837329")
    bonus2(".25")
    bonus2("123 234 345")
    bonus2("2015 4 4`Challenge #`261`Easy")
    bonus2("234.2`234ggf 45`00`number string number (0)")

  }
}
