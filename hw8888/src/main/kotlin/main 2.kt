fun main(args: Array<String>) {
    println(getLength("This is  string!"))
}


fun getLength(str: String?) : Int {
    str?.let {
        return str.length;
    }?: return 0}