package com.example.designPrinciplesAndAlgo.basicAlogrithm

fun replaceTagWithStyle() {
    val searchText = "Hello **world** and *test*"
    val start = searchText.indexOf("**")
    val end = searchText.indexOf("**", start + 2)
    val beforeMarker = searchText.substring(0, start)
    val cleanBefore = beforeMarker.replace("**", "").replace("*", "")
    println(start)
    println(end)
    println(beforeMarker.length)
}

fun main() {
    replaceTagWithStyle()
}
