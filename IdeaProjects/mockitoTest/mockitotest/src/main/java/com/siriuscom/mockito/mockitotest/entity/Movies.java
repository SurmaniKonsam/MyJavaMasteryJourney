package com.siriuscom.mockito.mockitotest.entity;



public class Movies {

    private String genre;

    private String movieName;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movies(String genre, String movieName) {
        this.genre = genre;
        this.movieName = movieName;
    }


    @Override
    public String toString() {
        return "Movies{" +
                "genre='" + genre + '\'' +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
