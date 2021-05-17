package com.epam.project.ticketservice.repository;

import com.epam.project.ticketservice.dataaccess.model.Movie;
import com.epam.project.ticketservice.dataaccess.exceptions.MovieNotFound;

import java.util.List;


public interface MovieRepository {
    public void createMovie(Movie movie);
    public void updateMovie(String title, String genre, int duration) throws MovieNotFound;
    public void deleteMovie(String title) throws MovieNotFound;
    public List<Movie> listAllMovies();

}
