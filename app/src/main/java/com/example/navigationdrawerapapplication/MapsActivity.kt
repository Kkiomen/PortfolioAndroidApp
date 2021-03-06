package com.example.navigationdrawerapapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    private lateinit var concert: Concert
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        val currentConcert = intent.getSerializableExtra("EXTRA_USER") as? Concert
        if (currentConcert != null) {
            this.setTitle(currentConcert.address)
            concert = currentConcert
        }else{
        }



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(concert.lang1, concert.lang2)
        mMap.addMarker(MarkerOptions().position(sydney).title(concert.place))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        mMap.setMinZoomPreference(16f)
        mMap.setMaxZoomPreference(21f)
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10f), 2000, null)
    }
}