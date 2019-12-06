object ScrabbleScore {

    fun scoreWord(input: String): Int {
        return input.toLowerCase()
                    .fold(0)  {
                        acc: Int, letter: Char ->
                        when (letter) {
                            'd', 'g' -> acc + 2
                            'b', 'c', 'm', 'p' -> acc + 3
                            'f', 'h', 'v', 'w', 'y' -> acc + 4
                            'k' -> acc + 5
                            'j', 'x' -> acc +  8
                            'q', 'z' -> acc + 10
                            else -> acc + 1
                        }
                    }
    }


}
