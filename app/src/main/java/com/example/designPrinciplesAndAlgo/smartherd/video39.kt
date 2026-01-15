package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    var dog = Dog()
    println(dog.color)
    dog.eat()

}


// super, base or parent class
open class Animal {
    open var color: String = "White"

    open fun eat() {
        println("Animal is Eat")
    }
}
// child, sub or derived class
class Dog : Animal() {
    var breed: String = ""
    fun bark() {
        println("Bark")
    }
    override var color:String = "Black"
    override fun eat() {
        super<Animal>.eat() // super will call the eat method of parent class as well
        println("Dog is eating") // <Animal> is mentioned because we want eat method from Animal class only if any other parent class has same method we aren't interested
    }
}



// child, sub or derived class
class Cat : Animal() {
    var age: Int = -1
    fun meow() {
        println("Meow")
    }
}
