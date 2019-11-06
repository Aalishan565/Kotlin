fun main() {

    // Safe call operator:-      ?.  //  ? value can be nullable

    val name: String? = "Abcd"
    print(name?.length)

    //  Safe call with let:-        ?.let{….}
    // will execute code only if the name is not null
    name?.let { print(name.length) }

    // if name not null return length else return -1
    val length = name?.length ?: -1
    print(length)

    //Use only if you are sure this name will not null
    print(name!!.length)
}