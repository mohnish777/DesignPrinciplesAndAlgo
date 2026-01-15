package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    val program = Program1()
    val myLambdaFsn:(Int,Int)->Int = {a,b ->a+b}
    program.addTowNumbers(5,7,myLambdaFsn)// one way
    program.addTowNumbers(10,11,{x,y ->x+y}) // 2nd way
    program.addTowNumbers(1,2){a,b ->a+b}

}


class Program1{
    fun addTowNumbers(a:Int,b:Int,action: (Int,Int)->Int){ // High level function with lambda
        val result = action(a,b)
        println(result)
    }
}



