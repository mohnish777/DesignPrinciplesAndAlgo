package com.example.designPrinciplesAndAlgo.smartherd

import java.net.URL

fun dwndHtml(link:String):Int{
    val begin = System.currentTimeMillis()
    URL(link).readText()
    val end = System.currentTimeMillis()
    return end.toInt() - begin.toInt()
}

fun main() {
    var shortest : Int = 0
    var fastestWeb:String = ""
    var i = 1
    while(true){
    try {
        if(i==4){
            break
        }
        var link: String = readln()
        var time: Int = dwndHtml(link)
        if(i==1){
            shortest = time
            fastestWeb = link
        }
        if(shortest>time) {
            shortest = time
            fastestWeb = link
        }
        i++
    } catch (e: Exception) {
        println("Enter the link in proper format.")
    }

}
    println("The fastest web page to load" +fastestWeb)
}



