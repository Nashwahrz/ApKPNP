package com.nashwa.apkpnp

import GalleryAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nashwa.apkpnp.Model.ImageModel


class galery : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galery)


            // Daftar gambar beserta judulnya
            val images = listOf(
                ImageModel(R.drawable.mi2, "Gambar 1"),
                ImageModel(R.drawable.logo, "Gambar 2"),
                ImageModel(R.drawable.rpl, "Gambar 3"),
                ImageModel(R.drawable.tekom, "Gambar 4"),
                ImageModel(R.drawable.ti, "Gambar 5"),
                ImageModel(R.drawable.hima, "Gambar 6")
            )

            // Inisialisasi RecyclerView
            val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
            recyclerView.layoutManager = GridLayoutManager(this, 2) // Grid 2 kolom
            recyclerView.adapter = GalleryAdapter(images)
        }



    }
