package _4_arrays

fun main() {
    val inputArray = arrayOf(1, 0, 1, 0, 0, 1, 0, 1, 0)
    moveAllZerosToEnd(inputArray).forEach {
        println(it)
    }
}

private fun moveAllZerosToEnd(inputArray: Array<Int>): Array<Int> {
    var j = inputArray.size - 1
    for (i in inputArray.size - 1 downTo 0) {
        if (inputArray[i] != 0 && inputArray[j] == 0) {
            var temp = inputArray[j]
            inputArray[j] = inputArray[i]
            inputArray[i] = temp
        }
        if (inputArray[j] != 0) {
            j--
        }
    }
    return inputArray
}