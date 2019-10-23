fun main() {
    /*  val str1 = "Hello, World!"
      val str2 = "Hello, World!"
      println(str1==str2) //true*/
//String buffer
    val str1 = buildString { "string value" }
    val str2 = buildString { "string value" }

    println(str1 == str2)

    var a: String? = "abc"
    a = null //
    println(a)
}
