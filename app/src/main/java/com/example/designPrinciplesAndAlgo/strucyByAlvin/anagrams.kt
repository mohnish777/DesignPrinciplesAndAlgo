package com.example.designPrinciplesAndAlgo.strucyByAlvin

fun anagrams(s1: String, s2: String): Boolean{

    val count: HashMap<Char, Int> = hashMapOf()

    s1.forEach { letter ->         // n
        if (!count.containsKey(letter))
            count[letter] = 0

        count[letter] = count[letter]!! + 1
    }

    for (char in s2) {       // m
        if (char in count) {
            count[char] = count[char]!! - 1
        } else {
            return false
        }
    }

    for (key in count.keys){    // n
        if(count[key] != 0){
            return false
        }
    }
    return true
}

// time complexity = O(n+n+m) = O(2n+m) = O(n+m)
// space complexity = O(m)









fun main(){
    println(anagrams("restful", "fluster")); // -> true
    println(anagrams("cats", "tocs")); // -> false
    println(anagrams("monkeyswrite", "newyorktimes")); // -> true
    println(anagrams("paper", "reapa")); // -> false
    println(anagrams("elbow", "below")); // -> true




}

fun areAnagrams2(s1: String, s2: String): Boolean {
    val count = mutableMapOf<Char, Int>()

    // Count characters in the first string
    for (char in s1) {
        count[char] = count.getOrDefault(char, 0) + 1
    }

    // Decrease count based on the second string
    for (char in s2) {
        if (char in count) {
            count[char] = count[char]!! - 1
        } else {
            return false
        }

    }

    // Check if all counts are zero
    for (value in count.values) {
        if (value != 0) {
            return false
        }
    }

    return true
}


