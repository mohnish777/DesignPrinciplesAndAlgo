package com.example.designPrinciplesAndAlgo.strucyByAlvin

fun mostFrequentChar(s: String){

    val charCount: HashMap<Char, Int> = hashMapOf()  // n
    var maxCount: Pair<Char, Int> = Pair("i".first(), -1) // 1

    for (char in s) {    // n
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    for (char in charCount.keys) { // m
        if (charCount[char]!! > maxCount.second) {
            maxCount = Pair(char, charCount[char]!!)
        } else if (charCount[char]!! == maxCount.second) {
            if (s.indexOf(char) < s.indexOf(maxCount.first))
                maxCount = Pair(char, charCount[char]!!)
        }
    }
    println(maxCount.first)
}

// time complexity  = O(n+m), n being domination we can ignore m = O(n)
// space complexity = O(n+1) = O(n)



fun main(){
  mostFrequentChar("mohnishm")
  println(mostFrequentChar2("mohnishm"))
  println(mostFrequentChar2("mohnishhm"))
}


fun mostFrequentChar2(s: String): Char? {

    var charCount: HashMap<Char, Int> = hashMapOf() // m
    var maxCountChar: Char? = null // 1

    for (char in s) { // n
        if (!(char in charCount.keys)) {
            charCount[char] = 0
        }

        charCount[char] = charCount[char]!! + 1
    }

    for (char in s) { // n
        if (maxCountChar == null || charCount[maxCountChar]!! < charCount[char]!!) {
            maxCountChar = char
        }
    }
    return maxCountChar

}
// time Complexity = O(2n) = O(n)
// space Complexity = O(m+1) = O(m)
