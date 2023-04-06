package _4_arrays

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8,8, 10)
    //val missingNumber = findMissingNumberUsingFormula(array)
    //println(missingNumber)
    missingNumberWithRepeatedElement(array)

}

private fun findMissingNumberUsingFormula(inputArray: Array<Int>): Int {
    var totalNumbers = inputArray.size + 1
    var expectedSum = 0
    var actualSum = 0
    expectedSum = if (inputArray[0] == 0) {
        (totalNumbers * (totalNumbers - 1)) / 2
    } else {
        (totalNumbers * (totalNumbers + 1)) / 2
    }
    for (input in inputArray) {
        actualSum += input
    }
    return expectedSum - actualSum
}

private fun missingNumberWithRepeatedElement(inputArray: Array<Int>) {
    var numberMap: HashMap<Int, Boolean> = HashMap()
    var totalNumbers = inputArray.size
    inputArray.forEach { number ->
        if (numberMap[number] == null) {
            numberMap[number] = true
        } else {
            println("$number is duplicate")
        }
    }

    for (i in 1..totalNumbers) {
        if (numberMap[i] == null) {
            println("$i is missing number")
        }
    }

}