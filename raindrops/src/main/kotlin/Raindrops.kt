import java.lang.StringBuilder

class Raindrops {


    companion object  {
        fun convert(input: Int) : String {
            val result = getFactors(input)
            return if (result.isBlank()) input.toString() else result
        }

        private fun getFactors(input: Int): String {
            val factorsOf  = listOf(3, 5, 7)
                    .asSequence()
                    .filter { input % it == 0 }
                    .map {
                        when(it) {
                            3 -> "Pling"
                            5 -> "Plang"
                            7 -> "Plong"
                            else -> ""
                        }
                    }.joinToString("")
            return factorsOf
        }
    }
}
