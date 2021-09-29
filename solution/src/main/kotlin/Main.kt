
fun getLength(str: String?) : Int {
    // Add null check here
    var str: String = "abc"
    return str.length;
}
fun main(args: Array<String>) {
    //==================================================================================================================
    //Part I - Null Safety.
    //==================================================================================================================
    //In the code below, add an if statement to the beginning of getLength that returns zero if str is null:
    var s = null
    var g = getLength(s)
    if(g != null){ println(getLength("This is a string!"))}
    else{ print("0")}
    //==================================================================================================================
    //Part II - Strings.
    //==================================================================================================================
    //Write a Kotlin program to get a substring of a given string between two specified positions.
    // out put : brown fox jumps 10,26
    var old = "The quick brown fox jumps over the lazy dog"
    var StartIndex = 10
    var EndIndex = 26
    var new = old.subSequence(StartIndex,EndIndex)
    println("old: {$old}")
    println("new: {$new}")
    //==================================================================================================================
    //Part III - Numbers
    //==================================================================================================================
    //Write a Kotlin program to convert temperature from Fahrenheit to Celsius degree.
    //212 F = 100 C
    print("Please enter the temperature in Fahrenheit: ")
    var f = readLine()!!.toInt()
    var c = (( 5 * (f - 32)) / 9)
    print("\n $c")
    //==================================================================================================================
}