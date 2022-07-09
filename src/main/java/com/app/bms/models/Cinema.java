package com.app.bms.models;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author t0k02w6 on 08/07/22
 * @project bookmyshow_lld
 */

@Entity
@Table(name = "cinemas")
public class Cinema extends Auditable {
    private boolean hasParking;

    @NotNull
    @NotEmpty
    private String address;

    @NotNull
    private String name;

//    @ManyToOne
//    private City city;

    @OneToMany(mappedBy = "cinema")
    private List<Auditorium> cinemaHalls;

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public City getCity() {
//        return city;
//    }
//
//    public void setCity(City city) {
//        this.city = city;
//    }

    public List<Auditorium> getCinemaHalls() {
        return cinemaHalls;
    }

    public void setCinemaHalls(List<Auditorium> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }

    public static final class Builder {
        private boolean hasParking;
        private String address;
        private String name;
        //private City city;
        private List<Auditorium> cinemaHalls;

        public Builder() {

        }

        public Builder withHasParking(boolean hasParking) {
            this.hasParking = hasParking;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

//        public Builder withCity(City city) {
//            this.city = city;
//            return this;
//        }

        public Builder withCinemaHalls(List<Auditorium> cinemaHalls) {
            this.cinemaHalls = cinemaHalls;
            return this;
        }

        public Cinema build() {
            Cinema cinema = new Cinema();
            cinema.cinemaHalls = cinemaHalls;
            //cinema.city = city;
            cinema.address = address;
            cinema.hasParking = hasParking;
            cinema.name = name;
            return cinema;
        }
    }
}
