package _4_arrays

fun main() {
    val inputArray = arrayOf(1, 0, 1, 0, 0, 1, 0, 1, 0)
    moveAllZerosToEnd(inputArray).forEach {
        println(it)
    }
}

private fun moveAllZerosToEnd(inputArray: Array<Int>): Array<Int> {
    var j = 0
    for (i in inputArray.indices) {
        if (inputArray[i] != 0 && inputArray[j] == 0) {
            var temp = inputArray[i]
            inputArray[i] = inputArray[j]
            inputArray[j] = temp
        }
        if (inputArray[j] != 0) {
            j++
        }
    }
    return inputArray

}