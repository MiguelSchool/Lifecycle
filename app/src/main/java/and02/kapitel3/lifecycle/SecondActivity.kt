package and02.kapitel3.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    private lateinit var mainActivity: AppCompatActivity
    private lateinit var txtView: TextView
    private lateinit var btn_second: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mainActivity = MainActivity()

        txtView = findViewById(R.id.txt_secondActivity)
        btn_second = findViewById(R.id.btn_secondActivity)

        txtView.append("SecondActivity-\"onCreate\" durchlaufen\n")
    }

    override fun onStart() {

        super.onStart()
        btn_second.setOnClickListener {
            txtView.append("SecondActivity-Button \"Erste Activity\" geklickt!\n")
            startActivity(Intent(this, mainActivity::class.java))
        }
    }

}
