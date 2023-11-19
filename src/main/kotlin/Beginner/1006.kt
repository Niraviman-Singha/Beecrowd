package Beginner
import java.util.Scanner
fun main(args: Array<String>) {


    var A = readLine()!!.toDouble()
    var B = readLine()!!.toDouble()
    var C = readLine()!!.toDouble()

    var MEDIA = (A*2 + B*3 + C*5)/(2+3+5)
    println("MEDIA = %.1f".format(MEDIA))

}
