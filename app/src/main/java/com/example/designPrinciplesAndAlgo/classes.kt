package com.example.designPrinciplesAndAlgo


// we are using "open" keyword so that we can extend, by default its "final"
open class Animal(val name:String){
    val children: MutableList<Animal> = mutableListOf()
    // if we define fun as open, it can be used for overriding.
    open fun printInformation() = println("This animal is called $name")
}
// inheritance
class Cat(name:String):Animal(name){
    override fun printInformation() = println("This cat is called $name")
    fun meow() = println("Meow!")
}


fun main(){
    val animal = Animal("Teddy")
    val child = Animal("Baby Teddy")
    animal.children.add(child)
    animal.printInformation()
    child.printInformation()

    val cat = Cat("Tiger")
    cat.children.add(Cat("Baby Tiger"))
    cat.printInformation()
    cat.meow()

}
