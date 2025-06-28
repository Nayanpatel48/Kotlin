package scopFunctions

import dataClasses.User

fun main() {
    // apply for building objects
    val user = User(1, "Bob", 1).apply {
        level = 2
        println("Upgraded: $this")
    }

    // also for side effects
    user.also { println("Logging user: $it") }

    // run for executing block
    val summary = user.run { "${name} is at level $level" }
    println(summary)
}