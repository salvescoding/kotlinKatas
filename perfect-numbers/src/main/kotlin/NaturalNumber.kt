import Classification.*
import java.lang.RuntimeException

enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    if (naturalNumber <= 0) throw RuntimeException()
    val sumOfFactors = (1 until naturalNumber).filter { naturalNumber % it == 0 }.sum()
    return when {
        sumOfFactors ==  naturalNumber -> PERFECT
        sumOfFactors > naturalNumber -> ABUNDANT
        else -> DEFICIENT
    }
}
