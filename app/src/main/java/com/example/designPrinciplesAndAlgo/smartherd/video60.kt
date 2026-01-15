package com.example.designPrinciplesAndAlgo.smartherd

fun main(){
    // WAP to find out length of name
    val name:String? = "Steve"
    val surname:String? = null


//    1. Safe call (?.)
//    Returns the length if `name` is not null else returns Null
//    Use it if you don't mind getting Null value
    println("The length of name is ${name?.length}")
    println("The length of name is ${surname?.length}")

//    2. Safe call with let (?.let)
//    It executes the block ONLY IF name is NOT NULL
    name?.let{
        println("The length of the name is ${name.length}")
    }
//    3. Elvis-operator(?:)
//    when we have nullable reference 'name', we can say if name is not null then use it
//    or else use the other value

    val len = if(name !=null){
        name.length
    }else{
        -1
    }
    println(len)
    //or
    val length = name?.length ?: null // if null return the 2nd half or return the 1st half
    println(length)
    val output = null ?: -1
    println(output)


//    4. Non-Null assertion operator (!!)
//    Use it when are sure the value is NOT NULL
//    Throws NullPointerException if value is found to be NULL

    println("The length of name is ${name!!.length}")

}
