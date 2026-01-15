package com.example.designPrinciplesAndAlgo.smartherd

import org.jsoup.Jsoup
import java.net.URL

class GetHtmlOfWebpage( val arr: MutableList<String?>){
    var small: Int = 0
    var fastestWebsite: String? = ""
    var array: MutableList<Int> = mutableListOf()
    fun dwndHtml(){
        for (element in arr){
            val begin = System.currentTimeMillis()
            val doc = Jsoup.connect(element).get()
            val html = doc.outerHtml()
            val end = System.currentTimeMillis()
            val totalTime = end-begin
            array.add(totalTime.toInt())
            if (small == 0){
                small = totalTime.toInt()
                fastestWebsite = element
            }else if(small>totalTime){
                small = totalTime.toInt()
                fastestWebsite = element
            }

        }
    }
    fun fastestWeb(){
        println("The fastest web page to load: $fastestWebsite")
        println("Time taken by each website to load: $array")
    }
}

// https://www.rait.ac.in
// https://www.google.com
// https://www.facebook.com
// cmd + b

fun main() {
    val list: MutableList<String?> = ArrayList()

    var i = 1
    println("Enter 3 links")
    while (true){
        try{
            if(i==4){
                break
            }
            print("Enter Link no. $i: ")
            var str = readln()
            URL(str).readText()
            list.add(str)
            i+=1
        }
        catch(e: Exception){
            println("Enter the right url $e")
        }
    }
    val obj = GetHtmlOfWebpage(list)
    obj.dwndHtml()
    println("")
    obj.fastestWeb()
}





