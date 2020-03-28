import java.lang.IllegalArgumentException

object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        if (n < 1 || s.isEmpty() || n > s.length) throw IllegalArgumentException("Invalid Argument")
        val sliced = s.split("").filterNot { it.isEmpty() }.map { it.toInt() } .toList()
        return (sliced.indices)
                .map { if (it + n <= sliced.size) sliced.subList(it, it + n) else emptyList() }
                .filterNot { it.isEmpty() }
    }
}
