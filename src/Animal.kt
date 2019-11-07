class Animal(inputName: String) //primary Constructor

//class Animal(inputName:String="Cat") //default Constructor

{
    //get call after primary Constructor
    //Used for some initialization
    init {
        println("Init block")
    }

    //Secondary constructor
    constructor(age: Int, name: String) : this(name)

    var name: String? = inputName;
    fun showName() {
        print(name)
    }
}