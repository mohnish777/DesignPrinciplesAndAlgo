package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    var largeValue = max(4, 6)
    println("The grrster value is $largeValue")
}

fun max(a:Int,b:Int):Int
    = if (a>b){
        println("$a is greater")
        67
        92
        a // the one which is at end gets returned; 67 and 92 will be ignored
        }else{
            println("$b is greater")
            b
}

