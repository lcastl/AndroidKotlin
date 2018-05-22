package seccionseis

import java.util.*

fun main(args: Array<String>) {

    val nums = listOf(1,2,3,4,5,6)

    for (elementos in nums){
        println(elementos)
    }

    for ((indice, elemento) in nums.withIndex()){
        println("$indice : $elemento")
    }

    val map = TreeMap<String, Int>()

    map["caste"] = 27
    map["alix"] = 36

    for ((nombre, edad) in map){
        println("$nombre : $edad")
    }

}
