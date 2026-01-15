package com.example.designPrinciplesAndAlgo.smartherd

fun main(){

}


class TestClass{
    // person.a, person.b are not visible.
    // person.b is only visible in child classes not is some other classes.

    // person.c, person.d are visible.
    fun testing(){
        var person = Person41()
        println(person.c)
    }
}


open class Person41{     //super class
    private val a = 1
    protected val b = 2
    internal val c = 3
    public val d = 4     //public by default
}

class Indian41: Person41(){
    // a is not visible
    // b, c, d are visible
}
