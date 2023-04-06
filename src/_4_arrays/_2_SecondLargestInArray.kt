package _4_arrays

fun main() {
    val inputArray = arrayOf(11, 3, 2, 5, 4, 9, 7, 8, 6, 10)
    println(findSecondLargestInArray(inputArray))
}

private fun findSecondLargestInArray(inputArray: Array<Int>): Int {
    var largest = inputArray[0]
    var secondLargest = Int.MIN_VALUE
    for (input in inputArray) {
        if (largest < input) {
            secondLargest = largest
            largest = input
        } else if (secondLargest < input && input != largest) {
            secondLargest = input
        }
    }
    return secondLargest
}