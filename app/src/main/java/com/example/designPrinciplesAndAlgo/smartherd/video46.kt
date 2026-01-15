package com.example.designPrinciplesAndAlgo.smartherd

// Companion objects are same as 'object' but declared within a class.

fun main(){
    MyClass.count
    MyClass.typeOfCustomer()

}

class MyClass {
    companion object{
        var count:Int = -1 //Behaves like a STATIC variable

        fun typeOfCustomer():String{ //Behaves like a STATIC methods
            return "Indian"
        }
    }
}





