// part 1

fun main(args: Array<String>) {
    fun getLength(str: String?) : Int {
        if(str != null)

            return (str. length)
        else
            return 0
    }

    fun main(args: Array<String>) {
        println(getLength("This is a string!"))
    }
}


//part2


fun main(){

    var old =" The quick brown fox jumps over the lazy dog."

    var new : String

    println(old.substring(11,26))
}


//part3


fun main() {
    println("write the temperature in F to convert to C : ")

    var F = readLine()!!.toInt()
    var C = (5* (F-32)) / 9

    println(C)
}

