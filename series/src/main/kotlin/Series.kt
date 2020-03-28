import java.lang.IllegalArgumentException

object Series {

    fun slices(length: Int, digits: String): List<List<Int>> {
        require(length <= digits.length && length > 0 && digits.isNotEmpty()) {
            throw IllegalArgumentException("Invalid Argument") }
        return digits.map { it.toString().toInt() }.windowed(length)
    }
}
