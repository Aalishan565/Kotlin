package kotlin_basics

fun main() {
    //Define the range in kotlin
    //var numbers=1..10

    //10 is not included
    //var numbers=1 until 10

    //Reverse from 10 to 1
    var numbers = 10 downTo 1

    for (value in numbers) {
        //Value is item on the ranges
        println(value)
    }
    println("For each loop")
    //for each loop in kotlin
    numbers.forEach { println(it) }
}
