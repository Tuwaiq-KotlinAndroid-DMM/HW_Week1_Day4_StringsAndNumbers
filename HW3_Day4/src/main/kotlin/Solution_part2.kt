fun main() {
    // Part 2 - Strings
    var phrase = "The quick brown fox jumps over the lazy dog."
    var newPhrase = phrase?.let {
        it.substring(10, 25)
    }
    println("old = $phrase\nnew = $newPhrase")

    // Down here I tried to use try and catch in case we specify the index wrong :)
//    try {
//        var phrase = "The quick brown fox jumps over the lazy dog."
//        var newPhrase = phrase?.let {
//            it.substring(10, 25)
//        }
//        println("old = $phrase\nnew = $newPhrase")
//    } catch (e: StringIndexOutOfBoundsException) {
//        println("Index out of bound: The string is smaller than the specified index!")
//    } catch (e: Exception) {
//        println("Error: Invalid Input.")
//    }
}