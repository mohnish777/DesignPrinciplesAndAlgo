package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    CustomerData.count = 98 // objects in kotlin behaves like a static in java, so you don't have to create instances of class.
    CustomerData.typeOfCustomer()
    println(CustomerData.count)
    CustomerData.count = 100
    println(CustomerData.count)
    CustomerData.myMethod("Hello")
}

open class MySuperClass{
    open fun myMethod(str:String){
        println("MySuperClass")
    }
}
object CustomerData : MySuperClass(){
    var count:Int = -1 // behaves like static variable

    fun typeOfCustomer():String{ // behaves like static method
        return "Indian"
    }

    override fun myMethod(str: String) { // Currently, behaving like a static method
        super.myMethod(str)
        println("object CustomerData:" + str)
    }
    init {
        // you can initialise
    }
}

/*
When we use keyword 'object'
1. Kotlin internally, creates a class and an object/instance
These 'objects'
1. can have properties, methods and initializers
2. Cannot have Constructors
   a. as we cannot create object/instance manually
3.'object' can also have super class
   a. Supports Inheritance.

* */
