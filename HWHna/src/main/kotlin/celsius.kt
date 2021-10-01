fun main(args: Array<String>) {

    println("Enter the tempreture in fahrenheit ")
    var F = readLine()!!.toDouble()

    var C = ( 5*(F-32)) / 9

    println(C)
    

}