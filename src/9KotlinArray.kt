fun main(args: Array<String>) {
    var myArray1 = arrayOf(1, 10, 4, 6, 15)
    var myArray2 = arrayOf<Int>(1, 10, 4, 6, 15)
    val myArray3 = arrayOf<String>("A", "B", "C", "D", "E")
    var myArray4 = arrayOf(1, 10, 4, "A", "B")
    //myArray4[3] = 8
    for (a in myArray4) {
        println(a)
    }

    for ((index,value) in myArray4.withIndex()) {
        println("Index: $index")
        println("Value: $value")
    }
}
