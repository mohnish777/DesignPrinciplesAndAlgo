package com.example.designPrinciplesAndAlgo

fun main(){
    infix fun Int.times(str:String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(str:String) = Pair(this,str)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

}
