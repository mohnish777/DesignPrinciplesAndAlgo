package com.example.designPrinciplesAndAlgo.strucyByAlvin


fun sumNumbersRecursive(numbers: List<Int>): Int {
   if (numbers.isEmpty()) {
       return 0
   }
    return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size))
}


fun main () {
    println(sumNumbersRecursive(listOf(1, 2, 3, 4, 5)))
}
