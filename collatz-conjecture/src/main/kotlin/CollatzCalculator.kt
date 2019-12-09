class CollatzCalculator {

    companion object {

        fun computeStepCount(input: Int): Int {
            require(input > 0) {"Only natural numbers are allowed" }
            fun computeStepCount(input: Int, counter: Int) : Int {
                if (input == 1) return counter
                return if (input.rem(2)  == 0)
                    computeStepCount(input / 2, counter + 1)
                else
                    computeStepCount(input * 3 + 1, counter + 1)
            }
            return computeStepCount(input, 0)
        }

    }


}
