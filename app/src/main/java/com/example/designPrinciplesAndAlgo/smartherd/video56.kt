package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    // Immutable, Fixed size, READ ONLY
    var myMap = mapOf<Int,String>(
        4 to "Yogi",
        43 to "Manmohan",
        7 to "Vajpayee"
    )

    for(key in myMap.keys){
        println("Element at key: $key = ${myMap[key]}") // or myMap.get(key
    }


    //Mutable, READ and WRITE both, No Fixed Size
    var myMap1 = HashMap<Int,String>()
    //Mutable, READ and WRITE both, No Fixed Size, but this returns LinkedHash Map
    var myMap2 = mutableMapOf<Int,String>()
    //Mutable, READ and WRITE both, No Fixed Size
    var myMap3 = hashMapOf<Int,String>()

    myMap1.put(4,"Yogi")
    myMap1.put(43,"Manmohan")
    myMap1.put(7,"Vajpayee")

    myMap1.put(43,"Modi") //myMap1.replace(43,"Modi")
    for(key in myMap1.keys){
        println("Element at key: $key = ${myMap1[key]}") // or myMap.get(key
    }
}
