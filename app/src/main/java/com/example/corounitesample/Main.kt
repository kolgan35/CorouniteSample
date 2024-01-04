package com.example.corounitesample

import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.filterIsInstance
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.Locale
import kotlin.math.roundToInt

val customCoroutineScope = CoroutineScope(Dispatchers.Default)
fun main()  {


    println("START MAIN")


    println("MAIN FUN")
/*
    val values = listOf("А", "Б", "1", "2", "В", "3", "Г", "Д", "4", "5")

    val sortedValues = values.sortedWith(Comparator { a, b ->
        when {
            a.matches(Regex("[a-zA-Z]")) && b.matches(Regex("[0-9]")) -> -1 // буквенное значение идет перед числовым
            a.matches(Regex("[0-9]")) && b.matches(Regex("[a-zA-Z]")) -> 1 // числовое значение идет после буквенного
            else -> a.compareTo(b) // сортировка по умолчанию
        }
    })

    println(sortedValues)
*/

//    val strings = listOf("Привет", "Hello", "Мир", "World", "1", "2")
//
//    val sortedStrings = strings.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER) { it.toLowerCase(Locale.getDefault()) })
//    println(sortedStrings)
    customCoroutineScope.launch {
        (2..10).map {
            println("START $it")
            delay(100)
            getBasket()
            println("END $it")
        }
    }
    runBlocking { delay(2000) }
}

fun getBasket() = customCoroutineScope.launch {
        println("START GETBASKET")
        //delay(100)
        getPurchases()
        println("END GETBASKET")
}

suspend fun getPurchases() {
//    withContext(Dispatchers.IO) {
        println("START GETPURCHASES")
        (0..1).map {
            delay(50)
            println("PURCHASE $it")
            //getPurchasePrice(it.toString())
        }
        println("END GETPURCHASES")
//    }
}

suspend fun getPurchasePrice(i: String) {
    println("START GETPURCHASEPRICE $i")
    savePurchase(i)
    println("END GETPURCHASEPRICE $i")
}

suspend fun savePurchase(i: String) {
    customCoroutineScope.launch(Dispatchers.IO) {
        println("START SAVEPURCHASE $i")
        delay(50)
        println("END SAVEPURCHASE $i")
    }
}
suspend fun coroutine() {
    customCoroutineScope.launch {
        println("start coroutine")
        suspendFuncWithDelay()
        println("end coroutine")
    }
}

suspend fun suspendFuncWithDelay() {
    println("start suspendFuncWithDelay")
    delay(100)
    println("end suspendFuncWithDelay")
}


private fun deviationVirtualTemperature(temperature: Double): Double {
    val map = mapOf(0..4 to 0.5, 5..9 to  0.5, 10..14 to 1.0, 15..24 to 1.0, 25..29 to 2.0, 30..39 to 3.5,)
    val interval = map.entries.find { temperature.roundToInt() in it.key }?.key
    val popravka =  when (interval) {
        0..4,  10..14 -> map[interval]!!
        5..9, 15..24, 30..39,  -> map[interval]!! + (temperature.roundToInt() - interval.first)*0.1
        25..29 -> map[interval]!! + (temperature.roundToInt() - interval.first)*0.3
        40..100 -> 4.5
        else -> 0.0
    }
    return temperature + popravka - 15.9
}