package com.siriuscom.mockito.mockitotest;

import com.siriuscom.mockito.mockitotest.entity.Movies;

import java.util.List;

public interface MockMovieService {

    public List<Movies> getAllMovies();


    public Movies getMoviesBasedOnId(int id);


    public int returnNumberOfMovies(List<Movies> movies);


    public String getMovieNameBasedOnId(int id);
}
