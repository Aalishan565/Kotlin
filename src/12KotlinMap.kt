fun main() {
    val myMap = mapOf(1 to "A", 4 to "B", 3 to "C")
    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }
}
