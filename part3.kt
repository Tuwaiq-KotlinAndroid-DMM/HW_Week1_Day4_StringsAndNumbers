fun main() {
    println("write the temperature in F to convert to C : ")

    var F = readLine()!!.toInt()
    var C = (5* (F-32)) / 9

    println(C)
}

