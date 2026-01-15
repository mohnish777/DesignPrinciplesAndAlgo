package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    // set contains unique elements
    // 'HashSet' contains unique elements but sequence is not guaranteed in output.


    var mySet = setOf<Int>(2,54,3,1,0,9,9,9,8) // Immutable, READ only
    var mySet1 = mutableSetOf<Int>(2,54,3,1,0,9,9,9,8) // Mutable Set. READ and WRITE both
    var mySet2 = hashSetOf<Int>(2,54,3,1,0,9,9,9,8)// Mutable Set, READ and WRITE but sequence is not guaranteed


    mySet1.remove(54)
    mySet1.add(100)
    for (element in mySet){
        println(element)
    }
}
