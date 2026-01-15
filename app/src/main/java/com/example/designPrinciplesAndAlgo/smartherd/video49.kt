package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    val program = Program()
    program.addTwoNumbers(5,2,object:MyInterface{
        override fun execute(sum: Int) {
            println(sum) //body
        }
    })
    val myLambda:(Int)->Unit = {s -> println(s)}
    program.addTwoNumbers(10,11,myLambda)
}


class Program{

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface){ // Using Interface / Object oriented way.
        val sum = a+b
        print("Interface function ")
        action.execute(sum)
    }
    fun addTwoNumbers(a: Int, b: Int, action: (Int)->Unit){
        val sum = a+b
        print("Lambda function ")
        action(sum)
    }

    fun addTwoNumbers(a:Int,b:Int){ //Simple way just for better understanding
        val sum = a+b
        println("Normal function "+sum)
    }
}

interface MyInterface{
    fun execute(sum:Int)
}













