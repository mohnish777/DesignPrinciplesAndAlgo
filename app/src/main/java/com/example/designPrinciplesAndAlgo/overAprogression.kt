package com.example.designPrinciplesAndAlgo

fun main() {
    // print after every 2 steps
    for (x in 1..10 step 2){
        println(x)
    }
    // print down after every 3 steps
    println("--")
    for (x in 9 downTo 0 step 3){
        println(x)
    }
}
