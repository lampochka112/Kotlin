/**
 * 🚀 Простой To-Do List на Kotlin
 * - Добавление/удаление задач
 * - Отметка выполненных
 * - Фильтрация задач
 */

data class Task(
    val id: Int,
    var title: String,
    var isCompleted: Boolean = false
)

class TodoList {
    private val tasks = mutableListOf<Task>()
    private var nextId = 1

    // Добавить задачу
    fun addTask(title: String): Task {
        val task = Task(nextId++, title)
        tasks.add(task)
        return task
    }

    // Удалить задачу
    fun removeTask(id: Int): Boolean {
        return tasks.removeIf { it.id == id }
    }

    // Отметить как выполненную
    fun completeTask(id: Int): Boolean {
        val task = tasks.find { it.id == id }
        task?.isCompleted = true
        return task != null
    }

    // Получить все задачи
    fun getAllTasks(): List<Task> = tasks.toList()

    // Получить активные задачи
    fun getActiveTasks(): List<Task> = tasks.filter { !it.isCompleted }

    // Поиск по названию
    fun searchTasks(query: String): List<Task> {
        return tasks.filter { it.title.contains(query, ignoreCase = true) }
    }
}