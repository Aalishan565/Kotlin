package _3_strings

import java.util.*

fun main() {
    var givenStringsArray = arrayOf("cloth", "clove", "clock", "clob")
    findLongestCommonPrefixInStringArray(givenStringsArray)
}

fun findLongestCommonPrefixInStringArray(givenStringsArray: Array<String>) {
    when (givenStringsArray.size) {
        0 -> {
            println("No longest prefix found")
        }

        1 -> {
            println("Longest common prefix:${givenStringsArray[0]}")
        }

        else -> {
            Arrays.sort(givenStringsArray)
            val substringLength = givenStringsArray[0].length
            var sb = StringBuffer()
            repeat(substringLength) { index ->
                if (givenStringsArray[0][index] == givenStringsArray[givenStringsArray.size - 1][index]) {
                    sb.append(givenStringsArray[0][index])
                }
            }
            println(sb)
        }
    }
}
