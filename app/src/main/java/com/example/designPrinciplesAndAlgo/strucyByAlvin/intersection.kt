package com.example.designPrinciplesAndAlgo.strucyByAlvin




fun intersection(a: List<Int>, b: List<Int>): List<Int> {
    val setA = a.toSet() // n ( inserting elements into set run in O(1) time)
    val intersectionList = mutableListOf<Int>()

    for (num in b) {
        if( num in setA) { // look up in set is O(1)
            intersectionList.add(num)
        }
    }

    return intersectionList
}
// time complexity = O(n+m)
// space complexity = O(min(n,m))

fun intersection2(a: List<Int>, b: List<Int>): List<Int> {

    val intersection = mutableListOf<Int>()

    for (num in a) {
        for (num2 in b) {
            if (num == num2) {
                intersection.add(num)
            }
        }
    }

    return intersection
}

// time complexity = O(n*m)
// space complexity = O(min(n,m))


fun main() {
    println(intersection(listOf(4,2,1,6), listOf(3,6,9,2,10))) // -> [2,6]
    println(intersection(listOf(2,4,6), listOf(4,2))) // -> [2,4]
    println(intersection(listOf(4,2,1), listOf(1,2,4,6))) // -> [1,2,4]
    println(intersection(listOf(0,1,2), listOf(10,11))) // -> []
    println(intersection(listOf(0,1,2), listOf(10,11))) // -> []

    // Performance test
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()
    for (i in 0 until 30000) {
        a.add(i)
        b.add(i)
    }
    println(intersection(a, b)) // -> [0,1,2,3,..., 29999]
}
