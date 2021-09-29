fun main(args: Array<String>) {
    println("temperature in  Fahrenheit is: ")
    var H = readLine()!!.toDouble()
    val C = ((H - 32) * 5) / 9
    println("$H degree Fahrenheit is equal to $C Celsius")


}
