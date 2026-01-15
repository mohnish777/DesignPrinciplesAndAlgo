package com.example.designPrinciplesAndAlgo.practice

open class Subscriber{

}

class RegularSubscribers : Subscriber() {

}

class PremiumSubscriber : Subscriber(){

}

open class OttPlatformSubscribers{

}

class Netflix : OttPlatformSubscribers(){

}

class AmazonPrime : OttPlatformSubscribers(){

}

abstract class Laptop

class Apple : Laptop()

class SurfacePro : Laptop()

class Technician<out T : Laptop> {
    fun repair(){}
}

class ServiceCenter{
    fun addTechnician(technician: Technician<Laptop>){}
}



fun main(){
    val regularPapers : List<RegularSubscribers> = listOf(RegularSubscribers())
    val subscribers : List<Subscriber> = regularPapers

    val netflixSubscribers : MutableList<RegularSubscribers> = mutableListOf(RegularSubscribers())
//     val ottPlatformSubscribers : MutableList<OttPlatformSubscribers> = netflixSubscribers
    // This will not work because MutableList is not "Out" So doesn't except subclasses

    val technician = Technician<Apple>()
    val serviceCenter = ServiceCenter()
    serviceCenter.addTechnician(technician)


}
