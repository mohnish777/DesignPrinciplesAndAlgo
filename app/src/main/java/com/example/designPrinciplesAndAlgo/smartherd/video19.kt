package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    fun execute():String{
        var x = 20
        when (x) {
            in 1..19 ->return "value of x is between 1 to 10"
            25->return "X is 25"
            20->return "x is 20"
            else -> return "Not present"
        }

    }
    println(execute())

    var y=2
    var str:String =when(y){
        1->"Str is 1"
        2->"Str is 2"
        else->"not present"
    }
    print(str)
}
