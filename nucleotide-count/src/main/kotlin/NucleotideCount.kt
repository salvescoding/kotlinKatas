class Dna(val nucleotoids: String) {
    private val listOfAllowed = listOf('A','C','G','T')

    init { require(nucleotoids.all { it in listOfAllowed }) }


    val nucleotideCounts: Map<Char, Int>
        get() {
            val mutableMap = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
            return if (nucleotoids.isEmpty()) {
                mutableMap
            } else {
                nucleotoids.split("").asSequence().filterNot { it.isEmpty() }.map { it.single() }.forEach {
                    mutableMap.merge(it, 1, Int::plus)
                }
                mutableMap
            }
        }

}
