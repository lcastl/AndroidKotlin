package seccioncuatro

fun main(args: Array<String>){
    println("Ingresa la medida en metros")
    val medida : Double = readLine()!!.toDouble()
    if (medida >= 1.00){
        if (medida > 5.00){
            println("la medida $medida sobrepasa los limites aceptados")

        }else {
            println("la medida $medida es aceptable")
        }
    }else {
        println("lo siento, no es aceptable")
    }
}