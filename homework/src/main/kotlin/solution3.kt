fun main(){
    println("Enter temperature:\n")
try {
    var F = readLine()!!.toInt()

    var c = 5 * (F.minus(32)) / 9
    println("$F degree Fahrenheit is equal to $c in Celsius")

}catch (e:NumberFormatException){
    println("you did not enter a number ")

}




}