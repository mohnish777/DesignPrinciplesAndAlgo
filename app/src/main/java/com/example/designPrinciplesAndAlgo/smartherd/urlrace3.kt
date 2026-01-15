package com.example.designPrinciplesAndAlgo.smartherd

import kotlinx.coroutines.*
import java.net.URL
import kotlin.system.measureTimeMillis

 class UrlRace1(val no : Int) {
     val launchObjects: MutableList<Job> = ArrayList()
     val list: MutableList<Pair<String, Int>> = mutableListOf()
     fun fastestLink() = runBlocking {
         for (i in 1..no) {
             val job = launch {
                 while (true) {
                     try {
                         println("Enter the link no $i")
                         val link: String = readln()
                         list.add(fetchUrl(link))
                         break
                     } catch (e: Exception) {
                         println("Enter the right URL")
                     }
                 }
             }
            launchObjects.add(job)
         }

        launchObjects.joinAll()
         //val result = list.sortedBy { (_, value) -> value }.toMap() //sorting according to keys

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
fun main(){
    println("How many links you want to provide?: ")
    val no = readln().toInt()
    val obj = UrlRace1(no)
    obj.fastestLink()

}

