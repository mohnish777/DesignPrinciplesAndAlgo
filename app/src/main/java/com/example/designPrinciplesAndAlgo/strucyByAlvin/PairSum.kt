package com.example.designPrinciplesAndAlgo.strucyByAlvin

fun pairSum(numbers: List<Int>, targetSum: Int): List<Int> {
    val previousNums: HashMap<Int, Int> = hashMapOf()

    numbers.forEachIndexed { index, num ->
        val complement = targetSum - num
        if (complement in previousNums.keys) return listOf(previousNums[complement]!!, index)
        previousNums[num] = index
    }
    return listOf()
}

/*
Time complexity for hashMap
time complexity = O(n)
space complexity = O(n)
 */


fun main(){
    println(pairSum(listOf(3, 2, 5, 4, 1), 8))
    pairSum(listOf(4, 7, 9, 2, 5, 1), 5)
    pairSum(listOf(4, 7, 9, 2, 5, 1), 3)
    pairSum(listOf(6, 4, 2, 8 ), 12)
    println(pairSum(listOf(9, 9), 18))
}
