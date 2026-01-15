package com.example.designPrinciplesAndAlgo.smartherd
/*
1. In java 8 you can't mutate values of outside variable inside Lambdas
2. But in kotlin you can change the values which are outside within the lambda.

in the below example we are updating result within the lambda function
*/
fun main(){
    val program = Program2()
    var result:Int = 0
    var result2:Int = 0
    val myLambdaFsn:(Int,Int)->Unit = {a:Int,b:Int-> result = a+b}
    program.addTwoNumbers(10,11,myLambdaFsn)
    program.addTwoNumbers(5,6,{a:Int,b:Int-> result2 = a+b})

    println("${result}, ${result2}")
}

class Program2{
    fun addTwoNumbers(a:Int,b:Int,action:(Int,Int)->Unit){
        action(a,b)
    }
}
