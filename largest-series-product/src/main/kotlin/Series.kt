import java.lang.IllegalArgumentException

class Series(private val input: String) {

    val numbers = input.split("").filter { it.isNotEmpty() }.map { it.toInt() }

    fun getLargestProduct(numberOfSeries: Int): Int = when  {
            numberOfSeries == 0 -> 1
            numberOfSeries > input.length || input.any { !it.isDigit() } ->  throw IllegalArgumentException("")
            else -> numbers.windowed(numberOfSeries).map { it.reduce { acc, i -> i * acc } }.max()!!
        }
}
