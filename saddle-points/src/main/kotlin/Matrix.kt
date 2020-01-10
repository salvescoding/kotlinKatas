class Matrix(val grid: List<List<Int>>) {

    val saddlePoints : Set<MatrixCoordinate>
        get() {
            val setOfMatrix = mutableSetOf<MatrixCoordinate>()
            if (grid.isEmpty()) return emptySet()
             grid.forEachIndexed { indexRow, list ->
                list.forEachIndexed { indexColumn, i ->
                    when {
                        isHigherInTheRowAndSmallerOfTheColumn(i, list, indexColumn) -> setOfMatrix.add(MatrixCoordinate(indexRow + 1, indexColumn + 1))
                    }
                }
            }
            return setOfMatrix
        }

    private fun isHigherInTheRowAndSmallerOfTheColumn(i: Int, list: List<Int>, indexColumn: Int) =
            i == list.max() && grid.all { list -> i <= list[indexColumn] }


}
