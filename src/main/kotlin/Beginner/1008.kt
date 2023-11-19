package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var te = readLine()!!.toInt()
    var twt = readLine()!!.toInt()
    var spm = readLine()!!.toDouble()

    var salary = (twt*spm)

    println("NUMBER = ${te}")
    println("SALARY = U$ %.2f".format(salary))

}
