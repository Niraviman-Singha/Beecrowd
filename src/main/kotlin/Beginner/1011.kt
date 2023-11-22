package Beginner
import java.util.Scanner

fun main(args: Array<String>) {
    val pi = 3.14159
    val input = Scanner(System.`in`)
    val R = input.nextDouble()

    val volume = (4/3.0) * pi * (R*R*R)

    println("VOLUME = %.3f".format(volume))
}
