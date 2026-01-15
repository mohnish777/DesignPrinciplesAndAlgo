package com.example.designPrinciplesAndAlgo

fun main() {
    val fruits =listOf("Orange", "Banana", "Kiwi")
    for(fruit in fruits){
        println(fruit)
        when(fruit){
            "Orange"->println("its a orange")
            "Banana"->println("its a banana")
        }

    }

    when {
        "Banana" in fruits-> println("Banana is fine too")
        "Orange" in fruits-> println("Juicy")

    }



}
