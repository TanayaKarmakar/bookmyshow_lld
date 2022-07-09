package com.app.bms.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * @author t0k02w6 on 08/07/22
 * @project bookmyshow_lld
 */
@Entity
@Table(name = "auditoriums")
public class Auditorium extends Auditable {
    private String hallName;
    private boolean hasAirConditioning;
    private boolean canHost3D;
    private int numberOfExits;
    private int numberOfEmergencyExits;


    @OneToMany(mappedBy = "auditorium")
    private List<AudiSeat> seats;

    @OneToMany(mappedBy = "auditorium")
    private List<MovieShow> shows;

    @ManyToOne
    private Cinema cinema;

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean isCanHost3D() {
        return canHost3D;
    }

    public void setCanHost3D(boolean canHost3D) {
        this.canHost3D = canHost3D;
    }

    public int getNumberOfExits() {
        return numberOfExits;
    }

    public void setNumberOfExits(int numberOfExits) {
        this.numberOfExits = numberOfExits;
    }

    public int getNumberOfEmergencyExits() {
        return numberOfEmergencyExits;
    }

    public void setNumberOfEmergencyExits(int numberOfEmergencyExits) {
        this.numberOfEmergencyExits = numberOfEmergencyExits;
    }

    public List<MovieShow> getShows() {
        return shows;
    }

    public void setShows(List<MovieShow> shows) {
        this.shows = shows;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public List<AudiSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<AudiSeat> seats) {
        this.seats = seats;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public static final class Builder {
        private String hallName;
        private boolean hasAirConditioning;
        private boolean canHost3D;
        private int numberOfExits;
        private int numberOfEmergencyExits;
        private List<AudiSeat> seats;
        private List<MovieShow> shows;
        private Cinema cinema;

        public Builder() {

        }

        public Builder withCanHost3D(boolean canHost3D) {
            this.canHost3D = canHost3D;
            return this;
        }

        public Builder withHallName(String hallName) {
            this.hallName = hallName;
            return this;
        }

        public Builder withHasAirConditioning(boolean hasAirConditioning) {
            this.hasAirConditioning = hasAirConditioning;
            return this;
        }

        public Builder withNumberOfExits(int numberOfExits) {
            this.numberOfExits = numberOfExits;
            return this;
        }

        public Builder withNumberOfEmergencyExits(int numberOfEmergencyExits) {
            this.numberOfEmergencyExits = numberOfEmergencyExits;
            return this;
        }

        public Builder withSeats(List<AudiSeat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder withShows(List<MovieShow> shows) {
            this.shows = shows;
            return this;
        }

        public Builder withCinema(Cinema cinema) {
            this.cinema = cinema;
            return this;
        }

        public Auditorium build() {
            Auditorium audi = new Auditorium();
            audi.hallName = hallName;
            audi.canHost3D = canHost3D;
            audi.numberOfExits = numberOfExits;
            audi.numberOfEmergencyExits = numberOfEmergencyExits;
            audi.cinema = cinema;
            audi.seats = seats;
            audi.shows = shows;
            return audi;
        }
    }
}
