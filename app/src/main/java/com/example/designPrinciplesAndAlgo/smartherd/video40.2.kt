package com.example.designPrinciplesAndAlgo.smartherd


fun main() {
    var dog = Dog40_2("Black", "Pug")
}

open class Animal40_2 {
    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}


class Dog40_2 : Animal40_2 {
    var breed: String = ""

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
        println("From Dog: $color and $breed")
    }
}







