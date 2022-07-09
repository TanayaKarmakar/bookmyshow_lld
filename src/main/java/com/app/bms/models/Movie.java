package com.app.bms.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */

@Entity
@Table(name = "movies")
public class Movie extends Auditable{
    private String name;
    private String director;
    private MPAARating rating;
    private String language;
    private Date releaseDate;
    private int durationInMinutes;
    private String plot;

    @ManyToMany
    private List<MovieGenre> genres;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<MovieShow> shows;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public MPAARating getRating() {
        return rating;
    }

    public void setRating(MPAARating rating) {
        this.rating = rating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public List<MovieGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<MovieGenre> genres) {
        this.genres = genres;
    }

    public List<MovieShow> getShows() {
        return shows;
    }

    public void setShows(List<MovieShow> shows) {
        this.shows = shows;
    }

    public static final class Builder {
        private String name;
        private String director;
        private MPAARating rating;
        private String language;
        private Date releaseDate;
        private int durationInMinutes;
        private String plot;
        private List<MovieGenre> genres;
        private List<MovieShow> shows;

        public Builder() {

        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDirector(String director) {
            this.director = director;
            return this;
        }

        public Builder withRating(MPAARating rating) {
            this.rating = rating;
            return this;
        }

        public Builder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder withReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder withDurationInMinutes(int durationInMinutes) {
            this.durationInMinutes = durationInMinutes;
            return this;
        }

        public Builder withPlot(String plot) {
            this.plot = plot;
            return this;
        }

        public Builder withGenres(List<MovieGenre> genres) {
            this.genres = genres;
            return this;
        }

        public Builder withShows(List<MovieShow> shows) {
            this.shows = shows;
            return this;
        }

        public Movie build() {
            Movie movie = new Movie();
            movie.name = name;
            movie.director = director;
            movie.durationInMinutes = durationInMinutes;
            movie.genres = genres;
            movie.language = language;
            movie.plot = plot;
            movie.shows = shows;
            return movie;
        }
    }
}
