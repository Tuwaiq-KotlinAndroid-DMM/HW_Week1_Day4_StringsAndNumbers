fun getLength(str: String?) : Int {
    // Add null check here
    if(str == null){
        return 0
    }else {
        return str.length;
    }
}

fun main(args: Array<String>) {
    println(getLength("This is a string!"))
}