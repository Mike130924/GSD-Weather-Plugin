# Implementation plan

1. Import and adapt the Projectivy wallpaper-provider service contract.
2. Implement Open-Meteo requests, parsing, refresh policy and persistent cache.
3. Ensure the forecast contains seven real calendar days and is rendered Monday first.
4. Add a theme renderer for the Christmas German Shepherd layout.
5. Add settings for location, units, refresh interval, theme colours and layout.
6. Implement Android TV D-pad focus and explicit keyboard activation.
7. Add tests for parsing, seven-day ordering, cache behaviour and settings.
8. Build, inspect the APK, and verify on Projectivy / Android TV.

## Important constraints

- The displayed clock must use `HH:mm`.
- Do not invent forecast entries when the provider returns fewer days.
- D-pad focus alone must never show the soft keyboard.
- Keep weather fetching in the Android layer; the theme receives prepared data.
- Preserve Projectivy wallpaper-provider compatibility when integrating the service.
