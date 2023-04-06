package _3_strings

import java.util.*


fun main() {
    val input1 = "shanlaai"
    val input2 = "aashanli"
    println(isAnagramUsingHashMap(input1, input2))
}

private fun areStringsAnagram(input1: String, input2: String): Boolean {
    var char1 = input1.toCharArray()
    var char2 = input2.toCharArray()
    Arrays.sort(char1)
    Arrays.sort(char2)
    return char1.contentEquals(char2)
}

private fun areStringsAnagramUsingCounter(input1: String, input2: String): Boolean {
    if (input1.length != input2.length) {
        return false
    }
    val CHARACTER_RANGE = 256
    var count = IntArray(CHARACTER_RANGE)
    for ((index) in input1.withIndex()) {
        count[input1[index].toInt()]++
        count[input2[index].toInt()]--
    }
    for (i in count) {
        if (i != 0) {
            return false
        }
    }
    return true
}

private fun isAnagramUsingHashMap(input1: String, input2: String): Boolean {
    if (input1.length != input2.length) {
        return false
    }
    val hm: HashMap<Char, Int> = HashMap()
    for (i in input1.indices) {
        if (hm.containsKey(input1[i])) {
            var count = hm[input1[i]]!!
            hm[input1[i]] = ++count
        } else {
            hm[input1[i]] = 1
        }
    }
    for (i in input2.indices) {
        if (hm.containsKey(input2[i])) {
            var count = hm[input2[i]]!!
            hm[input2[i]] = --count
        }
    }
    for (i in input2.indices) {
        if (hm.containsKey(input2[i])) {
            hm.remove(input2[i])
        }
    }
    return hm.isEmpty()
}