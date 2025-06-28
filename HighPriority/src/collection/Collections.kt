package collection

fun main(){
    val scores = listOf(10, 20, 30, 40)

    //filter, map, foreach
    scores.
        filter { it >= 50 }
        .map { it * 2 }
        .forEach { println("Boosted score: $it") }

    // Mutable collection
    val lessons = mutableListOf("Intro")
    lessons += "Basics"
    println(lessons)
}