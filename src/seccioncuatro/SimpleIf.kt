package seccioncuatro

fun main(args: Array<String>){
    println("Cuales el sueldo?")
    val sueldo : Double = readLine()!!.toDouble()
    if (sueldo > 1000){
        println("Debe pagarimpuestos")
    }
}