package com.example.navigationdrawerapapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class ShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)
        setSupportActionBar(findViewById(R.id.toolbar))
        this.setTitle(R.string.show_shop)


        // PRODUCT 1



        val product1 = findViewById<Button>(R.id.product1)
        product1.setOnClickListener(){
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://shop.martingarrix.com/products/tshirt-black-white-logo")
            startActivity(openURL)
        }

        val product2 = findViewById<Button>(R.id.product2)
        product2.setOnClickListener(){
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://shop.martingarrix.com/products/longsleeve-black-white-logo")
            startActivity(openURL)
        }

        val product3 = findViewById<Button>(R.id.product3)
        product3.setOnClickListener(){
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://shop.martingarrix.com/products/short-sleeve-t-shirt-black-front-seam")
            startActivity(openURL)
        }

        val product4 = findViewById<Button>(R.id.product4)
        product4.setOnClickListener(){
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://shop.martingarrix.com/products/hoodie-black-white-logo")
            startActivity(openURL)
        }



        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)


    }


}