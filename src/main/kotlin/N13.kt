fun main() {
    println(engineStatus(5))
}

fun engineStatus(engineNumber: Int): String {
    return try {
        rawEngineStatus(engineNumber)
    } catch (e: EngineNotFoundException) {
        "engine $engineNumber not found"
    } catch (e: SensorsMeltException) {
        "engine $engineNumber offline"
    }
}

fun rawEngineStatus(engineNumber: Int): String {
    return "статус двигателя $engineNumber"
}

class EngineNotFoundException : RuntimeException()

class SensorsMeltException : RuntimeException()
