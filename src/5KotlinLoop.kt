fun main() {
    //var numbers=1..10
    //var numbers=1 until 10
    var numbers = 10 downTo 1
    for (n in numbers) {
        println(n)
    }
    println("For each loop")
    numbers.forEach({ println(it) })
}
