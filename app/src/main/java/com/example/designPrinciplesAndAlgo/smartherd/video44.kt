package com.example.designPrinciplesAndAlgo.smartherd


/*
Any class contains functions such as:
 equals():Boolean
 hashCode():Int
 toString():String
 */
//9379091381

fun main() {

    val user1 = User("Sam", 10)
    val user2 = User("Sam", 10)
    val user3 = User2("krishna",200)

    println(user1)
    println(user2) // this will not print the reference address, data class only cares about data.
    println(user3)// this will print the address of the reference, cos this is not a data class

    if (user1 == user2) {
        println("Both are same")
    } else {
        println("Not Equal")
    }
    val newUser = user1.copy(name="Mohnish", id=30)
    println(newUser)

}

    data class User(val name:String, val id:Int)
    class User2(val name:String, val id:Int)
