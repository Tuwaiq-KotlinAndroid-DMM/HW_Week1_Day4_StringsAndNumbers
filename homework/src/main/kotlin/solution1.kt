import java.lang.Exception

fun main(args: Array<String>) {

    println(getLength("This is a string!"))
}

fun getLength(str: String?) : Int{
    // Add null check here
    var st1=str?:throw Exception("null")
        return str.length
   // else{
    //    return str

}