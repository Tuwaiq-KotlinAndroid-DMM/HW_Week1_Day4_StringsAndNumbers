
// Function for calculate length of string
fun getLength(str: String?) : Int {

// null safety check the string is not null return length of string, if null return 0
//    str?.let { return str.length } ?: return 0

// This another solution
// Check if string null or not
    if (str != null)
        // If string not null return length of string
        return str.length
    else
        // If string null return 0
        return 0


}

fun main(args: Array<String>) {
    // Call function and print the value
    println(getLength("This is a string!"))
}