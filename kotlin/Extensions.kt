/**
 * 🧩 Расширения для красивого вывода задач
 */

fun TodoList.printAllTasks() {
    println("\n📋 Все задачи:")
    getAllTasks().forEach { task ->
        val status = if (task.isCompleted) "✅" else "🟡"
        println("$status [${task.id}] ${task.title}")
    }
}

fun TodoList.printActiveTasks() {
    println("\n🔴 Активные задачи:")
    getActiveTasks().forEach { task ->
        println("[${task.id}] ${task.title}")
    }
}