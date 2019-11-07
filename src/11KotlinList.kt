fun main() {

    //read only, fix-size
    // list of Integers
    var intList: List<Int> = listOf(1, 2, 3)

    //String list
    var stringList: List<String> = listOf("A", "B", "C")

    // Any list or object list
    var anyList: List<Any> = listOf(1, 2, 3, "A", "B", "C")

    var list = listOf("A", "B", "C")
    for (element in list) {
        println(element)
    }

    //Mutable list in kotlin
    var mutableList = mutableListOf("Ajay", "Vijay", "Prakash", "Vijay")

    mutableList.add("A")
    mutableList.add("B")


    for (m in mutableList) {
        println(m)
    }

    // ArrayList in kotlin
    var arrayList = arrayListOf("Ajay", "Vijay", "Prakash", "Vijay")
    arrayList.add("")
    var listInputData: ArrayList<String> = ArrayList()
}
