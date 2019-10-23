fun main() {
    var intList: List<Int> = listOf(1, 2, 3)
    var stringList: List<String> = listOf("A", "B", "C")
    var anyList: List<Any> = listOf(1, 2, 3, "A", "B", "C")
    var list = listOf("A", "B", "C") //read only, fix-size
    for (element in list) {
       // println(element)
    }

    //Mutable list in kotlin
    var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")
    mutableList.add("A")
    mutableList.add("B")
    for (m in mutableList){
        println(m)
    }
}
