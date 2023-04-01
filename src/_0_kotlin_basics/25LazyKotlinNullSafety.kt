package _0_kotlin_basics

fun main() {
  // no memory will be allocated to this statement if you are not using it
    val someValue: String by lazy { "Hi this is me" }
    print(someValue)
}