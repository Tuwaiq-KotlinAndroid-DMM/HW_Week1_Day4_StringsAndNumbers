fun main(args: Array<String>) {

//Part I - Null Safety

    println(getLength("This is a string!"))
    // println(getLength2("This is a string of getLength2!"))
    // println(getLength3("This is a string of getLength3!"))

}

// --Using ?: --
fun getLength(str: String?) : Int {
        return str?.length?:0;
}

/////////////////

// --Using let--
//fun getLength2(str: String?) : Int {
//    str?.let {
//        return str.length;
//    }?: return 0
//}

/////////////////

// --Using if--
//fun getLength3(str: String?): Int {
//    if (str != null) {
//        return str.length;
//    } else {
//        return 0
//    }
//}