package classesObjects

class Lesson(val title : String?, val points : Int?) {
    fun display() = print("Lesson $title worth $points points.")
}
fun main(){
    val mathObject = Lesson("Maths",50)
    mathObject.display()

    val mathObj2 = Lesson(null, null)
    println()
    mathObj2.display()
}