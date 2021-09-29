//Part 1 Null safty
//fun getLength(str: String?) : Int {
//    if (str != null)
//    return str.length
//    else
//        return 0
//}
//
//fun main(args: Array<String>) {
//    println(getLength(null))
//}
//Part 2 strings
//fun main () {
//    val menuData = "The quick brown fox jumps over the lazy dog"
//    val data = menuData.split(' ')
//    val new = "${data[2]} ${data[3]} ${data[4]}"
//    println(new)
//}
//Part 3 numbers
//fun main(){
//    println("Write the temperature in F° to convert it to C°:")
//   var F = readLine()!!.toInt()
//    var C = (F-32)*0.556
//  println("C°${"%.1f".format(C)}")
//}