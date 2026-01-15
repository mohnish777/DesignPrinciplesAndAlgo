package com.example.designPrinciplesAndAlgo.smartherd


// ordinal and name is the default properties of enum class
// what if you wanna add more?

enum class CreditCardType1(val color:String, val maxLimit:Int = 1000000){
    SILVER(color="gray", maxLimit = 50000),
    GOLD("gold"),
    PLATINUM("black")
}

fun main(){

    // the way you can call the property is


}
