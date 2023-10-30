fun main() {
    println(getLengthNullDangerous("чимичанги"))
    println(getLengthNullDangerous(null))
}

fun getLengthNullDangerous(str: String?): Int? {
    return str?.length
}