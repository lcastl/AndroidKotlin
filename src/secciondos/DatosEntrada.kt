package secciondos

fun main(args: Array<String>){
    println("Cual es tu nombre?");
    var nombre = readLine();
    println(nombre);

    println("Cual es tu edad?");
    var edad : Int = readLine()!!.toInt();
    println(edad);
}