package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    var dog = Dog40("Black","Pug")
}


open class AnimaL40(var color:String){
    init {
        println("From Animal Init: $color")
    }
}


class Dog40(color:String, var breed:String):AnimaL40(color){
    init {
        println("From Dog Init: $color and $breed")
    }
}
