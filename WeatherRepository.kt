package uk.co.gsdweather.plugin

/**
 * Weather fetching and cache implementation will be connected here.
 * Keep network access centralised; themes consume a normalised snapshot and
 * must not make independent weather requests.
 */
interface WeatherRepository {
    suspend fun getWeather(latitude: Double, longitude: Double): WeatherSnapshot
}
