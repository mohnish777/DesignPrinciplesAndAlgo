package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    var person = Person53()

    // one way of calling methods and parameters when you have to use same object again and again
    with(person){
        name = "Mohnish"
        age = 22
        startRun()
    }

    // one more way
    person.apply {
        name = "Krishna"
        age = 17
    }.startRun()

}




class Person53{

    var name:String = ""
    var age:Int = -1

    fun startRun(){
        println("Now I'm ready to run")
    }
}
