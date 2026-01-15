package com.example.designPrinciplesAndAlgo

fun main() {
    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }
    printAll("Hello","Hallo","Saalut","Hola","Hi")

    fun printAllWithPrefix(vararg messages: String, prefix:String) {
        for(m in messages) println(prefix+m)
    }
    println("**")

    printAllWithPrefix(
        "Hello","Hallo","Salut","Hola","Hi",
        prefix = "Greeting: "
    )
    println("**")
    fun log(vararg entries:String){
        printAll(*entries)
    }
    log("Hello","Hallo","Salut","Hola","Hi")


}
