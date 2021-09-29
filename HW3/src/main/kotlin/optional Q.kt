fun main(args: Array<String>) {
    val str1 = "The quick brown fox jumps over the lazy dog."
    var startIndex = 9
    val endIndex = 25
    val substring = str1.subSequence(startIndex, endIndex)
    println("The substring is : " + substring)

}