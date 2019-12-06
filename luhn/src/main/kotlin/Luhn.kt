private fun Int.doubleTheNumberTheLuhnWay(): Int  = if ((this * 2) > 9)  ((this * 2) - 9) else (this * 2)

class Luhn {
    companion object {
        fun isValid(ccNumber: String): Boolean {
            if (ccNumber.hasLessThanTwoDigits()) return false
            if (ccNumber.hasAnyElementApartFromDigitsOrWhitespaces()) return false

            return ccNumber.reversed().filter { it.isDigit() }
                    .map { it.toString().toInt() }
                    .mapIndexed  { index, element ->
                        doubleEverySecondFromRightmost(index, element)
            }.sum() % 10 == 0

        }

        private fun doubleEverySecondFromRightmost(index: Int, element: Int): Int = when {
                index and 1 != 0 -> element.doubleTheNumberTheLuhnWay()
                else -> element
            }

        private fun String.hasAnyElementApartFromDigitsOrWhitespaces() = any { !it.isWhitespace() && !it.isDigit() }

        private fun String.hasLessThanTwoDigits() = filter { !it.isWhitespace() }.length < 2
    }
}



