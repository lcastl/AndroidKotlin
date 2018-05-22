package seccionseis

fun main(args: Array<String>) {
    val arrayList = ArrayList<String>()
    arrayList.add("uva")
    arrayList.add("manzana")
    arrayList.add("piña")

    println("el elemento en la posicion tres es:" + arrayList[2])

    print("todos los elementos son:")
    for (elemento in arrayList){
        println(elemento)
    }

    println("todos los elementos por indice son:")
    for (frutita in 0..2){
        println(arrayList[frutita])
    }

    arrayList[1] = ("fresa")
    arrayList.set(0, "platano")
    println(arrayList)

    if (arrayList.contains("fresa")){
        println("se ha encontrado")
    } else{
        println("no se ha encontrado")
    }

    for (tamañoDesconocido in 0..arrayList.size - 1){
        println(arrayList[tamañoDesconocido])
    }
}