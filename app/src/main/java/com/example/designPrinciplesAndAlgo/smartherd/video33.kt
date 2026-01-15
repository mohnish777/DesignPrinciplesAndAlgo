package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    val x: Int = 6
    val y: Int = 10

    val greaterVal = x greaterValue y
    println(greaterVal)
}

infix fun Int.greaterValue(other:Int): Int{ // Infix function and also Extension function.
    if (this > other){
        return this
    }else{
        return other
    }
}

/*
1. All Infix function are extension function
but all extension function are not infix function

2. Infix function just have "ONE" parameter
 */
