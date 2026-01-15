package com.example.designPrinciplesAndAlgo.smartherd

fun main(){

}

abstract class Person42{
    abstract var name:String // cannot be instantiated
    open var surname:String = "Chittoory" //has to be instantiated
    abstract fun eat() // body is not required "{}", abstract properties are "Open" by default.
    open fun getHeight(){}
    fun goToSchool(){} // public by default
}


class Indian42:Person42(){
    // in I'm using abstract class the I should implement all abstract methods
    // as well as abstract variables

    override var name: String = "dummy Indian name"
    override fun eat() {

    }

}
