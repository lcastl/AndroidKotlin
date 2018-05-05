package seccioncuatro

fun main(args: Array<String>){

    println("Que calificacion obtuvo en variables")
    val caliVaraibles : Int = readLine()!!.toInt()

    println("Que calificacion obtuvo en operacioneSmatematicas")
    val caliOperacionesMatematicas : Int = readLine()!!.toInt()

    println("Que calificacion obtuvo en operadoresLogicos")
    val caliOperadoresLogicos : Int = readLine()!!.toInt()

    println("Que calificacion obtuvo en condiciones")
    val caliCondiciones : Int = readLine()!!.toInt()

    val promedio = (caliVaraibles + caliOperacionesMatematicas + caliOperadoresLogicos + caliCondiciones) / 4

    if (promedio == 10){
        println("Tu resultado es sobresaliente, felicitaciones!!!. tu calificacion es $promedio")
    }else if (promedio == 9){
        println("Tu resultado es bueno. tu calificacion es $promedio")
    }else if (promedio in 6..8){
        println("Tu resultado es suficiente. tu calificacion es $promedio")
    }else{
        println("Tu resultado es insuficiente. tu calificacion es $promedio")
    }
}