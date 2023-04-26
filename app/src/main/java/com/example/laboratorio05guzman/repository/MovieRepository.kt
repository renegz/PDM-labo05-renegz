package com.example.laboratorio05guzman.repository

import com.example.laboratorio05guzman.data.models.MovieModel

class MovieRepository(private var movies: MutableList<MovieModel>) {

    fun getMovies() = movies
    fun addMovie(newMovie:MovieModel) = movies.add(newMovie)
}