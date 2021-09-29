fun main(args: Array<String>) {
    println(getLength("This is a string!")) //Part I - Null Safety

    // Part II - Strings
    val old = "The quick brown fox jumps over the lazy dog."
    val startIndex = 10
    val endIndex = 24

    val new = old.subSequence(startIndex, endIndex)
    println(new)

    //Part III - Numbers
    println("Enter the degree in Fahrenheit")
    var f = readLine()!!.toDouble()
    var c = ( 5* (f-32)) / 9
    println("$f degree in Fahrenheit is equal to $c in Celsius")

}

//Part I - Null Safety
fun getLength(str: String?): Int {
    if (str != null) {
        return str.length;
    } else {
        return 0
    }


}