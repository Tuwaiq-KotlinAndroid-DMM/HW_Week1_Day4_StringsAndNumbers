
fun getLength(str: String?) : Int {

     if (str?.length != null){
         return str.length
    }else {
        return 0
    }
}

fun main(args: Array<String>) {
    println(getLength(""))

}