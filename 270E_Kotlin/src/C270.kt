import java.io.File

fun main(args: Array<String>) {
mirrorText("src/input.txt")
}


fun mirrorText(input : String) {
    val lines = File(input).readLines()
    val res = lines.maxBy { l -> l.length }?.indices?.map {
        i -> lines.map { l -> l.getOrElse(i) {' '} }
    }

    res?.forEach { l -> println(l.joinToString(" ")) }
}