package com.example.designPrinciplesAndAlgo.smartherd


import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.net.URL
import kotlin.system.measureTimeMillis

fun main(): Unit = runBlocking{
val job = launch {
    launch {
        val begin = System.currentTimeMillis()
        URL("https://www.google.com").readText()
        val end = System.currentTimeMillis()
        println(end.toInt() - begin.toInt())

    }

    launch {
        val begin = System.currentTimeMillis()
        URL("https://www.facebook.com").readText()
        val end = System.currentTimeMillis()
        println(end.toInt() - begin.toInt())

    }
    launch {
        val begin = System.currentTimeMillis()
        URL("https://www.rait.ac.in").readText()
        val end = System.currentTimeMillis()
        println(end.toInt() - begin.toInt())

    }
}
    job.join()
}
//suspend fun fetchUrl(url:String):Int{
//    return measureTimeMillis {
//        URL(url).readText()
//    }.toInt()
//}
