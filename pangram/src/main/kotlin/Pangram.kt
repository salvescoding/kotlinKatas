object Pangram {
    fun isPangram(sentence: String) = ('a' .. 'z').all {char ->
        sentence.contains(char, true)
    }
}
