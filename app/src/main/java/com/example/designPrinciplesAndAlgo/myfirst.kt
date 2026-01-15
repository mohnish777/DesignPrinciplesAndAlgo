package com.example.designPrinciplesAndAlgo


// @file:JvmName("MyCustomKotlinFileName")
// Now onwards we can call methods in java file from this file by using above name;
//no need to use MyFirstKt.add



fun main() {
var area = MyJavaFile.getArea(1,2)
    println(area)
}

fun add(a:Int, b:Int):Int{
    return a+b
}

// we're using this decorator because height parameter has default value and when this fsn is called in java file it will not work
// because java does not support default parameters in fsn
@JvmOverloads
fun findVolume(length:Int, breadth:Int, height:Int = 10):Int{
    return length*breadth*height
}


// behind the scenes

//public class MyFirstKt{
//    public static void main(String[] args){
//
//    }
//    public static Int add(int a, int b){
//        return a+b
//    }
