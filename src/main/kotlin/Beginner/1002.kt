package Beginner

fun main(args: Array<String>) {
    var π = 3.14159
    var R = readLine()!!.toDouble()

    var A = π*R*R
    println("A=%.4f".format(A))

}