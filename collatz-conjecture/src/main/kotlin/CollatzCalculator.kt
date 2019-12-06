import java.lang.IllegalArgumentException

class CollatzCalculator {

    companion object {

        fun computeStepCount(input: Int, counter: Int = 0): Int {
            require(input > 0) {"Only natural numbers are allowed" }
            if (input == 1) return counter
            var newCounter = counter
            return if (input.rem(2)  == 0) {
                newCounter++
                computeStepCount(input / 2, newCounter)
            } else {
                newCounter++
                computeStepCount(input * 3 + 1, newCounter)
            }
        }

    }


}
