package com.example.designPrinciplesAndAlgo.smartherd

// for details and points of lazy operator
// check this link - https://youtu.be/orUgnUuYW44?list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR&t=239


val pi :Float by lazy{
    3.14f
}

fun main(){
    println("Some initial code....")

    val area1 = pi*4*4 // now pi will be allocated in the memory (gets stored in cache memory)
    val area2 = pi*4*3 // it will not allocate again, rather it will use from cache memory
}
