package dataClasses

data class User(val id : Long, val name : String, var level : Int)

fun main(){
    val user1 = User(1,"Alice",1)
    val user2 = user1.copy(level = 2)
    println(user1)
    println(user2)

    //unpack properties of data class into separate variables
    val (user1_id, user1_name, user1_level) = user1
    println(user1_id)
    println(user1_name)
    println(user1_level)
}