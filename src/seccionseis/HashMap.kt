package seccionseis

fun main(args: Array<String>) {
    val hashMap = HashMap<Int, String>()
    hashMap.put(1, "Merida")
    hashMap.put(200, "villa")
    hashMap.put(0, "medellin")
    hashMap.put(50, "valdivia")

    println(hashMap[200])

    hashMap.put(50, "castellanos")

    for (clave in hashMap.keys){
        println(hashMap[clave])
    }
}