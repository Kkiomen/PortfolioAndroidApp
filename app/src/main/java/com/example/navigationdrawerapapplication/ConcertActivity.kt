package com.example.navigationdrawerapapplication

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class ConcertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concert)
        this.setTitle(R.string.concerts)


        var listView = findViewById<ListView>(R.id.concertList)

        val concertLIST = ArrayList<Concert>()
        concertLIST.add(
                Concert("Miami Beach, FL, United States", "LIV Nightclub @ 11:00pm", "29.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_1,25.8102247,-80.210182)
        )
        concertLIST.add(
                Concert("Tampa, FL, United States", "WTR POOL @ 11:00pm", "30.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_2,27.9737682,-82.5440776)
        )
        concertLIST.add(
                Concert("Orlando, FL, United States", "The Vanguard @ 11:00pm", "01.05.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_3, 28.4810971, -81.5089245)
        )
        concertLIST.add(
                Concert("Milwaukee, FL, United States", "LIV Nightclub @ 11:00pm", "01.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_1, 43.057806, -88.1075142)
        )
        concertLIST.add(
                Concert("Baltimore, FL, United States", "WTR POOL @ 11:00pm", "02.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_2, 39.2846854, -76.6905369)
        )
        concertLIST.add(
                Concert("Albuquerque, FL, United States", "The Vanguard @ 11:00pm", "06.05.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_3, 35.0823294, -106.8165647)
        )
        concertLIST.add(
                Concert("Anchorage, FL, United States", "LIV Nightclub @ 11:00pm", "10.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_1, 61.1077052, -150.0006924)
        )
        concertLIST.add(
                Concert("Norfolk, FL, United States", "WTR POOL @ 11:00pm", "10.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_2, 28.5828308,-81.3679025)
        )
        concertLIST.add(
                Concert("Wichita, FL, United States", "The Vanguard @ 11:00pm", "20.05.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_3, 37.6645261, -97.5837784)
        )
        concertLIST.add(
                Concert("Modesto, FL, United States", "LIV Nightclub @ 11:00pm", "21.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_1, 37.5952611, -121.1477185)
                )
        concertLIST.add(
                Concert("Omaha, FL, United States", "WTR POOL @ 11:00pm", "23.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_2, 41.291774, -96.221333)
        )
        concertLIST.add(
                Concert("New York, FL, United States", "The Vanguard @ 11:00pm", "23.05.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_3, 40.6971494, -74.2598675)
        )
        concertLIST.add(
                Concert("Henderson, FL, United States", "LIV Nightclub @ 11:00pm", "24.04.2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed leo nisl, eleifend non urna ac, blandit varius quam. Pellentesque laoreet bibendum odio, vehicula vehicula ipsum faucibus eget. Phasellus rhoncus eros elit, at faucibus est tempus sit amet. Fusce metus tellus, pretium a sapien quis, pulvinar ultricies lorem. Integer consequat at leo at mollis. Nulla convallis scelerisque elit, nec condimentum lorem. Etiam sit amet fringilla elit. Sed ipsum lorem, sollicitudin a augue vel, ultricies pellentesque dolor. Mauris in porttitor ante.", R.drawable.concert_1, 35.3243965, -82.4900676)
        )


        concertLIST.sortByDescending { it.date }


        //TOP

        var pos1_image = findViewById<ImageView>(R.id.pos_1_img)
        pos1_image.setImageResource(concertLIST[0].image)

        var pos1_name = findViewById<TextView>(R.id.pos_1_name)
        pos1_name.text = concertLIST[0].place

        var pos1_small = findViewById<TextView>(R.id.pos_1_small)
        pos1_small.text = concertLIST[0].date + ", " + concertLIST[0].address



        var pos2_image = findViewById<ImageView>(R.id.pos_2_img)
        pos2_image.setImageResource(concertLIST[1].image)

        var pos2_name = findViewById<TextView>(R.id.pos_2_name)
        pos2_name.text = concertLIST[1].place

        var pos2_small = findViewById<TextView>(R.id.pos_2_small)
        pos2_small.text = concertLIST[1].date + ", " + concertLIST[1].address

        //TOP




        val adapter = ConcertAdapter(this, concertLIST)
        listView.adapter = adapter


        val context = this
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedConcert = concertLIST[position]

            val intent = Intent(this, ConcertPageActivity::class.java).apply {
                putExtra("EXTRA_USER", selectedConcert)
            }
            startActivity(intent)
//            val detailIntent = RecipeDetailActivity.newIntent(context, selectedRecipe)
//
//            startActivity(detailIntent)
        }


        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)


        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val Element1 = findViewById<HorizontalScrollView>(R.id.horizo1)
            Element1.visibility = View.GONE
            val Element2 = findViewById<TextView>(R.id.textView9)
            Element2.visibility = View.GONE
        }




    }
}