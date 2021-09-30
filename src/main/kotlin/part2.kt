fun main(args: Array<String>) {
    println(getLength(null))

}

fun getLength(str: String?): Int {

    if (str != null) {

        return (str.length)
    } else {
        throw Exception("0")
    }
}