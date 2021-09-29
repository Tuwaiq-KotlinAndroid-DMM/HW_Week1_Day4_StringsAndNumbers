fun getLength(str: String?) : Int {
    // Add null check here
checkNotNull(str)
{
    return 0
}
    return str.length;
}

fun main(args: Array<String>) {
    /**
     * Part 1
     */
    println(getLength("This is a string!"))



    /**
     * Part 2
     */

var astring="The quick brown fox jumps over the lazy dog"
    println("Enter the beginning and ending indexes to extract the substring from: $astring")
    var beg= readLine()?.toInt()
    var end=readLine()?.toInt()
var bstring=astring.subSequence(beg!!,end!!)
println(bstring)


    /**
     * Part 3
     */

println("Enter a degree in Fahrenheit")
    var feh=readLine()?.toDouble()
    var cel=(5 * (feh!! - 32)) / 9
    println("$feh Fahrenheit is equal to  $cel  Celsius")

}