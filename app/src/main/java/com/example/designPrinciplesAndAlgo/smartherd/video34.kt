package com.example.designPrinciplesAndAlgo.smartherd

import java.math.BigInteger

fun main() {
    println("first function output")
    println(getFibonacci(100000, BigInteger("0"),BigInteger("1")))
    println("second function output")
    println(getFibonacci1(5))
}

// 0 1 1 2 3 5 8 13 21 34
tailrec fun getFibonacci(n:Int, a:BigInteger, b:BigInteger): BigInteger {
    if(n==0){
        return b
    }else{
        return getFibonacci(n-1,a+b, a)
    }
}

// 1 1 2 3 5 8 13 21 34
tailrec fun getFibonacci1(n:Int): BigInteger {
    if(n<=2){
        return BigInteger("1")
    }else{
        return getFibonacci1(n-2)+getFibonacci1(n-1)
    }
}


