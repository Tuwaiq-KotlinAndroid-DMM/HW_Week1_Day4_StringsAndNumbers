//Part III - Numbers.
fun main(args: Array<String>) {
//FAHRENHEIT TO CELSIUS CONVERSION CALCULATOR
    print("Enter Fahrenheit: ")
    var h = readLine()!!.toDouble()
    var c = conv(h)
    print("${"%.1f".format(c)} C")


}

val conv: (Double) -> Double = { f -> (5 * (f - 32)) / 9 }
