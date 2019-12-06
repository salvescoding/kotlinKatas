class Anagram(private val word: String) {
    fun match(words: List<String>): Set<String> = if (word.all { it.isUpperCase() })  emptySet() else
          words.filter {
          it.toLowerCase().toCharArray().sorted() == word.toLowerCase().toCharArray().sorted()
      }.toSet()
}
