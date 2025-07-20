fun main() {
    document.body?.appendChild(
        h1 {
            text(Greeting().greet())
        }
    )
}