package com.example.prakmobile7tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobile7tugas.databinding.ActivityDetailsAvengerBinding

class DetailsAvenger : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsAvengerBinding

    companion object {
        const val judulkur = "judulkur"
        const val genrekur = "genrekur"
        const val gambarkur = "gambarkur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsAvengerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            backbutton.setOnClickListener {
                val intent = Intent(this@DetailsAvenger, FilmSection::class.java)
                startActivity(intent)
            }

            beli.setOnClickListener {
                val juduldetail = judul.text.toString()
                val genredetail = genre.text.toString()
                val intent = Intent(this@DetailsAvenger, Checkout::class.java)
                intent.putExtra(judulkur, juduldetail)
                intent.putExtra(genrekur, genredetail)
                intent.putExtra(gambarkur, R.drawable.endgame)
                startActivity(intent)
            }
        }
    }
}