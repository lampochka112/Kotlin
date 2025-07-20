/**
 * 🏗️ Создание DSL (Domain-Specific Language)
 * Пример для построения HTML-строк
 */

class HtmlBuilder {
    private val children = mutableListOf<String>()

    fun div(block: DivBuilder.() -> Unit) {
        val builder = DivBuilder()
        builder.block()
        children.add("<div>${builder.content}</div>")
    }

    override fun toString(): String = children.joinToString("\n")
}

class DivBuilder {
    var content = ""

    fun p(text: String) {
        content += "<p>$text</p>"
    }
}

fun html(block: HtmlBuilder.() -> Unit): String {
    val builder = HtmlBuilder()
    builder.block()
    return builder.toString()
}

fun main() {
    val htmlString = html {
        div {
            p("Привет, мир!")
            p("Это DSL на Kotlin")
        }
    }
    println(htmlString)
}