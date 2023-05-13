package com.example.laboratorio05guzman.ui.movie.billboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laboratorio05guzman.R
import com.example.laboratorio05guzman.data.models.MovieModel
import com.example.laboratorio05guzman.databinding.FragmentBillboardBinding
import com.example.laboratorio05guzman.ui.movie.billboard.recyclerview.MovieRecyclerViewAdapter
import com.example.laboratorio05guzman.ui.movie.viewmodel.MovieViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillboardFragment : Fragment() {

    private lateinit var binding: FragmentBillboardBinding
    private lateinit var adapter: MovieRecyclerViewAdapter
    private val movieViewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBillboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView(view)

        addListerners()
    }

    private fun addListerners(){
        binding.actionToCreateMovie.setOnClickListener{
            movieViewModel.clearData()
            it.findNavController().navigate(R.id.action_billboardFragment_to_createMovieFragment)
        }
    }

    private fun showSelectedItem(movie: MovieModel){
        movieViewModel.setSelectedMovie(movie)
        findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
    }

    private fun displayMovies(){
        adapter.setData(movieViewModel.getMovies())
        adapter.notifyDataSetChanged()
    }

    private fun setRecyclerView(view:View) {
        binding.recyclerViewBillboard.layoutManager = LinearLayoutManager(view.context)

        adapter = MovieRecyclerViewAdapter { selectedMovie ->
            showSelectedItem(selectedMovie)
        }

        binding.recyclerViewBillboard.adapter = adapter
        displayMovies()
    }



}