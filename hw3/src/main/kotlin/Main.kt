fun getLength(str: String?) : Int{

    if (str != null) {
        println("String of length is null")
        else run {
            println("Empty string")
        }
        return str.length
    };
}

fun main(args: Array<String>) {
    println(getLength("This is a string!"))
}
