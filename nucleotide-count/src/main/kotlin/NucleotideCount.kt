class Dna(val sequence: String) {

    init {
        require( sequence.all { it in listOf('A','C','G','T') } )
    }

    val nucleotideCounts: Map<Char, Int>
        get() =
             "ACGT".map { it to 0 }.toMap().let {
                map ->
                map + sequence.groupingBy { it }.eachCount()
            }

}
