package com.example.designPrinciplesAndAlgo

fun getStringLengthh(obj:Any): Int?{
    if(obj is String && obj.length > 0){
        return obj.length
    }
    return null
}




fun main(){
    fun printLength(obj:Any){
        println("Get the length of '$obj'. Result: ${getStringLengthh(obj)?:"Error: The object is not a string"}")
    }
    printLength("Incomprehensibilities")
    printLength("")
    printLength(1000)
}



