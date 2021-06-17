package com.example.navigationdrawerapapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class AuthorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_author)
        setSupportActionBar(findViewById(R.id.toolbar))

        this.setTitle(R.string.show_contact_author)


        val topicTMP = findViewById<EditText>(R.id.textTopic)
        val messageTMP = findViewById<EditText>(R.id.textTextArea)


        val button = findViewById<Button>(R.id.outlinedButton)

        button.setOnClickListener {

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto: kontakt@autor.com")
            intent.putExtra(Intent.EXTRA_EMAIL, messageTMP.text)
            intent.putExtra(Intent.EXTRA_SUBJECT, topicTMP.text)

            startActivity(intent)

        }

        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }
}