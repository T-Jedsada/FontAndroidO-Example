package pondthaitay.fontandroid_example

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val typeface = resources.getFont(R.font.kanit_bold)
        ((findViewById(R.id.tv_test)) as TextView).typeface = typeface
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.tv_test) startActivity(Intent(this, SecondActivity::class.java))
    }
}