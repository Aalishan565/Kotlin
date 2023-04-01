package _3_strings

fun main() {
    reverseStringWithoutBuiltInMethod("aalishan")
}

fun printInReverse(inputString: String) {
    for (i in inputString.length - 1 downTo 0) {
        print(inputString[i])
    }
}

fun reverseString(inputString: String) {
    var reverseString = ""
    for (i in inputString.reversed()) {
        reverseString += i
    }
    println(reverseString)

}

fun reverseStringWithoutBuiltInMethod(inputString: String) {
    var inputChar = inputString.toCharArray()
    var startIndex = 0
    var endIndex = inputChar.size - 1
    while (startIndex < endIndex) {
        var temp = inputChar[startIndex]
        inputChar[startIndex] = inputChar[endIndex]
        inputChar[endIndex] = temp
        startIndex++
        endIndex--
    }
    println(String(inputChar))
}
