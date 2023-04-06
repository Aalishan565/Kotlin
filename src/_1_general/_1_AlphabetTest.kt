package _1_general

fun main() {
    println(isAlphabet('1'))
}

private fun isAlphabet(char: Char): Boolean {
    return char in 'a'..'z' || char in 'A'..'Z'
}