package _3_strings

fun main() {
    reverseStringSentence()
}

fun reverseStringSentence() {
    var input = "Hi I am doing practice"
    var result = ""
    var inputList = input.split(" ")
    for (i in inputList.reversed()) {
        result += "$i "
    }
    println(result.trim())
}

