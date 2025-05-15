package com.siriuscom.mockito.mockitotest.controller;


import com.siriuscom.mockito.mockitotest.entity.Movies;
import com.siriuscom.mockito.mockitotest.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MockitoController {


    private final MovieService movieService;


    MockitoController(MovieService movieService){
        this.movieService = movieService;
    }


    @GetMapping("/getAllMovies")
    public List<Movies> getAllMovies(){
        return movieService.getAllMovies();
    }


    @GetMapping("/getAllMovies/{movieId}")
    public Movies getMoviesBasedOnId(@PathVariable int movieId){
        return movieService.getMoviesBasedOnId(movieId);
    }


    @GetMapping("/getAllMovies/moviesName/{movieId}")
    public String getMoviesName(@PathVariable int movieId){
        return movieService.getMovieNameBasedOnId(movieId);
    }
}
