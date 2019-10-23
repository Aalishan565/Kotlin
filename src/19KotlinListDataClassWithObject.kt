data class Developer(val language: String, val year: String) {

}

object SoftwareDeveloper {
    var developerList = arrayListOf<Developer>()
    fun showData() {
        for (i in developerList) {
            println(i)
        }
    }
}

fun main() {
    SoftwareDeveloper.developerList.add(Developer("Java", "1"))
    SoftwareDeveloper.developerList.add(Developer("Android", "1"))
    SoftwareDeveloper.developerList.add(Developer("Kotlin", "1"))
    SoftwareDeveloper.showData()
}