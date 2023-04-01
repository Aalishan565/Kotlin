package _3_strings

fun main() {
    firstFromLastNonRepeatingChar("aalishan")
}

fun firstFromLastNonRepeatingChar(inputString: String) {
    val max_size = 256
    var count = IntArray(max_size)
    for (input in inputString) {
        count[input.toInt()]++
    }
    for (i in inputString.length - 1 downTo 0) {
        var char = inputString[i]
        if (count[char.toInt()] == 1) {
            println(char)
            break
        }
    }

}
