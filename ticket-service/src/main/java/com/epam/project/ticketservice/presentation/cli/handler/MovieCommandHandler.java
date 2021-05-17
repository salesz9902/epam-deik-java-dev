package com.epam.project.ticketservice.presentation.cli.handler;

import com.epam.project.ticketservice.dataaccess.model.Movie;
import com.epam.project.ticketservice.dataaccess.exceptions.MovieNotFound;
import com.epam.project.ticketservice.repository.MovieRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@ShellComponent
public class MovieCommandHandler {

    MovieRepository movieRepository;

    @ShellMethod(value = "Create a new movie", key = "create movie")
    public void createMovie(String title, String genre, int length){
        Movie movie = new Movie(title, genre, length);
        movieRepository.createMovie(movie);
    }

    @ShellMethod(value = "Update an existing movie", key = "update movie")
    public void updateMovie(String title, String genre, int length) throws MovieNotFound {
        movieRepository.updateMovie(title, genre, length);
    }

    @ShellMethod(value = "Delete a existing movie", key = "delete movie")
    public String deleteMovie(String title) {
        try {
            movieRepository.deleteMovie(title);
        } catch (MovieNotFound e) {
            return "The specified movie not exists";
        }
        return null;
    }

    @ShellMethod(value = "List all movies", key = "list movies")
    public String listMovies() {
        List<Movie> listMovies = movieRepository.listAllMovies();
        if (listMovies.size() == 0) {
            return "There are no movies at the moment";
        } else {
            listMovies.forEach(System.out::println);
        }
        return null;
    }



}
