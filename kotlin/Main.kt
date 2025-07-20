/**
 * 🏆 Точка входа в программу
 */

fun main() {
    val todoList = TodoList()

    // Добавляем задачи
    todoList.addTask("Изучить Kotlin")
    todoList.addTask("Написать To-Do List")
    todoList.addTask("Запушить на GitHub")

    // Отмечаем одну как выполненную
    todoList.completeTask(2)

    // Выводим все задачи
    todoList.printAllTasks()

    // Выводим активные
    todoList.printActiveTasks()

    // Поиск
    println("\n🔍 Результаты поиска 'kotlin':")
    todoList.searchTasks("kotlin").forEach { println(it.title) }
}