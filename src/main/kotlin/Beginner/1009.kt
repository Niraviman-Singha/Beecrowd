package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var name = readLine()!!.toString()
    var salary = readLine()!!.toDouble()
    var tSold = readLine()!!.toDouble()

    var tswb = ((tSold*0.15)+salary)

    println("TOTAL = R$ %.2f".format(tswb))

}
