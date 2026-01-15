package com.example.designPrinciplesAndAlgo

fun main(){
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter{it.startsWith("a")}
        .map{it.uppercase()}
        .sortedBy{it}
        .forEach{println(it)}

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map)
}
