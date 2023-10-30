fun main() {
    println(calculateEvenDigits("1 2 3 4 5"))
}

fun calculateEvenDigits(nums: String): Int {
    return nums.split(" ").stream().mapToInt { num -> num.toInt() }.filter { num -> num % 2 == 0 }.sum();
}