/**
 * ⚡ Корутины для асинхронности
 * Запуск параллельных задач
 */

import kotlinx.coroutines.*

suspend fun fetchData(): String {
    delay(1000L)  // Имитация загрузки
    return "Данные загружены"
}

fun main() = runBlocking {
    println("Старт")

    // Запуск корутины
    val job = launch {
        val result = fetchData()
        println(result)
    }

    println("Ожидание...")
    job.join()  // Дождаться завершения
    println("Готово")
}