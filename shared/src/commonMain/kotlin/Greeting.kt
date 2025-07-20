/**
 * 🌐 Общий код для всех платформ
 * Генерирует приветствие с текущей датой
 */
expect class Platform() {
    val name: String
}

class Greeting {
    private val platform = Platform()

    fun greet(): String {
        return "Hello from ${platform.name}!\nToday is ${currentDate()}"
    }

    private fun currentDate(): String {
        val now = kotlinx.datetime.Clock.System.now()
        return now.toString().take(10) // Формат: YYYY-MM-DD
    }
}