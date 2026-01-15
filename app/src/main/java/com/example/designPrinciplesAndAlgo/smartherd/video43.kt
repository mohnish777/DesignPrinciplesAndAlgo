package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
var myButton = Button()
    myButton.onTouch()
    myButton.onClick()

}

interface MyInterfaceListener{ //you cannot create instance of abstract class.

    var name:String  //Properties in interface are abstract by default. & you can't initialise
    abstract fun onTouch()
    fun onClick(){ //Normal Methods are public and open by default NOT FINAL.
        println("MyInterfaceListener: onClick")
    }
}

interface MySecondInterface{
    fun onTouch(){
        println("MySecondInterface: onTouch")
    }

    fun onClick(){
        println("onClick Interface code: Button Clicked")
    }
}

class Button: MyInterfaceListener{
    override var name: String = "dummy_name"
    override fun onTouch() {
        println("onTouch")
    }

    override fun onClick() { //optional to override
        super.onClick()
        println("Button was clicked")
    }

}
