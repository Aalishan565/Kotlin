package _3_strings

fun main() {
    getLongestLengthString()
}

private fun getLongestLengthString() {
    var inputString = "Hi I am a developer"
    var inputStringArray = inputString.split(" ").toTypedArray()
    var count: Int = 0
    var longestString = ""

    for (input in inputStringArray) {
        if (longestString.length < input.length) {
            longestString = input
            count = longestString.length
        }
    }
    println(longestString)
}