package com.example.navigationdrawerapapplication

import android.content.Intent
import android.content.res.Configuration
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    private lateinit var mp: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle(R.string.header_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)


        mp = MediaPlayer.create(this, R.raw.last_music)
        mp.isLooping = true
        mp.setVolume(1.0f,1.0f)

        val playLastMusic = findViewById<Button>(R.id.play_last_music)
        playLastMusic.setOnClickListener(){
            if(mp.isPlaying){
                mp.pause()
                playLastMusic.setText(R.string.play)
            }else{
                mp.start()
                playLastMusic.setText(R.string.pause)
            }
        }




    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.nav_portfolio -> {
                val intent = Intent(this, PortfolioActivity::class.java).apply {

                }
                startActivity(intent)
                //Toast.makeText(this, "Concert clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_concert -> {
                val intent = Intent(this, ConcertActivity::class.java).apply {

                }
                startActivity(intent)
                //Toast.makeText(this, "Concert clicked", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_shop -> {
                val intent = Intent(this, ShopActivity::class.java).apply {

                }
                startActivity(intent)
                //Toast.makeText(this, "Concert clicked", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_author -> {
                val intent = Intent(this, AuthorActivity::class.java).apply {

                }
                startActivity(intent)
                //Toast.makeText(this, "Concert clicked", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_rules -> {
                val intent = Intent(this, RulesActivity::class.java).apply {}
                //val intent = Intent(this, MapsActivity::class.java).apply {}
                startActivity(intent)
                //Toast.makeText(this, "Concert clicked", Toast.LENGTH_SHORT).show()
            }


            R.id.nav_gallery -> {
                val intent = Intent(this, GalleryActivity::class.java).apply {}
                //val intent = Intent(this, MapsActivity::class.java).apply {}
                startActivity(intent)
                //Toast.makeText(this, "Concert clicked", Toast.LENGTH_SHORT).show()
            }



        }





        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
