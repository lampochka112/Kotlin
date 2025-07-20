/**
 * 🧩 Работа с коллекциями
 * Фильтрация, трансформация и агрегация данных
 */

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // 1. Фильтрация
    val evenNumbers = numbers.filter { it % 2 == 0 }  // [2, 4]

    // 2. Трансформация
    val squares = numbers.map { it * it }  // [1, 4, 9, 16, 25]

    // 3. Группировка
    val grouped = numbers.groupBy { if (it % 2 == 0) "even" else "odd" }
    // {"odd": [1, 3, 5], "even": [2, 4]}

    println("""
        Чётные: $evenNumbers
        Квадраты: $squares
        Группы: $grouped
    """.trimIndent())
}