package Beginner
import java.util.Scanner
fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var a = input.nextInt()
    var b = input.nextInt()
    var s = input.nextInt()

    var greatest = a

    if((a<b)||(a<s)){
        if(b>s){
            greatest = b
        }
        else{
            greatest = s
        }
    }

    println("${greatest} eh o maior")

}
