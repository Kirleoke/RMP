open class Bug(val rank: Int, val name: String) {
    open fun getSugarLimit(): Int {
        return rank
    }

    fun getId(): String {
        return "${rank}.${name}"
    }
}

class BugCivilian(rank: Int, name: String) : Bug(rank, name) {
    override fun getSugarLimit(): Int {
        return super.getSugarLimit() / 2
    }
}
fun main() {
    val civilian1 = BugCivilian(5, "Авось")
    val civilian2 = BugCivilian(8, "Не Вось")

    println(civilian1.getSugarLimit()) // Вывод: 2
    println(civilian2.getSugarLimit()) // Вывод: 4

}