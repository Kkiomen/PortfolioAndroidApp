package com.example.navigationdrawerapapplication

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class GalleryViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_view)
        setSupportActionBar(findViewById(R.id.toolbar))
        this.setTitle("Galeria")

        var modalItems: Modal = intent.getSerializableExtra("data") as Modal;

        var viewImage: ImageView = findViewById(R.id.viewImage)
        viewImage.setImageResource(modalItems.image!!);
    }
}