fun main() {
    println("This is kotlin file")
    var xyz=XYZ()
    xyz.show()

}
open class ABC {
    fun show(){
       println("Show")
    }
}
class XYZ:ABC() {


}

