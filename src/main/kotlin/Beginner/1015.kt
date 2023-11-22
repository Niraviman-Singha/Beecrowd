package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var x1 = input.nextDouble()
    var y1 = input.nextDouble()
    var x2 = input.nextDouble()
    var y2 = input.nextDouble()

    var a = (x2-x1)*(x2-x1)
    var b = (y2-y1)*(y2-y1)
    var c = a+b

    var root:Double
    root = Math.sqrt(c)

    println("%.4f".format(root))

}
