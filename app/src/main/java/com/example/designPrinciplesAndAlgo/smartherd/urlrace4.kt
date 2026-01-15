package com.example.designPrinciplesAndAlgo.smartherd
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.net.URL
import kotlin.system.measureTimeMillis

class UrlRace(val links : ArrayList<String>) {
    val list: MutableList<Pair<String, Int>> = mutableListOf()
    suspend fun fastestLink() {
        coroutineScope {
        for (link in links) {
            launch {
                        list.add(fetchUrl(link))
                }
            }
        }
        println("The fastest web page to load ${list.sortedBy { it.second }.get(0)}")
        println(list)
    }
    suspend fun fetchUrl(url: String): Pair<String, Int> {
        val time: Int = measureTimeMillis {
            URL(url).readText()

        }.toInt()
        return Pair(url, time)
    }
}
fun checkAndGetUrls(no:Int):ArrayList<String>{
    val links= ArrayList<String>()
    for (i in 1..no) {
        while (true) {
            try {
                println("Enter the link no $i")
                val link: String = readln()
                URL(link)
                links.add(link)
                break
            } catch (e: Exception) {
                println("Enter the right URL")
            }
        }
    }
    return links
}
fun main() = runBlocking{
    println("How many links you want to provide?: ")
    while (true) {
        try {
            val no = readln().toInt()
            val listOfLinks = checkAndGetUrls(no)
            val obj = UrlRace(listOfLinks)
            obj.fastestLink()
            break
        } catch (e: Exception) {
            println("Enter valid no.")
        }
    }
}
