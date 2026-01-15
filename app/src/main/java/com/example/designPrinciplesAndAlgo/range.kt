package com.example.designPrinciplesAndAlgo

fun main(){

    // check the range if x fits or not
    val x = 10
    val y = 9
    if (x in 1..y+1){
        println("fits in range")
    }
    // check -1 is between 0 and last index of list
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex){
        println("-1, as its out of range!")
    }
    // check wether length of list is range or not
    if (list.size !in list.indices){
        println("list size is out of valid list indices range, too")
    }
}
