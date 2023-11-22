package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var pi = 3.14159
    var input = Scanner(System.`in`)

    var A = input.nextDouble()
    var B = input.nextDouble()
    var C = input.nextDouble()

    var triangle = (0.5*A*C)
    var circle = pi*C*C
    var trapezium = (0.5*(A+B)*C)
    var square = B*B
    var rectangle = A*B

    println("TRIANGULO: %.3f".format(triangle))
    println("CIRCULO: %.3f".format(circle))
    println("TRAPEZIO: %.3f".format(trapezium))
    println("QUADRADO: %.3f".format(square))
    println("RETANGULO: %.3f".format(rectangle))

}
