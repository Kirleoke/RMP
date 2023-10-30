fun main() {
    println(calcChairs(5))
}

fun calcChairs(aliensCount: Int): Int {
    return aliensCount + aliensCount / 2
}