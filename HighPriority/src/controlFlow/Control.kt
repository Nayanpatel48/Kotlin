package controlFlow

fun main(){
    nextAction(null)
    println()
    nextAction(89)
}
fun nextAction(score : Int?){
    //default value is 0 if 'score' is null
    val stdScore = score ?: 0

    if (stdScore < 33){
        println("Fail")
    } else {
        println("Pass")
    }

    when(stdScore){
        0 -> println("Start learning")
        in 1..99-> println("Start learning")
        else -> println("Mastered")
    }

    //loops
    val list = listOf("one", "two", "three")
    for (i in list) println(i)
//    while ()
}