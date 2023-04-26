package com.example.laboratorio05guzman

import android.app.Application
import com.example.laboratorio05guzman.data.movies
import com.example.laboratorio05guzman.repository.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}