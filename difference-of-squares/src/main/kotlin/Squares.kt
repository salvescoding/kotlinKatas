class Squares(private val input: Int) {
    fun squareOfSum(): Int  = squareOf((0..input).sum())

    fun sumOfSquares(): Int = (0..input).map(::squareOf).sum()

    fun difference(): Int  = squareOfSum() - sumOfSquares()

    private fun squareOf(number: Int): Int = number.toBigDecimal().pow(2).toInt()
}
