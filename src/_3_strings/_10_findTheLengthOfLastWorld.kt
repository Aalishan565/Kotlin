package _3_strings

fun main() {
    println(findTheLengthOfLastWorld("Hello world"))
}

fun findTheLengthOfLastWorld(s1: String): Int {
    var count:Int=0
    return if (s1.trim().isEmpty()) {
        0
    } else if (s1.trim().length == 1) {
        1
    } else {
        for (inputChars in s1.trim().reversed()) {
            if (inputChars == ' '){
                break
            }else{
                count++
            }
        }
        count
    }
}
