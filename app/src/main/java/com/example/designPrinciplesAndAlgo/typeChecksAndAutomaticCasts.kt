package com.example.designPrinciplesAndAlgo
 fun getStringLength(obj:Any):Int?{
     if (obj is String){
         // `obj` is automatically cast to `String` in this branch
         return obj.length
     }
     // `obj` is still type of `Any` outside of the type-checked branch
     return null

 }


fun main(){
    fun printObjectLength(obj:Any){
          println("Getting length of '$obj'. Result ${getStringLength(obj)?:"Error the object is not a string"}")
    }

    printObjectLength("Incomprehensibilities")
    printObjectLength(1000)
    printObjectLength(listOf(Any()))
}
