package lv.zabarovski.m.rtu_sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var clicks = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainCounter.text = "$clicks"
        mainCountButton.setOnClickListener {
            Toast.makeText(this, "Added one click", Toast.LENGTH_LONG).show()
            clicks = clicks + 1
            mainCounter.text = "$clicks"
        }
    }
}