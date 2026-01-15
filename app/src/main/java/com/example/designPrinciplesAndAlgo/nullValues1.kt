package com.example.designPrinciplesAndAlgo


fun describeString(maybeString: String?): String{
    if(maybeString != null && maybeString.length>0){
        return "String of length ${maybeString.length}"
    }else {
        return "Embty or null string"
    }
}






fun main(){
    println(describeString(null))
}
