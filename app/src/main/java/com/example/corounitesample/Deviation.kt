package com.example.corounitesample

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.math.sqrt

/*
data class MeteoData(val pressure: Double, val height: Double, val temperature: Double,
                     val humidity: Double, val averageMolecularWeight: Double,
                     val windSpeed: Double, val windDirection: Double)

fun interpolateMeteoData(targetHeight: Double, data1: MeteoData, data2: MeteoData): MeteoData {
    val fraction = (targetHeight - data1.height) / (data2.height - data1.height)

    return MeteoData(
        interpolate(data1.pressure, data2.pressure, fraction),
        targetHeight,
        interpolate(data1.temperature, data2.temperature, fraction),
        interpolate(data1.humidity, data2.humidity, fraction),
        interpolate(data1.averageMolecularWeight, data2.averageMolecularWeight, fraction),
        interpolate(data1.windSpeed, data2.windSpeed, fraction),
        interpolate(data1.windDirection, data2.windDirection, fraction)
    )
}

fun interpolate(value1: Double, value2: Double, fraction: Double): Double {
    return value1 + fraction * (value2 - value1)
}

fun main() {
        val meteoDataList = listOf(
            MeteoData(1000.0, 108.0, -8.7, 74.0, 5621.0, 3.2, 0.0),
    MeteoData(975.0, 303.0, -10.7, 83.0, 5677.0, 5.2, 0.0),
    MeteoData(950.0, 502.0, -12.7, 93.0, 5700.0, 7.2, 31.0),
    MeteoData(925.0, 705.0, -13.8, 92.0, 118.0, 8.4, 33.0),
    MeteoData(900.0, 914.0, -12.6, 86.0, 288.0, 8.4, 14.0),
    MeteoData(850.0, 1353.0, -9.0, 91.0, 386.0, 5.5, 36.0),
    MeteoData(800.0, 1821.0, -9.6, 92.0, 571.0, 3.7, 45.0),
    MeteoData(700.0, 2845.0, -13.6, 76.0, 38.0, 7.5, 10.0),
    MeteoData(600.0, 4001.0, -20.5, 76.0, 5756.0, 3.6, 10.0),
    MeteoData(500.0, 5331.0, -27.8, 74.0, 3562.0, 6.6, 7.0),
    MeteoData(400.0, 6901.0, -38.5, 61.0, 3618.0, 10.0, 0.0),
    MeteoData(300.0, 8817.0, -52.5, 28.0, 3629.0, 12.8, 0.0),
    MeteoData(250.0, 9977.0, -58.0, 21.0, 3512.0, 16.4, 0.0),
    MeteoData(200.0, 11379.0, -58.5, 5.0, 3571.0, 17.6, 0.0),
    MeteoData(150.0, 13184.0, -59.0, 3.0, 3911.0, 15.9, 0.0),
    MeteoData(100.0, 15719.0, -60.8, 3.0, 4173.0, 13.5, 0.0),
    MeteoData(70.0, 17913.0, -65.0, 4.0, 4189.0, 17.8, 0.0),
    MeteoData(50.0, 19945.0, -68.4, 4.0, 4317.0, 24.0, 0.0),
    MeteoData(30.0, 23006.0, -69.8, 4.0, 4329.0, 29.0, 0.0)
    )

    val targetHeights = listOf(0.0, 200.0, 400.0, 800.0, 1200.0, 1600.0, 2000.0, 2400.0, 3000.0,
        4000.0, 5000.0, 6000.0, 8000.0, 10000.0, 12000.0, 14000.0, 18000.0, 22000.0, 26000.0, 30000.0)

    for (height in targetHeights) {
        val (data1, data2) = findClosestDataPoints(height, meteoDataList)
        val interpolatedData = interpolateMeteoData(height, data1, data2)

        println("На высоте $height м:")
        println("Давление: ${interpolatedData.pressure} гПа")
        println("Температура: ${interpolatedData.temperature} градусов Цельсия")
        println("Влажность: ${interpolatedData.humidity}%")
        println("Скорость ветра: ${interpolatedData.windSpeed} м/с")
        println("Направление ветра: ${interpolatedData.windDirection} градусов")
        println("-----------")
    }
}

fun findClosestDataPoints(targetHeight: Double, data: List<MeteoData>): Pair<MeteoData, MeteoData> {
    val sortedData = data.sortedBy { it.height }

    for (i in 0 until sortedData.size - 1) {
        val data1 = sortedData[i]
        val data2 = sortedData[i + 1]

        if (targetHeight >= data1.height && targetHeight <= data2.height) {
            return Pair(data1, data2)
        }
    }

    // Если не нашли точные данные для интерполяции, можно вернуть ближайшие
    return Pair(sortedData.last(), sortedData.first())
}*/
