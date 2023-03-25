import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.pow
import kotlin.math.round
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Title : Plus Minus
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here

    var p: List<Int> = listOf()
    var n: List<Int> = listOf()
    var z: List<Int> = listOf()
    for (c in 1..3) {
        //1 = positive
        //2 = negative
        //3 = zero
        if (c == 1) {
            p = arr.filter {
                it >= 1
            }
        }
        if (c == 2) {
            n = arr.filter {
                it <= -1
            }
        }
        if (c == 3) {
            z = arr.filter {
                it == 0
            }
        }
    }

    var pstring = String.format("%.6f", p.size.toFloat() / arr.size.toFloat())
    var nstring = String.format("%.6f", n.size.toFloat() / arr.size.toFloat())
    var zstring = String.format("%.6f", z.size.toFloat() / arr.size.toFloat())


    println(pstring)
    println(nstring)
    println(zstring)
    /*
    !!!!!!!!!!!alternative method to round up float number
    val decimalPlaces = 6
    val multiplier = 10.0.pow(decimalPlaces)

    var out = p.size.toFloat() / arr.size.toFloat()
    var roundedNumber = round(out * multiplier) / multiplier
    println((p.size))
    println((arr.size))
    println(roundedNumber)
    out = n.size.toFloat() / arr.size.toFloat()
    roundedNumber = round(out * multiplier) / multiplier
    println(roundedNumber)
    out = z.size.toFloat() / arr.size.toFloat()
    roundedNumber = round(out * multiplier) / multiplier
    println(roundedNumber)
    */

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
/*
6
1 2 -2 -1 0 -2


 */