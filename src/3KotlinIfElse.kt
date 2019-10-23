fun main() {
    var num1=2
    var num2=5

    // 1st way
   /* if (num1>num2){
        println("Bigger number is $num1")
    }else{
        println("Bigger number is $num2")
    }*/

    //2nd way
   // if (num1>num2) println("Bigger number is $num1")else  println("Bigger number is $num2")

    //3rd way

    var biggerNumber=if (num1>num2) num1 else num2
    println("Bigger number is $biggerNumber")

}
