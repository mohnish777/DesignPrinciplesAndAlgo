package com.example.designPrinciplesAndAlgo


fun describe(obj:Any): String =
    when (obj){
        1 ->"Its one"
        "Hello" -> "Greetings"
        is Long ->"Long number"
        !is String -> "not a string"
        else ->"Unknown"
}
fun main(){
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("Other"))
}
