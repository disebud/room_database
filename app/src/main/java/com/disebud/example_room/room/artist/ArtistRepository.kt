package com.disebud.example_room.room.artist

import androidx.lifecycle.LiveData

class ArtistRepository (private val artistDao: ArtistDao) {

    val allArtist: LiveData<List<Artist>> = artistDao.getAllArtist()

    fun createArtist(artist: Artist){
        artistDao.createArtist(artist)
    }
}