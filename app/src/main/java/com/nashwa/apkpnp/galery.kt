package com.nashwa.apkpnp


import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nashwa.apkpnp.adapter.GalleryAdapter
import com.nashwa.apkpnp.Model.ImageModel
import com.nashwa.apkpnp.R
import com.nashwa.apkpnp.photodeatil

class galery : AppCompatActivity() {
    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.mi2,
        R.drawable.logo,
        R.drawable.ti,
        R.drawable.hima,
        R.drawable.rpl,
        R.drawable.tekom
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, imageList)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, photodeatil::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}
