package com.example.designPrinciplesAndAlgo.smartherd

fun main(){

    val program = Program3()
    program.reverseAndDisplay("Hello",{s:String -> s.reversed()})
    // in the above lambda function we are only passing one lambda function
    // we can use `it` keyword whenever the is only one element and we can eliminate the arrow.
    program.reverseAndDisplay("Mohnish",{it.reversed()})
}


class Program3{
    fun reverseAndDisplay(str:String,myFunc:(String)->String){ // high level function with lambdas
        val result = myFunc(str) // it.reversed() ===> str.reversed() ===> "hello".reversed() ===olleh
        println(result)
    }
}
