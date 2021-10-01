//fun getLength(str: String?) : Int {
//    // Add null check here
//
//     str?.let {
//         return str.length
//    }
//
//
//}

fun main(args: Array<String>) {
    println(getLength("This is a string!"))
}


fun getLength(str: String?) : Int {
    str?.let {
        return str.length;
    }?: return 0
}