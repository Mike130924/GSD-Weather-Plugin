package uk.co.gsdweather.plugin

import java.time.LocalDate

data class DailyForecast(
    val date: LocalDate,
    val weatherCode: Int,
    val temperatureMax: Double,
    val temperatureMin: Double,
    val precipitationProbabilityMax: Int?
)

data class WeatherSnapshot(
    val locationName: String,
    val currentTemperature: Double?,
    val currentWeatherCode: Int?,
    val fetchedAtEpochMillis: Long,
    val daily: List<DailyForecast>
) {
    init {
        require(daily.size <= 7) { "A forecast may contain at most seven days." }
    }
}
