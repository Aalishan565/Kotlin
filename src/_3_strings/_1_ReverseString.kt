package _3_strings

fun main() {
    printInReverse("aalishan")
}

fun reverseString(inputString: String) {
    var reverseString = ""
    for (i in inputString.reversed()) {
        reverseString += i
    }
    println(reverseString)

}

fun printInReverse(inputString: String) {
    for (i in inputString.length - 1 downTo 0) {
        print(inputString[i])
    }
}