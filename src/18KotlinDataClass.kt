data class Laptop(val brand: String, val price: String) {
//toString
// equals and hashcode
// copy
}

fun main() {
    var lap1 = Laptop("Dell", "10")
    var lap2 = Laptop("Apple", "20")
    var lap3 = lap2.copy("202")
    println(lap1)
}