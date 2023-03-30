package kotlin_basics

fun main() {
    var dog = Animal("Dog")
    // var dog1 = Animal(11,"Dog")
    dog.canWalk()
    //dog.canSound("bark")
    // dog canSound ("bark")
}

fun Animal.canWalk() {
    print("Animal can walk")
}

/*
infix fun Animal.canSound(type: String) {
    print("This Animal's sound $type")
}*/
