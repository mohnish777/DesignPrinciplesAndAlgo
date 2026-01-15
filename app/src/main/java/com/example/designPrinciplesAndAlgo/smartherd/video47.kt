package com.example.designPrinciplesAndAlgo.smartherd

//objects inside enum class should be type of parent class

enum class CreditCardType{
    SILVER,    //ordinal = 0
    GOLD,      //ordinal = 1
    PLATINUM   //ordinal = 2
}


fun main(){
    //Enum constants are objects of enum class type.
    val peterCreditCardType:CreditCardType = CreditCardType.GOLD

    //Each enum object has two properties: ordinal and name
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD) //or CreditCardType.GOLD.name

    //Each enum object has two methods: value() or valueOf()
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }

    //using when statements
    when(peterCreditCardType){
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has Gold card")
        CreditCardType.PLATINUM -> println("Peter has Platinum card")
    }
}
