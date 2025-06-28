package nullSafety

fun main(){
    greet(null)
    greet("Fenil")

    printMessage(null)
    printMessage("King")
}

//elvis operator (?:)
fun greet(userName: String?){
    //if provided userName is null they "Guest" be default value
    val name = userName ?: "Guest"
    println("Hello, $name")

}

//safety call operator (?.)
fun printMessage(text : String?){
    //Using the safe call operator
    //If "text" is null then "text?.length" evaluates to be null
    //and the entire expression text?.length also becomes null
    //If the text is not null then it proceeds to get the length
    val length : Int? = text?.length

    //Now, we need to also handle "length" which is also nullable (Int?)
    val message = if (length != null){
        "Length of $text is $length"
    } else {
        "Text is null so the length cannot be determined."
    }

    println(message)
}