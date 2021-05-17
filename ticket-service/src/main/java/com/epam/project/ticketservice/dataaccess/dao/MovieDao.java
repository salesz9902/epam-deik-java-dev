package com.epam.project.ticketservice.dataaccess.dao;

import com.epam.project.ticketservice.dataaccess.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie, Integer> {
}
