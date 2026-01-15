package com.example.designPrinciplesAndAlgo.practice

// https://www.youtube.com/watch?v=Dt8zTBdDv5w&list=LL&index=6&t=125s

fun main(){
    println(BankAccount.TAG)
    repeat(4){
        println(BankAccount.create("Mohnish"))
    }
}

class BankAccount private constructor(private val name:String){
    companion object{
        const val TAG: String = "BankAccount"
        private var nextId: Int = 1
        fun create(name:String):BankAccount?{
            val instance = BankAccount(name)
            return if (instance.validateIdentity()) instance else null
        }
    }

    private val accountId: Int
    init {
        accountId = nextId++
    }

    fun validateIdentity():Boolean{
        // Check their government id
        return true
    }

    override fun toString(): String {
        return "$TAG id $accountId with name as $name"
    }

}
