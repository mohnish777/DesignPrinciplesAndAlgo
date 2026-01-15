package com.example.designPrinciplesAndAlgo.strucyByAlvin


fun pairProduct(numbers: List<Int>, target: Int): List<Int> {
    val previousNums = mutableMapOf<Int, Int>()

    for((index, num) in numbers.withIndex()){
        val complement = target/num
        if (previousNums.containsKey(complement)) return listOf(previousNums[complement]!!, index)
        previousNums[num] = index
    }
    return emptyList()
}

/*
Time Complexity = O(n)
Space Complexity = 0(n)
 */

fun main(){
    println(pairProduct(listOf(4, 6, 8, 2), 16))
    println(pairProduct(listOf(3, 2, 5, 4, 1), 10))
    println(pairProduct(listOf(4, 7, 9, 2, 5, 1), 35))
    println(pairProduct(listOf(4, 7, 9, 2, 5, 1), 5))
}
