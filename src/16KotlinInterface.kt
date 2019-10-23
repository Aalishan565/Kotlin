interface RBI {
    fun interest()

}

class SBI : RBI {
    override fun interest() {
        println("SBI interest 7.6")
    }

}

class ICICI : RBI {
    override fun interest() {
        println("ICICI interest 7.9")
    }
}

class HDFC : RBI {
    override fun interest() {
        println("ICICI interest 8.0")
    }
}

fun main() {
var icici=ICICI()
    icici.interest()
}