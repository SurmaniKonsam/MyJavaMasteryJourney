package com.siriuscom.mockito.mockitotest.service;

import com.siriuscom.mockito.mockitotest.entity.Movies;

import java.util.List;

public interface MovieService {

    public List<Movies> getAllMovies();


    public Movies getMoviesBasedOnId(int id);


    public int returnNumberOfMovies(List<Movies> movies);

    public String getMovieNameBasedOnId(int id);
}
