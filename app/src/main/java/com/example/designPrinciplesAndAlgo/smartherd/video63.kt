package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
val human = Humann63()
    human.age = 45 //set(45)
    println("Age is: ${human.age}") //get()
}

class Human63{
    public var age:Int = 0 //Original property exposed outside.Anyone can modify it.

}

//Alternate safe code using Backing Property

class Humann63{
    private var _age:Int = 0 //backing field:holds actual 'age' property data
    public var age:Int
    get() {
        return _age
    }
    set(value){
        _age = value
    }
}
//within class Human63 always use _age field to access the propert
//But outside class Human, Use age to access the property
