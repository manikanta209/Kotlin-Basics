package com.md.kotlinbasicapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.md.kotlinbasicapp.R
import com.md.kotlinbasicapp.extensions.showToast
import kotlinx.android.synthetic.main.activity_main.*

//Note: Safe call:    ?.
//      Safe call with let:    ?.let {  }
//These operators are used to prevent the null pointer exception


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick.setOnClickListener {
            var userName:String = editText.text.toString();

            //Toast message : Removed Boilerplate code
            // Context is the super class of the activity
            showToast(userName)


        }

        btnShare.setOnClickListener {
            var userName:String = editText.text.toString();
            val intent = Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, userName)
            intent.type="text/plain"

            startActivity(Intent.createChooser(intent,"Share to : "))
        }

        btnRecycle.setOnClickListener {
            val intent=Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

    }
}