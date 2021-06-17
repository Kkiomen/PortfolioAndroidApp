package com.example.navigationdrawerapapplication

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.pdfview.PDFView

class RulesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)
        setSupportActionBar(findViewById(R.id.toolbar))
        this.setTitle("Regulamin i polityka")

        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)


        findViewById<PDFView>(R.id.rulesPDFVIEW).fromAsset("rules.pdf").show()


    }
}