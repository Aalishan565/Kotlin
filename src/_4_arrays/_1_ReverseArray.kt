package _4_arrays

fun main() {
    val inputArray = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val result = reverseArrayUsingLoop(inputArray)
    for (item in result) {
        println(item)
    }

}

private fun reverseArrayUsingLoop(inputArray: Array<Int>): Array<Int> {
    var startIndex = 0
    var endIndex = inputArray.size - 1
    while (startIndex <= endIndex) {
        var temp = inputArray[startIndex]
        inputArray[startIndex] = inputArray[endIndex]
        inputArray[endIndex] = temp
        startIndex++
        endIndex--
    }
    return inputArray
}

private fun reverseArrayUsingRecursion(inputArray: Array<Int>): Array<Int> {
    var startIndex = 0
    var endIndex = inputArray.size - 1
    while (startIndex <= endIndex) {
        var temp = inputArray[startIndex]
        inputArray[startIndex] = inputArray[endIndex]
        inputArray[endIndex] = temp
        startIndex++
        endIndex--
    }
    return inputArray
}