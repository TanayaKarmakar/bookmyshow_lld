package com.app.bms.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */

@Entity
@Table(name = "genres")
public class MovieGenre extends Auditable {
    private String name;
    private String description;

    @ManyToMany
    private List<Movie> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public static final class Builder {
        private String name;
        private String description;
        private List<Movie> movies;

        public Builder() {

        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withMovies(List<Movie> movies) {
            this.movies = movies;
            return this;
        }

        public MovieGenre build() {
            MovieGenre genre = new MovieGenre();
            genre.name = name;
            genre.description = description;
            genre.movies = movies;
            return genre;
        }
    }
}
