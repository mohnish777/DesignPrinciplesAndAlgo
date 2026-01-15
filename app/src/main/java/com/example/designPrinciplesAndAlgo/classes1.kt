package com.example.designPrinciplesAndAlgo

class ArrayUtil<T>(val array: Array<T>){

    fun findElement(element:T,foundElement:(index:Int,Element:T?)->Unit){
        for (i in array.indices){
            if(array[i]==element){
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }
}

fun main() {
    val arrayUtil = ArrayUtil<Int>(arrayOf(1, 2, 3, 4, 5))
    val arryUtil2 = ArrayUtil<String>(arrayOf("1","2","3","4","5"))
    arrayUtil.findElement(7){ index,element->
        println("Index: $index")
        println("Element $element")
    }
}












