package com.disebud.example_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.disebud.example_room.room.artist.Artist
import com.disebud.example_room.viewmodel.artist.ArtistViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   val artistViewModel by viewModels<ArtistViewModel>()
    lateinit var artistRecycleViewAdapter: ArtistRecycleViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        artistRecycleView.layoutManager = LinearLayoutManager(this)

        artistViewModel.allArtist.observe(this, Observer {
            artistRecycleViewAdapter = ArtistRecycleViewAdapter(it)
            artistRecycleView.adapter = artistRecycleViewAdapter
        })
    }

    fun addNewArtist(v:View){
        val name: String = artistNameInputText.text.toString()
        val debut: String = debutInputText.text.toString()
        artistViewModel.createNewArtist(Artist(name= name,debut = debut, originPlace = ""))
    }
}