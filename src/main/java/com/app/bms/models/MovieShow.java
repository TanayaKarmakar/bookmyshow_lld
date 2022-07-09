package com.app.bms.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * @author t0k02w6 on 08/07/22
 * @project bookmyshow_lld
 */

@Entity
@Table(name = "movieshows")
public class MovieShow extends Auditable{
    private Date timingFrom;
    private Date timingTo;

    @OneToMany
    private List<Booking> bookings;

    @ManyToOne
    private Auditorium auditorium;

    @ManyToOne
    private Movie movie;

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getTimingFrom() {
        return timingFrom;
    }

    public void setTimingFrom(Date timingFrom) {
        this.timingFrom = timingFrom;
    }

    public Date getTimingTo() {
        return timingTo;
    }

    public void setTimingTo(Date timingTo) {
        this.timingTo = timingTo;
    }

    public static final class Builder {
        private Date timingFrom;
        private Date timingTo;
        private List<Booking> bookings;
        private Auditorium auditorium;
        private Movie movie;

        public Builder() {

        }

        public Builder withTimingFrom(Date timingFrom) {
            this.timingFrom = timingFrom;
            return this;
        }

        public Builder withTimingTo(Date timingTo) {
            this.timingTo = timingTo;
            return this;
        }

        public Builder withBookings(List<Booking> bookings) {
            this.bookings = bookings;
            return this;
        }

        public Builder withAuditorium(Auditorium auditorium) {
            this.auditorium = auditorium;
            return this;
        }

        public Builder withMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public MovieShow build() {
            MovieShow movieShow = new MovieShow();
            movieShow.movie = movie;
            movieShow.auditorium = auditorium;
            movieShow.bookings = bookings;
            movieShow.timingFrom = timingFrom;
            movieShow.timingTo = timingTo;
            return movieShow;
        }
    }
}
