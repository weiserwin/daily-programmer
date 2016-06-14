import java.math.BigDecimal

fun main(args: Array<String>) {
    println(compute(4.0,1.0))
    println(compute(4.0,4.0))
    println(compute(4.0,5.0))
    println(compute(4.0,6.0))
    println(compute(1.0,10.0))
    println(compute(100.0,200.0))
    println(compute(8.0,20.0))
}

fun compute(d: Double, h: Double) : Double {
    val qr = BigDecimal(h).divideAndRemainder(BigDecimal(d))
    val q = qr[0].toDouble() // quotient
    val r = qr[1].toInt() // remainder

    val r_OrMore = (d-r+1)/d // probability to roll $r or more on a $d-faced dice
    val q_d_InARow = Math.pow((1/d),q) // probability to roll $q times the max value on a $d-faced dice

    if (r == 0) return q_d_InARow
    else if (h < d) return r_OrMore
    else return r_OrMore * q_d_InARow
}