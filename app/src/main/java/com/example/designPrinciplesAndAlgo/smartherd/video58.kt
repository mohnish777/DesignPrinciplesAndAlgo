package com.example.designPrinciplesAndAlgo.smartherd

import android.content.PeriodicSync

fun main(){
    val myNumbers: List<Int> = listOf<Int>(2,3,4,6,23,90)

    val mySmallNums = myNumbers.filter { it<10 } // or { v -> v<10 }
    println(mySmallNums)

    val mySquaredNums: List<Int> = myNumbers.map{ it*it }
    println(mySquaredNums)

    val mySmallSquaredNums = myNumbers
        .filter { it<10 }
        .map { it*it }
    println(mySmallSquaredNums)

    var people = listOf<Person58>(Person58(10,"Sriyank"), Person58(23,"Annie"), Person58(17,"Sam"))

    val names = people.filter { it.name.startsWith("S") }
        .map { it.name }
    println(names)
}


class Person58(var age:Int, var name:String){

}
