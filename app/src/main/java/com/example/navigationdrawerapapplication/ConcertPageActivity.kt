


package com.example.navigationdrawerapapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class ConcertPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concert_page2)
        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)



        val currentConcert = intent.getSerializableExtra("EXTRA_USER") as? Concert
        if (currentConcert != null) {
            this.setTitle(currentConcert.place)
            var image = findViewById<ImageView>(R.id.image)
            image.setImageResource(currentConcert.image)




            var textPlace = findViewById<TextView>(R.id.textPlace)
            textPlace.text = currentConcert.place

            var textSmall = findViewById<TextView>(R.id.textSmall)
            textSmall.text = currentConcert.date + ", " + currentConcert.address


            var textDescription = findViewById<TextView>(R.id.textDescription)
            textDescription.text = currentConcert.description




        }else{

        }





        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, R.string.waiting_information_web, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
                val url = "https://www.ticketmaster.com/discover/concerts"
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
        }


        findViewById<FloatingActionButton>(R.id.map).setOnClickListener { view ->
            Snackbar.make(view, R.string.waiting_information_web, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            val intent = Intent(this, MapsActivity::class.java).apply {
                putExtra("EXTRA_USER", currentConcert)
            }
            startActivity(intent)

        }



    }
}