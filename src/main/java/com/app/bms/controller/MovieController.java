package com.app.bms.controller;

import com.app.bms.models.Movie;
import com.app.bms.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */
@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") Long movieId) {
        return movieRepository.findById(movieId).orElseThrow();
    }
}
