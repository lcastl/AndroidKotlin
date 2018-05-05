package secciontres

fun main(args: Array<String>){
    println("Ingrese el primer numero");
    val num1 : Int = readLine()!!.toInt();

    println("Ingrese el segundo numero");
    val num2 : Int = readLine()!!.toInt();

    val resultado = num1/num2;

    println("el resultado es $resultado");

}