class Animal(inputName:String) //primary Constructor
//class Animal(inputName:String="Cat") //default Constructor
{
    init {
        println("Init block")
    }
    constructor(age:Int,name:String):this(name)

    var name:String?=inputName;

    fun showName(){
        print(name)
    }
}