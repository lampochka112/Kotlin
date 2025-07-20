
# 🚀 Kotlin — современный язык для разработки под любые платформы

[![Kotlin Version](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg?logo=kotlin)](https://kotlinlang.org)
[![License](https://img.shields.io/badge/License-Apache%202.0-green.svg)](https://opensource.org/licenses/Apache-2.0)

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Kotlin-logo.svg/1200px-Kotlin-logo.svg.png" width="200" alt="Kotlin Logo">

**Kotlin** — это статически типизированный язык, который работает на JVM, в браузере и даже в iOS (через Kotlin Multiplatform). Он сочетает лаконичность, безопасность и мощь.

## 🌟 Почему Kotlin?

✔ **Короткий код** — на 40% меньше шаблонного кода, чем в Java  
✔ **Null-безопасность** — компилятор ловит `NullPointerException`  
✔ **Функциональный** — лямбды, extension-функции, корутины  
✔ **Официальный для Android** — рекомендован Google  
✔ **Кроссплатформенность** — один код для Android, iOS, backend и web  

```kotlin
// Пример: data class vs Java-аналог
data class User(val name: String, val age: Int) // Kotlin
/* Эквивалент в Java:
public class User {
    private String name;
    private int age;
    // + геттеры/сеттеры + equals + hashCode + toString...
}
*/

🛠 Что в этом репозитории?
Этот проект демонстрирует ключевые возможности Kotlin:

To-Do List — пример ООП-кода с:

Data-классами (Task)

Расширениями (printAllTasks())

Работой с коллекциями (filter, forEach)

Примеры базового синтаксиса:

Переменные (val/var)

Функции (включая single-expression)

Условные операторы и циклы

📦 Как запустить?
Способ 1: Откройте проект в IntelliJ IDEA

Способ 2: Используйте Kotlin Playground (для отдельных примеров) "https://play.kotlinlang.org/"

Способ 3: Через командную строку:

kotlinc Main.kt -include-runtime -d main.jar
java -jar main.jar

📚 Ресурсы для изучения
Официальная документация — лучший старт "https://kotlinlang.org/docs/home.html"

Kotlin Koans — интерактивные упражнения "https://play.kotlinlang.org/koans/overview"

Android + Kotlin — для мобильных разработчиков "https://developer.android.com/kotlin"