//Part II - Strings.
fun main(args: Array<String>) {
//substring of a given string  by subSequence() method
    var old = "The quick brown fox jumps over the lazy dog."
    var new = old.subSequence(10, 26)
    println(old)
    println("$new\b.")
}
