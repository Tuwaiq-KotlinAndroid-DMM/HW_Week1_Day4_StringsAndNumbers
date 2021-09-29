//Part I - Null Safety.
// i used Elvis-operator (?:) if str is null will returns zero
fun getLength(str: String?): Int {
    val x = str?.length ?: 0

    return x
}

fun main(args: Array<String>) {
    println(getLength("This is a string!"))
}
