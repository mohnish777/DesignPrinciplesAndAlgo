package com.example.designPrinciplesAndAlgo.smartherd

interface ICardCashBack{
    fun getCashBackValue():Float
}
enum class CreditCardType2(val color:String, val maxLimit:Int = 1000000):ICardCashBack{
    SILVER(color="gray", maxLimit = 50000){
        override fun getCashBackValue(): Float {
            return 0.02f
        } },
    GOLD("gold"){
        override fun getCashBackValue(): Float = 0.04f
                },
    PLATINUM("black"){
        override fun getCashBackValue(): Float  = 0.06f
    }
}

fun main(){
    println(CreditCardType2.SILVER.getCashBackValue())
}
/*
1. When you have a finite number of constants values,
you can group them together in something called enum class.
2. Enum objects are constant values. once you create them it cannot be changed.
3. Each enum constant is a separate instance of the enum class.
   they have properties of name and ordinal and methods of values() and valueOf()
4. you can assign you own properties to each enum object by using a constructor.
5.Enum class can implement interface, but can't inherit from abstract or open class.
*/
