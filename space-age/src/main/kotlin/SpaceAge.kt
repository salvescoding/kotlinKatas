import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.round
import kotlin.math.roundToLong

class SpaceAge(private val ageInSeconds: Long) {
     private val oneYearInSecondsOnEarth = 31557600

    fun onEarth(): Double = round(ageInSeconds / oneYearInSecondsOnEarth.toDouble() * 100) / 100

    fun onMercury(): Double  = round(ageInSeconds / (oneYearInSecondsOnEarth * 0.2408467) * 100) / 100

    fun onVenus(): Double = round (ageInSeconds / (oneYearInSecondsOnEarth * 0.61519726) * 100) / 100

    fun onMars(): Double = round(ageInSeconds / (oneYearInSecondsOnEarth * 1.8808158) * 100) / 100

    fun onJupiter(): Double = round(ageInSeconds / (oneYearInSecondsOnEarth * 11.862615) * 100) / 100

    fun onSaturn(): Double = round(ageInSeconds / (oneYearInSecondsOnEarth *  29.447498) * 100) / 100

    fun onUranus(): Double = round(ageInSeconds / (oneYearInSecondsOnEarth * 84.016846) * 100) / 100

    fun onNeptune(): Double = round(ageInSeconds / (oneYearInSecondsOnEarth * 164.79132) * 100) / 100


}
