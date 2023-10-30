class SugarStorage(public var volume: Int) {
    public fun increaseSugar(v: Int) {
        if (v < 0)
            return
        if (v > volume) {
            volume = 0
            return
        }
        volume += v
    }

    public fun decreaseSugar(v: Int) {
        if (v < 0)
            return
        if (volume - v < 0)
            return
        volume -= v
    }
}

fun main() {
    val sugarStorage = SugarStorage(50)
    sugarStorage.increaseSugar(25)
    println(sugarStorage.volume)
    sugarStorage.decreaseSugar(10)
    println(sugarStorage.volume)
    sugarStorage.decreaseSugar(70)
    println(sugarStorage.volume)
}