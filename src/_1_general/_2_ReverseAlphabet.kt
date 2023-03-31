package _1_general

fun main() {
    val input = "ab#,oQ,a@b"
    println(reverseAlphabet(input))
}

fun reverseAlphabet(input: String): String {
    var inputCharArray = input.toCharArray()
    var startIndex = 0
    var endIndex = inputCharArray.size - 1
    while (startIndex <= endIndex) {
        if (!inputCharArray[startIndex].isLetter()) {
            startIndex++
        } else if (!inputCharArray[endIndex].isLetter()) {
            endIndex--
        } else {
            var tempChar = inputCharArray[startIndex]
            inputCharArray[startIndex] = inputCharArray[endIndex]
            inputCharArray[endIndex] = tempChar
            startIndex++
            endIndex--
        }
    }
    return String(inputCharArray)
}
