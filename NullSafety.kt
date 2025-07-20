/**
 * 🛡️ Null Safety в Kotlin
 * Демонстрация работы с nullable-типами
 */

fun main() {
    val name: String? = null  // Nullable-переменная

    // 1. Безопасный вызов (safe call)
    println("Длина имени: ${name?.length}")  // null (без ошибки)

    // 2. Elvis-оператор (значение по умолчанию)
    val length = name?.length ?: 0
    println("Длина: $length")  // 0

    // 3. Явное исключение при null
    val notNullName = name ?: throw IllegalArgumentException("Name is null!")
}