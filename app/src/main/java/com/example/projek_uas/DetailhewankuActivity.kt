package com.example.projek_uas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailhewankuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hewanku)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val hewanku = intent.getParcelableExtra<hewanku>(MainActivity.INTENT_PARCELABLE)

        val imghewanku = findViewById<ImageView>(R.id.img_item_photo)
        val namehewanku = findViewById<TextView>(R.id.tv_item_name)
        val deschewanku = findViewById<TextView>(R.id.tv_item_description)
        val desc2hewanku = findViewById<TextView>(R.id.tv_item_description2)

        imghewanku.setImageResource(hewanku?.imghewanku!!)
        namehewanku.text = hewanku.namehewanku
        deschewanku.text = hewanku.deschewanku
        desc2hewanku.text = hewanku.desc2hewanku
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}