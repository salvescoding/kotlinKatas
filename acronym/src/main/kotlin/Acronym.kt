class Acronym {
    companion object {
        fun generate(phrase: String) : String {
            return phrase.split(" ", "-")
                    .filter { !it.isNullOrBlank() }
                    .map { it.first().toUpperCase() }
                    .joinToString("")
        }
    }
}
