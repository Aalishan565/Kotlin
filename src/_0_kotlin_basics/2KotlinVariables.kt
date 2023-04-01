package _0_kotlin_basics

fun main() {

    //Variable it can change values at runtime due to variable nature
    var name = "XYZ"

    ////constant value can not be reinitialize (same as final in java)
    //It will get the memory at runtime
    val age = 27

    //declaration with initialization the String type is optional
    //Kotlin is smart enough to cast data types
    var myName: String = "Abc"

    //Printing in traditional  way same as java
    println("My name is " + name + " and my age is " + age)

    //Printing in kotlin way called string interpolation
    println("My name is $name and my age is $age")

    println(id)
}

//file level declaration will get memory allocation at compile time
const val id = 101
