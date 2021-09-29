fun main(args: Array<String>) {
    println("input adegree in fahrenhiet:")
    var fahrenheit = readLine()!!.toDouble()
    val celsius =( (fahrenheit  -  32  ) *  5)/9
    println("$fahrenheit degree Fahrenheit is equal to $celsius in Celsius.")

}