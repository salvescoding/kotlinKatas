import java.time.LocalDate
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit


data class Gigasecond(val momentInTime: LocalDateTime) {
        constructor(momentInDate: LocalDate) : this(momentInDate.atStartOfDay())

    val date: LocalDateTime = momentInTime.plusSeconds(Math.pow(10.0, 9.0) .toLong())
}
