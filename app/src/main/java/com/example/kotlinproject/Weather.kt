package com.example.kotlinproject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0
) : Parcelable

fun getDefaultCity() = City(cityName = "Хабаровск", lat = 48.4827, lon = 135.084)

fun getRussianCities() = listOf(
        Weather(City("Москва", 55.755826, 37.617299900000035), 1, 1),
        Weather(City("Санкт-Петербург", 59.9342802, 30.335098600000038), 2, 2),
        Weather(City("Новосибирск", 55.00835259999999, 82.93573270000002), 3, 3),
        Weather(City("Екатеринбург", 56.83892609999999, 60.60570250000001), 4, 4),
        Weather(City("Нижний Новгород", 56.2965039, 43.936059), 5, 5),
        Weather(City("Казань", 55.8304307, 49.06608060000008), 6, 6),
        Weather(City("Челябинск", 55.1644419, 61.4368432), 7, 7),
        Weather(City("Омск", 54.9884804, 73.32423610000001), 8, 8),
        Weather(City("Ростов-на-Дону", 47.2357137, 39.701505), 9, 9),
        Weather(City("Хабаровск", 48.4827, 135.084), 10, 10)
    )

fun getWorldCities() = listOf(
        Weather(City("Лондон", 51.5085300, -0.1257400), 11, 1),
        Weather(City("Токио", 35.6895000, 139.6917100), 12, 2),
        Weather(City("Париж", 48.8534100, 2.3488000), 13, 3),
        Weather(City("Берлин", 52.52000659999999, 13.404953999999975), 14, 4),
        Weather(City("Рим", 41.9027835, 12.496365500000024), 15, 5),
        Weather(City("Минск", 53.90453979999999, 27.561524400000053), 16, 6),
        Weather(City("Стамбул", 41.0082376, 28.97835889999999), 17, 7),
        Weather(City("Вашингтон", 38.9071923, -77.03687070000001), 18, 8),
        Weather(City("Киев", 50.4501, 30.523400000000038), 19, 9),
        Weather(City("Пекин", 39.90419989999999, 116.40739630000007), 20, 10)
    )
