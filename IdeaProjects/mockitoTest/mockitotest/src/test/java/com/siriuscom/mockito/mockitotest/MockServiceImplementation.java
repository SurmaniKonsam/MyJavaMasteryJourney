package com.siriuscom.mockito.mockitotest;

import com.siriuscom.mockito.mockitotest.entity.Movies;
import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class MockServiceImplementation implements MockMovieService{

    List<Movies> getMovies;


    public MockServiceImplementation(List<Movies> getMovies) {
        this.getMovies = getMovies;
    }

    @PostConstruct
    public void setAllMovies(){
        getMovies = new ArrayList<>();
        Movies movie1 = new Movies("URI_1","action");
        Movies movie2 = new Movies("MI","action");
        Movies movie3 = new Movies("Kite","action");
        Movies movie4 = new Movies("Grudge","horror");

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


    @Override
    public String getMovieNameBasedOnId(int id){

        return getAllMovies().get(id).getMovieName();
    }
}
