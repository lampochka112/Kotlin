/**
 * 📌 Kotlin Basics: Основы синтаксиса и переменные
 * 
 * Этот файл содержит базовые конструкции языка Kotlin.
 * Запустите функцию main(), чтобы увидеть примеры работы.
 */

fun main() {
    // 1. Переменные и типы данных
    variablesDemo()

    // 2. Условные операторы
    conditionsDemo()

    // 3. Циклы
    loopsDemo()

    // 4. Функции
    functionsDemo()

    // 5. Работа со строками
    stringsDemo()
}

// ========================
// 1. Переменные и типы данных
// ========================
fun variablesDemo() {
    println("=== Переменные и типы данных ===")

    // Неизменяемая переменная (аналог final в Java)
    val name: String = "Alice"
    // name = "Bob"  // Ошибка: val нельзя изменить

    // Изменяемая переменная
    var age: Int = 25
    age = 26  // OK

    // Автоматическое определение типа
    val isStudent = true  // Boolean
    val height = 1.75     // Double

    // Числовые типы
    val byte: Byte = 127
    val longNumber = 100L  // Long

    println("""
        name: $name
        age: $age
        isStudent: $isStudent
        height: $height
        byte: $byte
        longNumber: $longNumber
    """.trimIndent())
}

// ========================
// 2. Условные операторы
// ========================
fun conditionsDemo() {
    println("\n=== Условные операторы ===")

    val x = 10

    // Классический if-else
    if (x > 5) {
        println("x больше 5")
    } else {
        println("x меньше или равно 5")
    }

    // Kotlin-стиль (if как выражение)
    val result = if (x % 2 == 0) "чётное" else "нечётное"
    println("x — $result число")

    // When (аналог switch)
    when (x) {
        10 -> println("Это десять")
        in 1..9 -> println("Между 1 и 9")
        else -> println("Другое число")
    }
}

// ========================
// 3. Циклы
// ========================
fun loopsDemo() {
    println("\n=== Циклы ===")

    // Цикл for
    println("Цикл for:")
    for (i in 1..5) {
        print("$i ")  // 1 2 3 4 5
    }
    println()

    // Цикл while
    println("Цикл while:")
    var j = 3
    while (j > 0) {
        print("$j ")  // 3 2 1
        j--
    }
    println()

    // Итерация по списку
    val fruits = listOf("Apple", "Banana", "Orange")
    println("Фрукты:")
    for (fruit in fruits) {
        print("$fruit ")  // Apple Banana Orange
    }
    println()
}

// ========================
// 4. Функции
// ========================
fun functionsDemo() {
    println("\n=== Функции ===")

    // Функция с возвращаемым значением
    fun square(x: Int): Int {
        return x * x
    }
    println("Квадрат 5: ${square(5)}")  // 25

    // Однострочная функция
    fun isEven(num: Int) = num % 2 == 0
    println("Чётное число 4? ${isEven(4)}")  // true

    // Функция с аргументами по умолчанию
    fun greet(name: String = "Guest") = "Hello, $name!"
    println(greet())      // Hello, Guest!
    println(greet("Bob")) // Hello, Bob!
}

// ========================
// 5. Работа со строками
// ========================
fun stringsDemo() {
    println("\n=== Строки ===")

    val str = "Kotlin"

    // Шаблонные строки
    println("Длина '$str': ${str.length}")  // Длина 'Kotlin': 6

    // Многострочный текст
    val multiline = """
        Это
        многострочная
        строка
    """.trimIndent()
    println(multiline)
}