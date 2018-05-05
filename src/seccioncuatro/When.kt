package seccioncuatro

fun main(args: Array<String>){
    val x = 16

    when(x){
        1 ->{
            println("el valor es 1")
        }
        2 -> {
            println("el valor es 2")
        }
        3 -> {
            println("el valor es 3")
        }
        in 5..15 -> println("el valor esta entre 5 y 15")
        !in 5..15 -> println("el valor no esta entre 5 y 15")
        else -> {
            println("el valor esta fuera de rango")
        }
    }
    val promedio = 8
   val resultado = when(promedio){
        10 -> "Tu resultado es sobresaliente, felicitaciones!!!. tu calificacion es $promedio"
        9 -> "Tu resultado es bueno. tu calificacion es $promedio"
        6,7,8 ->  "Tu resultado es suficiente. tu calificacion es $promedio"
        else -> "Tu resultado es insuficiente. tu calificacion es $promedio"
    }
    println(resultado)
}