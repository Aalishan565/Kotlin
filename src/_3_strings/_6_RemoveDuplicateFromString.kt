package _3_strings

fun main() {
    removeDuplicateFromString("aalishan")
}

private fun removeDuplicateFromString(inputString: String) {
    var result = ""
    for (input in inputString) {
        if (!result.contains(input)) {
            result += input
        }
    }

    println(result)

}