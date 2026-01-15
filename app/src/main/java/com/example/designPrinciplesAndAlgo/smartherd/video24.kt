package com.example.designPrinciplesAndAlgo.smartherd


fun main() {
    myloop@ for (i in 1..3) {
        for (j in 1..3){
            println("$i $j")
            if(i==2 && j==2){
                break@myloop //this will help to break the main loop; if you just mention the "break" it will break the nearest loop.
            }
        }
    }
}
