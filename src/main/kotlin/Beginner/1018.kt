package Beginner

import java.util.Scanner
fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var amount = input.nextInt()

    println(amount)

    var hundred = amount/100
    var temp = amount%100
    println("${hundred} nota(s) de R$ 100,00")

    var fifty = temp/50
    temp = temp%50
    println("${fifty} nota(s) de R$ 50,00")

    var twenty = temp/20
    temp = temp%20
    println("${twenty} nota(s) de R$ 20,00")

    var ten = temp/10
    temp = temp%10
    println("${ten} nota(s) de R$ 10,00")

    var five = temp/5
    temp = temp%5
    println("${five} nota(s) de R$ 5,00")

    var two = temp/2
    temp = temp%2
    println("${two} nota(s) de R$ 2,00")

    var one = temp/1
    temp = temp%1
    println("${one} nota(s) de R$ 1,00")

}