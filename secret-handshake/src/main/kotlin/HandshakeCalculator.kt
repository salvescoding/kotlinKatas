import Signal.*

class HandshakeCalculator {

    companion object {
        fun calculateHandshake(input: Int) : List<Signal> {
            val secretHandshake = mutableListOf<Signal>()
            when(Integer.toBinaryString(input).toInt()) {
              1     -> secretHandshake.add(WINK)
              10    -> secretHandshake.add(DOUBLE_BLINK)
              100   -> secretHandshake.add(CLOSE_YOUR_EYES)
              1000  -> secretHandshake.add(JUMP)
            }
            return secretHandshake
        }
    }
}
