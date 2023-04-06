package _4_arrays

fun main() {
    val numberToRemove = 4
    val givenArray = arrayOf(1, 2, 2, 2, 3, 3, 4)
    val result = removeNumberReturnArray(givenArray, numberToRemove)
    result.forEach { println(it) }
}

private fun removeNumberReturnArray(array: Array<Int>, number: Int): Array<Int?> {
    var index = 0
    for (i in array.indices) {
        if (array[i] != number) {
            array[index] = array[i]
            index++
        }
    }
    return array.copyOf(index)
}
