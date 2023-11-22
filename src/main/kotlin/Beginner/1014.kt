package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var X = input.nextInt()
    var Y = input.nextDouble()

    var average = X/Y

    println("%.3f km/l".format(average))

}
