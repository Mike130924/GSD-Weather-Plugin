# GSD Weather Plugin

A fresh Android / Projectivy weather wallpaper project with a Christmas German Shepherd theme.

## Project direction

- Android-native Projectivy wallpaper-provider service
- Open-Meteo weather data and local caching
- Theme rendering layer designed for a Christmas German Shepherd presentation
- Monday–Sunday seven-day forecast
- 24-hour clock
- Android TV / D-pad-friendly settings

## Status

This is the **starter source package** for the new repository. It is not an APK and has not yet been built or tested on an Android TV device. The Android application module and Projectivy integration are intentionally scaffolded first; implementation and verification follow in subsequent commits.

## Initial setup

Open this folder as an Android Studio project. The project uses Gradle Kotlin DSL and targets a modern Android SDK. See `docs/IMPLEMENTATION_PLAN.md` for the implementation sequence.

## Data source

Weather provider: [Open-Meteo](https://open-meteo.com/). Review its terms and attribution requirements before distribution.

## Upstream foundations

The implementation is intended to follow the Projectivy wallpaper-provider approach documented in:
- https://github.com/shortusername/projectivy-weather-wallpaper

The Live Weather project is used as a reference for theme customisation concepts only:
- https://github.com/mmlTools/live-weather

No OBS-specific native code is included.
