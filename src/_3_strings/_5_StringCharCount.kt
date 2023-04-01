package _3_strings

import java.util.function.BiConsumer


fun main() {
    stringCharCount("aalishan")
}

fun stringCharCount(inputString: String) {
    var hashMap: HashMap<Char, Int> = HashMap()
    for (char in inputString) {
        if (hashMap.containsKey(char)) {
            var count = hashMap[char]!!
            hashMap[char] = ++count
        } else {
            hashMap[char] = 1
        }
    }
    hashMap.forEach { (K,V)-> println("$K : $V" ) }


}

