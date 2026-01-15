package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    var student = Student35("Mohnish", 10)
    println("Name of student " + student.name)
    println("Id of student " + student.id)
}

class Student35(_name: String) {
    var name: String = "dummy"
    var id: Int = -1

    init {
        this.name = _name
        println("Student has got a name as $name and id is $id")
    }

    constructor(name: String, id: Int) : this(name) {
        // The body of the secondary constructor is called after the init block.
        this.id = id
    }
}
