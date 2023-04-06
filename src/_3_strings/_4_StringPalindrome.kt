package _3_strings

fun main() {
   println(isStringPalindrome("aba"))
}

private fun isStringPalindrome(inputString: String): Boolean {
    var startIndex = 0
    var endIndex = inputString.length - 1
    while (startIndex <= endIndex) {
        if (inputString[startIndex] != inputString[endIndex]) {
            return false
        }
        startIndex++
        endIndex--
    }
    return true
}