package _0_kotlin_basics

fun main() {
    val str1 = "Hello, World!"
    val str2 = "Hello, World!"

    //Comparing the values in kotlin string
    println(str1 == str2) //true

    //Comparing the reference
    println(str1 === str2) //true

//String buffer
    val strBuffer1 = buildString { "string value" }
    val strBuffer2 = buildString { "string value" }

    //Comparing the values in kotlin string
    println(strBuffer1 == strBuffer2)

    //Comparing the reference
    println(strBuffer1 === strBuffer2)
}
