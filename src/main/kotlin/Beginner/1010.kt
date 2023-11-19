package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var p1c = input.nextInt()
    var p1tq = input.nextInt()
    var p1p = input.nextDouble()
    var p2c = input.nextInt()
    var p2tq = input.nextInt()
    var p2p = input.nextDouble()

    var tBill = ((p1tq*p1p)+(p2tq*p2p))

    println("VALOR A PAGAR: R$ %.2f".format(tBill))

}