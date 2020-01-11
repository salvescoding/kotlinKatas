object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        return primeFactors(int.toLong()).map { it.toInt() }
    }

    fun primeFactors(long: Long): List<Long> {
        if (long == 1.toLong()) return emptyList()
        tailrec fun primeFactors_(prime: Long, listOfPrimes: List<Long>, number: Long) : List<Long> {
            return if (number <= 1)  listOfPrimes  else when  {
                number % prime == 0.toLong() -> primeFactors_(prime, listOfPrimes + prime.toLong(), number / prime)
                else -> primeFactors_(prime + 1, listOfPrimes, number)
            }
        }
        return primeFactors_(2.toLong(), listOf(), long)
    }
}
