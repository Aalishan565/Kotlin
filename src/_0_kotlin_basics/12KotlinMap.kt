package _0_kotlin_basics

fun main() {
    // immutable map
    val myMap = mapOf(1 to "A", 4 to "B", 3 to "C")

    // hash map
    val hashMap = hashMapOf(1 to "A", 4 to "B", 3 to "C")

    // hash map
    val hashMap2 = HashMap<Int, String>()
    hashMap.put(1, "Hello")

    for (key in myMap.keys) {
        println("Element at key $key = ${myMap[key]}")
    }
}
