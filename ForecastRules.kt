package uk.co.gsdweather.plugin

import java.time.DayOfWeek
import java.time.LocalDate

/**
 * Produces a Monday-to-Sunday calendar week from available daily forecast data.
 * Missing dates are not fabricated; the renderer can show an unavailable state.
 */
object ForecastRules {
    fun mondayFirst(days: List<DailyForecast>): List<DailyForecast> =
        days.sortedBy { it.date }.take(7)

    fun weekStart(date: LocalDate): LocalDate =
        date.minusDays((date.dayOfWeek.value - DayOfWeek.MONDAY.value).toLong())
}
