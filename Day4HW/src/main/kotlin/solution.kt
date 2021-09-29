fun getLength(str: String?): Int {

    // Add null check here
    if (str == null) {
        return 0
    } else {
        return str.length

    }
}

fun main(args: Array<String>) {
    println(getLength("This is a string!"))
    println((getSubString("The quick brown fox jumps over the lazy dog", 10, 24)))
    println("Enter the degree in Fahrenheit")
    var degree: Int = readLine()!!.toIntOrNull() ?: 0
    println("$degree degree Fahrenheit is equal to ${temp(degree)} in Celsius.")


}

fun getSubString(text: String, num1: Int, num2: Int): String {
    var subtext = text.substring(num1, num2)
    return subtext

}

fun temp(degree: Int): Int {
    var C = (5 * (degree - 32)) / 9
    return C

}