private const val PLAIN = "abcdefghijklmnopqrstuvwxyz"
private const val CIPHER = "zyxwvutsrqponmlkjihgfedcba"

object Atbash {
    fun encode(input: String): String =
         input.split("")
                 .filter { it.isNotEmpty() }
                 .map { it.toLowerCase() }
                 .map { PLAIN.indexOf(it) }
                 .map { CIPHER.get(it).toString() }
                 .joinToString("")


    fun decode(input: String): String {
        return "A"
    }

}
