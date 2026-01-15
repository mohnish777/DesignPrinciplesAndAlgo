package com.example.designPrinciplesAndAlgo


fun<T> findElement(array:Array<T>, element:T, foundElement:(index:Int,element:T?)-> Unit){
    for(i in array.indices){
        if( array[i]==element){
            foundElement(i,array[i])
            return
        }
    }
    foundElement(-1,null)
    return
}

fun main(){
findElement(arrayOf(1,2,3,4,5),3){index,element->
    println("The index is: $index")
    println("The element is: $element")
}
}
