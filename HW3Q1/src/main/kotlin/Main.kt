fun main(args: Array<String>) {
    println(getLength("This is a string!"))
}

fun getLength(str: String?): Int {
    if (str != null)
        return (str.length)
    else {
        return 0
    }
}
