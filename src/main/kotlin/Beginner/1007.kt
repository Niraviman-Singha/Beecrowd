package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var A = readLine()!!.toInt()
    var B = readLine()!!.toInt()
    var C = readLine()!!.toInt()
    var D = readLine()!!.toInt()

    var DIFERENCA = (A*B-C*D)
    println("DIFERENCA = ${DIFERENCA}")

}
