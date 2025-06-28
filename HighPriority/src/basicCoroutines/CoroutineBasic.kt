package basicCoroutines

//import kotlinx.coroutines.* // We need this for coroutines
//
//fun main() = runBlocking { // This starts a special coroutine 'scope' that blocks the main thread until its work is done.
//    // Think of it as: "Run this block of code using coroutines, and wait for them."
//
//    println("Main program starts") // This will print first
//
//    // launch is a coroutine builder: It starts a new coroutine (lightweight thread)
//    // that runs concurrently with the rest of the code in 'runBlocking'.
//    launch {
//        // This code block will run in the background.
//        delay(1000L) // 'delay' is a special coroutine function. It pauses *this specific coroutine*
//        // for 1 second (1000 milliseconds) without blocking the main program thread.
//        println("Hello from coroutine!") // This will print after 1 second
//    }
//
//    println("Main program continues") // This will print immediately after 'launch' is called
//    // because 'launch' doesn't wait for its coroutine to finish.
//
//    // runBlocking will wait here until the 'launch' coroutine finishes its delay and prints.
//    println("Main program ends") // This will print last, after the coroutine finishes
//}