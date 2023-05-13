package com.example.laboratorio05guzman.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05guzman.data.models.MovieModel
import com.example.laboratorio05guzman.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit){
        binding.tvTitle.text = movie.name
        binding.tvScore.text = movie.qualification

        binding.movieItemCardView.setOnClickListener{
            clickListener(movie)
        }
    }
}