package com.siriuscom.mockito.mockitotest.service;


import com.siriuscom.mockito.mockitotest.entity.Movies;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{


    List<Movies> getMovies;

    @PostConstruct
    public void setAllMovies(){
        getMovies = new ArrayList<>();
        Movies movie1 = new Movies("action","URI");
        Movies movie2 = new Movies("action","avenger");
        Movies movie3 = new Movies("action","IM");
        Movies movie4 = new Movies("horror","grudge");

        getMovies.add(movie1);
        getMovies.add(movie2);
        getMovies.add(movie3);
        getMovies.add(movie4);
    }



    @Override
    public List<Movies> getAllMovies(){
        return getMovies;
    }



    @Override
    public Movies getMoviesBasedOnId(int id){
        return getMovies.get(id);
    }


    @Override
    public int returnNumberOfMovies(List<Movies> movies) {
        return movies.size();
    }


    public String getMovieNameBasedOnId(int id){
        return getMovies.get(id).getMovieName();
    }
}
