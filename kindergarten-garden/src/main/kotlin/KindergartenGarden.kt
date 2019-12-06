class KindergartenGarden(private val diagram: String) {

    private val letterToPlant = mapOf(
            'V' to "violets",
            'C' to "clover",
            'G' to "grass",
            'R' to "radishes"
    )

    private val studdentToPosition = mapOf(
            "Alice" to Pair(0, 2),
            "Bob" to Pair(2, 4),
            "Charlie" to Pair(4, 6),
            "Kincaid" to Pair(20, 22),
            "Larry" to Pair(22, 24)
    )

    fun getPlantsOfStudent(student: String): List<String> {
        val studentPosition = studdentToPosition.getOrElse(student) { Pair(0, 0) }
        return diagram.lines()
                .map { it.subSequence(studentPosition.first, studentPosition.second) }
                .joinToString("").map { letterToPlant.getOrElse(it) { "" } }
    }
}
