class Year(year: Int) {

    private val NOT_EVEN_DIVISIBLE_BY_100_OR_EVEN_DIVISIBLE_BY_400 = year % 100 != 0 || year % 400 == 0

    val isLeap : Boolean = if (year % 4 == 0) NOT_EVEN_DIVISIBLE_BY_100_OR_EVEN_DIVISIBLE_BY_400 else false
}
