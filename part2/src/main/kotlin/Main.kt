fun main () {
    var old: String = "The quick brown fox jumps over the lazy dog"
    var toNew = old.split(' ')
    var new = "${toNew[2]} ${toNew[3]} ${toNew[4]}"
    println(new)
}
