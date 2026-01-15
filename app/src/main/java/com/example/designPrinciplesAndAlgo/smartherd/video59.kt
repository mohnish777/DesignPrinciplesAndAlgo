package com.example.designPrinciplesAndAlgo.smartherd
//predicate means condition it can be either true or false

/*
1. "all": Do all elements satisfy the predicate/condition?
2. "any": Do any element in list satisfy the predicate
3. "count": Total elements that satisfy the predicate
4. "find": Returns the First element that satisfy predicate.
*/


fun main(){
    val myNumbers = listOf<Int>(2,3,4,6,23,90)
    val myPredicate = {num:Int ->num>10}

    val check1 = myNumbers.all(myPredicate) // are all elements greater than 10?
    println(check1)
    val check2 = myNumbers.any(myPredicate) // is there any no. that is greater than 10?
    println(check2)
    val check3 = myNumbers.count(myPredicate) //number of elements that satisfy predicate
    println(check3)
    val check4: Int? = myNumbers.find(myPredicate) // return the 1st element that matches the predicate. this can also return null if it does not find any
}
