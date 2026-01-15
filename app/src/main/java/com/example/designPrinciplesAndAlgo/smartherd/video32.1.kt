package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    var str1: String = "Hello "
    var str2: String = "World"
    var str3:String = "Hey "
    var finalstr:String = str3.add(str1, str2)
    println("The final string is: "+finalstr)

    val x:Int = 6
    val y:Int = 18
    val greaterValue = x.greaterVal(y)
    println("The greater value is: $greaterValue")
}

// here I'm inserting add fsn in reserve/default kotlin class which is "String"
fun String.add(s1:String, s2:String):String{
    return this + s1+ s2
}

fun Int.greaterVal(other:Int):Int{
    if( this> other){
        return this
    }else{
        return other
    }
}
