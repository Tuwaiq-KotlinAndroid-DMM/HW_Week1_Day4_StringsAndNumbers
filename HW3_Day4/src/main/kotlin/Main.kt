fun main(args: Array<String>) {
    // Part 1 - Null safety
    println(getLength("This is a string!"))
    println(getLength("")) // Output: 0
}

fun getLength(str: String?): Int {
    // Add null check here
    return if (str != null)
        str.length
    else 0
    /* Another way:
       We could use coalescing operator to solve it!
       return str?.length ?: 0 */
}