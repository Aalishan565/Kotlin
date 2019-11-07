fun main() {

    // Smart casting to Int array
    var myArray1 = arrayOf(1, 10, 4, 6, 15)

    //Specifically giving the type to array in <>
    var myArray2 = arrayOf<Int>(1, 10, 4, 6, 15)

    //Specifically giving the type to array in <>
    val myArray3 = arrayOf<String>("A", "B", "C", "D", "E")

    //Array of heterogeneous objects
    var myArray4 = arrayOf(1, 10, 4, "A", "B")

    // Empty array declaration with size
    var myArray5 = arrayOfNulls<Int>(10)

    //Putting data in some index
    //myArray4[3] = 8


    for (a in myArray4) {
        println(a)
    }

    // array with index
    for ((index, value) in myArray4.withIndex()) {
        println("Index: $index")
        println("Value: $value")
    }
}
