class SumOfMultiples {
    companion object {
        fun sum(multiplesOf: Set<Int>, number: Int): Int = (1 until number)
                .filter { n -> multiplesOf.any { n % it == 0 } }.sum()
    }
}
