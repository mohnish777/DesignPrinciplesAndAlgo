package com.example.designPrinciplesAndAlgo.smartherd

/*
Array:Mutable but has Fixed size
Collections
1. Immutable collections: Read only operations
  a.Immutable List:listOf
  b.Immutable Map: mapOf
  c.Immutable Set: setOF


2. Mutable Collections: Read and write both
   a.Mutable List: ArrayList, arrayListOf, mutableListOf
   b.Mutable Map: HashMap, hashMapOf, mutableMapOf
   Mutable Set: mutableSetOf, hashSetOf

 */

fun main(){
    var myArray = Array<Int>(5){0} // Immutable. Fixed size
    myArray[0] = 32
    println(myArray[0])

    var myArray1 = mutableListOf<String>() //mutable, No fixed size, can add or remove elements
    myArray1.add("Mohnish")
    myArray1.add("Krishna")
    myArray1.add("Surya")
    myArray1.add(1,"Vishnu")
    for( index in 0..myArray1.size-1){
        println(myArray1[index])
    }
}

// https://youtu.be/Je_YXshSFmY?list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR&t=454
