object PigLatin {

        const val ONE_CHAR = 1
        const val TWO_CHARS = 2
        const val THREE_CHARS = 3

    fun translate(input: String) : String {
        val ay = "ay"

        return input.split(" ")
                .map { word ->
                    when {
                        word.first().isVowel() || word.take(TWO_CHARS) in listOf("yt", "xr") -> word + ay
                        word.take(THREE_CHARS) in listOf("sch", "thr") -> word.drop(THREE_CHARS) + word.take(THREE_CHARS) + ay
                        word.take(TWO_CHARS).isSingleConsonantSound() -> word.drop(TWO_CHARS) + word.take(TWO_CHARS) + ay
                        word.length > THREE_CHARS && word.isConsonantBeforeQu() -> word.drop(THREE_CHARS) + word.take(THREE_CHARS) + ay
                        else -> word.drop(ONE_CHAR) + word.take(ONE_CHAR) + ay
                    }
                }.joinToString(" ")
    }

    fun Char.isVowel() = listOf('a', 'e', 'i', 'o', 'u').contains(this)
    fun String.isSingleConsonantSound() = listOf("ch", "qu", "th", "rh").contains(this)
    fun String.isConsonantBeforeQu() = !first().isVowel() && "qu".contentEquals(this.subSequence(1, 3))

}





