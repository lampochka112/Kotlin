class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greeting = Greeting().greet()
        findViewById<TextView>(R.id.text_view).text = greeting
    }
}