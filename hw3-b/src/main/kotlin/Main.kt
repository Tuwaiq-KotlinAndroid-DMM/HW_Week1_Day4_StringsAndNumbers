fun main() {

 println("Enter temperature Fahrenheit F° into Celsius C°:")
 var f = readLine()!!.toInt()



var result = ((f - 32)*5/9)
println(message = "Celsius C°: $result")

}