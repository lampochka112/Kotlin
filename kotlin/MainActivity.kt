/**
 * 📱 Простой пример Activity для Android
 * Использование Kotlin Android Extensions (устарело, но для примера)
 */

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Обработчик клика с лямбдой
        button.setOnClickListener {
            textView.text = "Кнопка нажата в ${System.currentTimeMillis()}"
        }
    }
}