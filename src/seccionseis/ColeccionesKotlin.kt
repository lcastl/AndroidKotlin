package seccionseis

fun main(args: Array<String>) {
    val hashMap = hashMapOf(1 to "caste", 2 to "alix")
    hashMap.put(50, "alo")
    println(hashMap[50])

    val letras = arrayOf("a", "b", "c")
    println(letras[1])

    letras[1] = "z"

    val nums = listOf(0, 1, 2, -12, -24)

    for (elemento in nums){
        println(elemento)
    }
}