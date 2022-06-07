package and02.kapitel3.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var secondActivity: AppCompatActivity
    private lateinit var textView: TextView
    private lateinit var btnNext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        secondActivity = SecondActivity()

        textView = findViewById<TextView>(R.id.txt_mainActivity)
        btnNext = findViewById<Button>(R.id.btn_mainActivity)

        textView.append("MainActivity --\"onCreate\" durchlaufen\n")
    }

    override fun onStart() {
        val intent = Intent(this,secondActivity::class.java)

        super.onStart()
        btnNext.setOnClickListener {
            textView.append("MainActivity-Button \"Zweite Activity\" geklickt!\n")
            startActivity(intent)
        }
    }
}
