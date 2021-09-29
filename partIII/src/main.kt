fun main(){
    println("Enter the degree in Fahrenheit:")
    var F = readLine()!!.toInt()
    var C = (5*(F-32))/9
    println("$F'F' is equal to $C'C' ")
}