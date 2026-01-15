package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    val country = Country()

    //initialize it before using it
    country.name = "India"
    println("name of the country ${country.name}")


}

class Country{
    // we are promising to compiler that, we will not use this until we assign it.
    // so without assigning we can't use it.
    lateinit var name:String
}

// lateinit :-
// used only with mutable data type [var]
// used only with non-nullable data type
// values must be initiated before you use it.
