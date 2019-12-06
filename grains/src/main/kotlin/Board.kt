import java.lang.IllegalArgumentException
import java.math.BigInteger

class Board {



    companion object {
        fun getGrainCountForSquare(number: Int) : BigInteger = when (number) {
            1 -> BigInteger.ONE
            !in (1..64) -> throw IllegalArgumentException("Only integers between 1 and 64 (inclusive) are allowed")
            else -> (2..number).fold(1.toBigInteger()) { acc, _ ->  acc * 2.toBigInteger() }
        }

        fun getTotalGrainCount(): BigInteger  = (1..64).map(::getGrainCountForSquare)
                .reduce { acc, bigInteger -> acc + bigInteger }

    }

}
