package functionsLambdas

fun greetUser(greetingFunction: (String) -> Unit) {
    // Call the function that was passed in, giving it a name.
    greetingFunction("Alice")
}

fun main() {
    // Here we define the actual function that will be passed to greetUser.
    // It takes a 'name' (String) and prints a personalized greeting.
    greetUser { name -> println("Hello, $name!") }

    // You could also write it like this for clarity, though the above is more common Kotlin style:
    val myGreetingLogic: (String) -> Unit = { name -> println("A warm welcome, $name!") }

    greetUser(myGreetingLogic)
}