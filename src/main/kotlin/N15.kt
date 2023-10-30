fun main() {
    println(getLengthNullSafety("чимичанги"))
    println(getLengthNullSafety(null))
}

fun getLengthNullSafety(str: String?): Int {
    return str?.length ?: 0
}