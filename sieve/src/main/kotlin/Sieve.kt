import kotlin.math.sqrt

class Sieve {

    companion object {
        fun primesUpTo(number: Int) : List<Int> = when {
            number < 2 -> emptyList()
            number == 2 -> listOf(2)
            else -> (2 until number).filter{ it.isPrime() }.toList()
        }

        fun Int.isPrime() : Boolean = (this downTo 2).filter { this % it == 0 }.toList().size == 1
    }

}
