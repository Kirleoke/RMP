fun main() {
    println(calculateSugar(2, 5))
}

fun calculateSugar(dayNumber: Int, alienRang: Int): Int {
    return dayNumber * (alienRang + 42)
}