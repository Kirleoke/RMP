class NibirunianClass() {
    public lateinit var namePlate: String

    public fun createNamePlate(name: String) {
        namePlate = "Живи долго и счастливо, $name"
    }
}

fun main() {
    val plate = NibirunianClass()
    plate.createNamePlate("Равшан")
    println(plate.namePlate)
}