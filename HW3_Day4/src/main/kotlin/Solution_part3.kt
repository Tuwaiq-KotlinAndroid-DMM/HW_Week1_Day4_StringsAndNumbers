fun main() {
    // Part 3 - Numbers
    println("Input a degree in Fahrenheit: ")
    var degreeInF = readLine()!!.toDouble()
    var degreeInC = (5 * (degreeInF - 32)) / 9
    println("$degreeInF degree Fahrenheit is equal to ${"%.1f".format(degreeInC)} in Celsius.")
}