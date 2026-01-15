package com.example.designPrinciplesAndAlgo.smartherd

// class > sealed class > enum class (this describes the freedom of classes)

// sub classes can be defined inside the sealed class or outside the seal class but not outside the file.
// The subclasses should be defined within the same file where the sealed class is itself defined.
sealed class Shape{
    data class Circle(var radius:Float):Shape()
    class Square(var side:Int):Shape()

    //
    object NotShape:Shape() // you can define objects
    sealed class Line:Shape() // you can define another sealed class
    sealed interface Draw // you can define interface as well.

}
class Rectangle(var length:Int, var breadth:Int):Shape()


fun main(){
    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(8)
    var rectangle = Rectangle(20,10)
    var noShape = Shape.NotShape

   checkShape(noShape)
}

fun checkShape(shape:Shape){
    when(shape){
        is Shape.Circle -> println("Circle area is ${3.14*shape.radius*shape.radius}")
        is Shape.Square -> println("Square are is ${shape.side*shape.side}")
        is Rectangle ->println("Rectangle are is ${shape.length*shape.breadth}")
        Shape.NotShape ->println("No shape found") // we don't use is when its object.

    }
}

/*
1. The subclasses of sealed class must be declared in the same
   file in which sealed class itself is declared.
2. subclasses can be data class, regular class, object class or even another sealed class.
3. Sealed class ensures type-safety by restricting  the set of types at compile time only.
4. A sealed class is implicitly an abstract class which can't be instantiated.
5. by default, the constructor of sealed class is private and we can't make it as non-private.
*/
