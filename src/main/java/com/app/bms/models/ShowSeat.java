package com.app.bms.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author t0k02w6 on 08/07/22
 * @project bookmyshow_lld
 */

@Entity
@Table(name = "showseats")
public class ShowSeat extends Auditable {
    @ManyToOne
    private AudiSeat audiSeat;

    @ManyToOne
    private MovieShow show;

    @ManyToOne
    private Booking booking;

    private boolean occupied;

    public AudiSeat getAudiSeat() {
        return audiSeat;
    }

    public void setAudiSeat(AudiSeat audiSeat) {
        this.audiSeat = audiSeat;
    }

    public MovieShow getShow() {
        return show;
    }

    public void setShow(MovieShow show) {
        this.show = show;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public static final class Builder {
        private AudiSeat audiSeat;
        private MovieShow show;
        private Booking booking;
        private boolean occupied;

        public Builder() {

        }

        public Builder withAudiSeat(AudiSeat audiSeat) {
            this.audiSeat = audiSeat;
            return this;
        }

        public Builder withShow(MovieShow show) {
            this.show = show;
            return this;
        }

        public Builder withBooking(Booking booking) {
            this.booking = booking;
            return this;
        }

        public Builder withOccupied(boolean occupied) {
            this.occupied = occupied;
            return this;
        }

        public ShowSeat build() {
            ShowSeat showSeat = new ShowSeat();
            showSeat.audiSeat = audiSeat;
            showSeat.show = show;
            showSeat.booking = booking;
            showSeat.occupied = occupied;
            return showSeat;
        }
    }
}
