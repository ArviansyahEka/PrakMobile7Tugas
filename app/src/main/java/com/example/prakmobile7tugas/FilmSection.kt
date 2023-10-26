package com.example.prakmobile7tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobile7tugas.databinding.ActivityFilmSectionBinding

class FilmSection : AppCompatActivity() {
    private lateinit var binding: ActivityFilmSectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmSectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            endgame.setOnClickListener {
                val intent = Intent(this@FilmSection, DetailsAvenger::class.java)
                startActivity(intent)
            }
            granturismo.setOnClickListener {
                val intent = Intent(this@FilmSection, DetailsGranturismo::class.java)
                startActivity(intent)
            }
            missionimpossible.setOnClickListener {
                val intent = Intent(this@FilmSection, DetailsMissionimposible::class.java)
                startActivity(intent)
            }
            spectre.setOnClickListener {
                    val intent = Intent(this@FilmSection, DetailsSpectre::class.java)
                startActivity(intent)
            }
        }
    }
}