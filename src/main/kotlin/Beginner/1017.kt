package Beginner

import java.util.Scanner
fun main(args: Array<String>){
    var input = Scanner(System.`in`)

    var spentTime = input.nextInt()
    var avgSpeed = input.nextInt()

    var totalDistance = spentTime*avgSpeed

    var totalFuel = totalDistance.toDouble()/12

    println("%.3f" .format(totalFuel))
}