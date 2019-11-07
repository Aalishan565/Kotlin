fun main() {

    // printName()

    // paramFunction("param")

    //var result=sum(2,5)

    //named function
    // var result=sum(number2 = 2,number1 = 3)

    //  println(result)

    printAverage(10.0, 2.0)
    // displayGreeting("Welcome")
    var sum = sumOfNumbers(1, 2, 3)
    println(sum)
}

//Normal function
fun printName() {
    println("This is name function")
}

//Parameterize function
fun paramFunction(name: String) {
    println("This is $name function")

}

//Parameter and return type
fun sum(number1: Int, number2: Int): Int {
    val add = number1 + number2
    return add
}

// void return function
//Named function
fun printAverage(a: Double, b: Double): Unit {
    println("Avg of ($a, $b) = ${(a + b) / 2}")
}

//default function
fun displayGreeting(message: String, name: String = "Guest") {
    println("Hello $name, $message")
}

//var args
fun sumOfNumbers(vararg numbers: Int): Int {
    var sum = 0.0
    for (number in numbers) {
        sum += number
    }
    return sum.toInt()
}
