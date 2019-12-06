class Isogram {
    companion object {
        fun isIsogram(word: String) : Boolean {
             return word.toLowerCase()
                        .filter(Char::isLetter)
                        .groupingBy { it }.eachCount()
                        .all { it.value == 1  }
        }
    }

}
