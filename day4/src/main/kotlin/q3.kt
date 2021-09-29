fun main(args: Array<String>) {


    println("Enter fahrenheit temperature:")

    var x = readLine()!!.toInt()
    var fahrenhiet = x
    var celsius = ((fahrenhiet-32) * 5) / 9
    println("celsius temperature is $celsius")

}