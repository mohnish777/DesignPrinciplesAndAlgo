package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    var student = Student()
    println("Pass status: "+ student.hasPassed(57))
    println("Scholorship Status: "+ student.isScholar(90))
}


// when we say class.method (in this case Student.isScholar); behind the curtain static method gets introduced within the class
// so we don't need to go inside the class and write it.
fun Student.isScholar(marks:Int):Boolean{
    return marks>95
}

class Student(){
    fun hasPassed(marks:Int):Boolean{
        return marks>40
    }
}
