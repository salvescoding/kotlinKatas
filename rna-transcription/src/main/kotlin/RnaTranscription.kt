val dnaToRna = mapOf<Char, Char>(
        'G' to 'C',
        'C' to 'G',
        'T' to 'A',
        'A' to 'U'
)

fun transcribeToRna(dna: String): String {
    return dna.map(::convertToRna).joinToString("")
}

private fun convertToRna(dna: Char)  = dnaToRna.get(dna)

