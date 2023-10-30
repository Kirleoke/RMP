fun calculateSumOfEvenDigits(input: String): Int {
    var sum = 0
    for (char in input) {
        val digit = char.toString().toIntOrNull()
        if (digit != null && digit % 2 == 0) {
            sum += digit
        }
    }
    return sum
}

fun main() {
    val paymentString = "12abc345def6"
    val evenSum = calculateSumOfEvenDigits(paymentString)
    println(evenSum)
}