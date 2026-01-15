package com.example.designPrinciplesAndAlgo
import org.jsoup.Jsoup

class GetHtmlOfWebpage( val arr: MutableList<String?>){

    var hashWebsites: HashMap<Int,String?> = HashMap<Int,String?>()
    fun dwndHtml(){
        for (element in arr){
            val begin = System.currentTimeMillis()
            val doc = Jsoup.connect(element).get()
            val html = doc.outerHtml()
            val end = System.currentTimeMillis()
            val totalTime = end-begin
            hashWebsites.put(totalTime.toInt(),element)
        }
        println(hashWebsites)
    }

    fun slowestWeb(){
        var large: Int = 0
        for((key,value) in hashWebsites){
            if (key> large){
                large = key
            }
        }
print("The Html of the url which took much time to load is: ${hashWebsites[large]}")
        println("")

    }
}
// https://www.rait.ac.in
// https://www.google.com
// https://www.rait.ac.in
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
            println("Link no. $i:")
            var str = readln()
            val doc = Jsoup.connect(str).get()
            list.add(str)
            i+=1
        }
        catch(e: Exception){
            println("Enter the right url")
        }
    }
    val obj = GetHtmlOfWebpage(list)
    obj.dwndHtml()
    println("")
    obj.slowestWeb()
}


