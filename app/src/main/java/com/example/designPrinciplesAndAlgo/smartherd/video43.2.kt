package com.example.designPrinciplesAndAlgo.smartherd

fun main() {
    var mybtn = Button43_2()
    mybtn.onTouch()
}

interface MyInterfaceListener43_2{ //you cannot create instance of abstract class.

    abstract fun onTouch()
    fun onClick(){ //Normal Methods are public and open by default NOT FINAL.
        println("MyInterfaceListener: onClick")
    }
}

interface MySecondInterface43_2{
    fun onTouch(){
        println("MySecondInterface: onTouch")
    }

    fun onClick(){
        println("onClick Interface code: Button Clicked")
    }
}

class Button43_2: MyInterfaceListener43_2, MySecondInterface43_2{


    override fun onTouch() {
        super.onTouch() // this will call onTouch method of mySecondInterface43_2 because
                        // MyInterfaceListener43_2 contains nothing. so compiler will not call.
    }

    override fun onClick() {
        super<MySecondInterface43_2>.onClick()
        super<MyInterfaceListener43_2>.onClick()
    }


}
