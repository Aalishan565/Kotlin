package _4_arrays

fun main() {
    val inputArray = arrayOf(1, 0, 1, 0, 0, 1, 0, 1, 0)
    sortArrayUsingPointers(inputArray).forEach {
        println(it)
    }
}

private fun sortArrayUsingPointers(inputArray: Array<Int>): Array<Int> {
    var start = 0
    var end = inputArray.size - 1
    while (start < end) {
        if (inputArray[start] == 0 && inputArray[end] == 1) {
            start++
            end--
        } else if (inputArray[start] == 0) {
            start++
        } else if (inputArray[end] == 1) {
            end--
        } else {
            var temp = inputArray[start]
            inputArray[start] = inputArray[end]
            inputArray[end] = temp
            start++
            end--
        }
    }
    return inputArray
}
