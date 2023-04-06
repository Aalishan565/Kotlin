package _4_arrays

fun main() {
    val givenArray = arrayOf(1,1,1, 2, 2, 2, 3, 3, 4)
    val result = removeDuplicatesFromSortedArray(givenArray)
    result.forEach {
        println(it)
    }
}

private fun removeDuplicatesFromSortedArray(inputArray: Array<Int>): Array<out Int?> {
    if (inputArray.size <= 2) {
        return inputArray
    }
    var i = 1
    var j = 0
    while (i < inputArray.size) {
        if (inputArray[j] != inputArray[i]) {
            j++
            inputArray[j] = inputArray[i]
        }
        i++
    }
    val newArray = arrayOfNulls<Int>(j + 1)
    repeat(newArray.size) { index ->
        newArray[index] = inputArray[index]
    }
    return newArray
}