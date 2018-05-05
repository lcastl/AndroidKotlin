package secciontres

/*
1.- ()
2.- ++, -- (antes de la varaible)
2.- ^
3.- *, /
4.- +, -
5.- % mod
7.- =
8.- ++, -- (despues de la varaible)
 */

fun main(args: Array<String>){
    var num1 = 10
    val num2 = 5


    val resultado : Int?
    println(num1)
    resultado = num1++ + num2
    println("el resultado es $resultado")
    println(num1)
}