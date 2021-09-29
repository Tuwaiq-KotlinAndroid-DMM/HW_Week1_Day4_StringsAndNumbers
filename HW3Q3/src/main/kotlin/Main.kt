fun main(args: Array<String>) {
println("Enter Fahrenheit Temperature ")
    var F = readLine()!!.toInt()
    var C = (5 * (F - 32)) / 9
    println("$F degree Fahrenheit is equal to $C in celsius.")
}