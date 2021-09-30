fun main(){
convertDegree()
}
fun convertDegree(){
    print("Enter Fahrenheit temperature:\t")
    var Fahrenheit = readLine()!!.toFloat()

    var Celsius: Float = (5*(Fahrenheit-32))/9

    println("Temperature Fahrenheit $Fahrenheit = $Celsius Celsius ")

}