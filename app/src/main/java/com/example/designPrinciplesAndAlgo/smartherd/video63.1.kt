package com.example.designPrinciplesAndAlgo.smartherd

class Student63{
    public val hobbies = mutableListOf<String>() // mutable to outside world

    fun addHobbies(hobbyName:String){
        hobbies.add(hobbyName)
    }
}
fun main(){
    val student = Student63()
    student.addHobbies("Cricket")
    // Accidental deletion of data: We don't want this
    student.hobbies.remove("Cricket")


//  that is the reason we have designed the new class in such a way that properties can't be modified
    val student1 = Studentt63()
    student1.addHobbies("Cricket")
    println(student1.hobbies)

    // The below code won't compile. Yay!
    //student1.hobbies.remove("Cricket")
}


// Alternate safe code using Backing Property

class Studentt63{
    private val _hobbies = mutableListOf<String>()
    public val hobbies:List<String>
    get() = _hobbies

    fun addHobbies(hobbyName:String){
        _hobbies.add(hobbyName)
    }
}
