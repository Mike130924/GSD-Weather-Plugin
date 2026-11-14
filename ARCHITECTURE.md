# Architecture

The Android application owns location, permissions, weather retrieval, caching and the Projectivy wallpaper-provider lifecycle. A normalised `WeatherSnapshot` is passed to the renderer. The theme layer is presentation-only.

The first package establishes a clean Gradle project and typed forecast model. It does not yet claim to implement the Projectivy provider service; that integration is the first development milestone.
