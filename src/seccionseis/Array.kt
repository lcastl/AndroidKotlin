package seccionseis

import kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated

fun main(args: Array<String>) {

    val arrayUno = Array<Int>(5) { 0 }

    arrayUno[1] = 5
    arrayUno[2] = 15
    arrayUno[3] = 100
    arrayUno[4] = 50

    println("Array en laposicion 3 es: " + arrayUno[3])

    for (elemento in arrayUno) {
        println(elemento)
    }

    println("Termino la busqueda por objeto")

    for (indice in 0..4) {
        println(arrayUno[indice])
    }
    println("Termino la busqueda por indice")

    val fruta = Array<String>(2) {""}
    //val fruta = Array(2) {""}, an array can be declared without the data type

    for (indice in 0..1){
        println("ingrese la fruta del indice [$indice]")
        fruta[indice] =  readLine()!!
    }

    for (indice in 0..1){
        println("la fruta en el indice [$indice] es: "+ fruta[indice])
    }
}

