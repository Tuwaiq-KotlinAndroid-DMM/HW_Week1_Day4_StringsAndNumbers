fun main(args: Array<String>) {

//Part III - Numbers

    println("Please Enter fahrenheit degree")
    var fahrenheit = readLine()!!.toDouble()
    var celsius: Double = (5 * (fahrenheit - 32)) / 9


    println("$fahrenheit degree Fahrenheit is equal to $celsius in celsius.")
   // println("$fahrenheit degree Fahrenheit is equal to ${(5 * (fahrenheit - 32)) / 9} in celsius}.")
}