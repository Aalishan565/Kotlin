package kotlin_basics

fun main() {
    var dog = Animal("Dog")
    dog.canSound("bark")
    // dog canSound ("bark")
}

infix fun Animal.canSound(type: String) {
    print("This Animal's sound $type")
}
