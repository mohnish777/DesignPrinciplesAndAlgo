package com.example.designPrinciplesAndAlgo.smartherd

import kotlinx.coroutines.Job
import kotlinx.coroutines.*
import java.net.URL
import kotlin.system.measureTimeMillis


fun main() {
    runBlocking {
        val links: MutableList<String> = ArrayList()
        val coroutineObjects: MutableList<Job> = ArrayList()
        val hashWebsites: HashMap<Int,String?> = HashMap<Int,String?>()
        var i = 1
        while (true) {
            try {
                if (i == 4) {
                    break
                }
                var link: String = readln()
                URL(link)
                links.add(link)
                i++
            } catch (e: Exception) {
                println("Enter the link in proper format.")
            }

        }
        for (link in links) {
             val job = launch {
                val (x, y) =fetchUrl(link)
                hashWebsites.put(x,y)

            }
            coroutineObjects.add(job)
        }
        coroutineObjects.joinAll()
        val result = hashWebsites.toList().sortedBy { (key, _) -> key}.toMap() //sorting according to keys
        println("The fastest web page to load ${result.getValue(result.keys.first())}")
    }
}
    suspend fun fetchUrl(url: String): Pair<Int,String> {
        val time:Int = measureTimeMillis {
                URL(url).readText()

        }.toInt()
        return Pair(time,url)
    }



