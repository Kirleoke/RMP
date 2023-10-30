import java.util.stream.IntStream
import kotlin.streams.toList

fun main() {
    println(getCubeList(5))
}

fun getCubeList(n: Int): List<Int> {
    return IntStream.range(0, n).map { num -> num * num * num }.toList()
}