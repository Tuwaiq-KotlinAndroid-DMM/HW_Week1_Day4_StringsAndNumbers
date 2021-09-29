fun main(args: Array<String>) {
    // What program doing
    println("The program for translate from Fahrenheit Degree to Celsius Degree")

    // Declare two variables
    println("Enter degree in Fahrenheit: ")
    var fahrenheitDegree = readLine()!!.toInt()
    var celsiusDegree:Double

    // Calculate translate from Fahrenheit Degree to Celsius Degree
    celsiusDegree = ((5 * (fahrenheitDegree - 32))/9).toDouble()

    // Print degree from Fahrenheit Degree to Celsius Degree
    println("$fahrenheitDegree degree Fahrenheit is equal to $celsiusDegree in Celsius")
}