package uk.co.gsdweather.plugin

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Locale

object ClockFormat {
    private val formatter = DateTimeFormatter.ofPattern("HH:mm", Locale.UK)
    fun format(time: LocalTime): String = time.format(formatter)
}
