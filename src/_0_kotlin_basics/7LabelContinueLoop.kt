package _0_kotlin_basics

fun main() {
    /*for (i in 1..3) {
        println("i = $i")
        if (i == 2) {
            continue
        }
        println("Rest code")
    }*/

    labelname@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2) {
                continue@labelname
            }
            println("Rest code")
        }
    }

}
