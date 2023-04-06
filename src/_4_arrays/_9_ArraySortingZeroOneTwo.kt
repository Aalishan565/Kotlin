package _4_arrays

fun main() {
    val inputArray = arrayOf(1, 2, 0, 1, 0, 2, 0, 1, 2, 0, 1, 2, 0)
    sortArrayUsingDutchNationalFlagApproach(inputArray).forEach {
        println(it)
    }
}

private fun sortArrayUsingDutchNationalFlagApproach(inputArray: Array<Int>): Array<Int> {
    var firstPointer = 0
    var lastPointer = inputArray.size - 1
    var mid = firstPointer
    while (mid <= lastPointer) {
        when (inputArray[mid]) {
            0 -> {
                if (inputArray[mid] != inputArray[firstPointer]) {
                    var temp = inputArray[mid]
                    inputArray[mid] = inputArray[firstPointer]
                    inputArray[firstPointer] = temp
                }
                firstPointer++
                mid++
            }

            1 -> {
                mid++
            }

            2 -> {
                if (inputArray[mid] != inputArray[lastPointer]) {
                    var temp = inputArray[mid]
                    inputArray[mid] = inputArray[lastPointer]
                    inputArray[lastPointer] = temp
                }
                lastPointer--
            }

        }
    }
    return inputArray
}

