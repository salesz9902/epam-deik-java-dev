package com.epam.project.ticketservice.dataaccess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String genre;
    private int length;

    public Movie(String title, String genre, int length) {
        this.title = title;
        this.genre = genre;
        this.length = length;
    }

    public Movie() {

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return title + ": " + genre + ", " + length + " minutes.\n";
    }
}
