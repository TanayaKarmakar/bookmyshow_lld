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
@Table(name = "bookings")
public class Booking extends Auditable {
    @ManyToOne
    private MovieShow show;

    @OneToMany
    private List<ShowSeat> seats;

//    @OneToMany
//    private List<Transaction> transactions;

//    @ManyToOne
//    private Coupon coupon;

    @ManyToOne
    private Profile profile;

    public MovieShow getShow() {
        return show;
    }

    public void setShow(MovieShow show) {
        this.show = show;
    }

    public List<ShowSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<ShowSeat> seats) {
        this.seats = seats;
    }

//    public List<Transaction> getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(List<Transaction> transactions) {
//        this.transactions = transactions;
//    }

//    public Coupon getCoupon() {
//        return coupon;
//    }
//
//    public void setCoupon(Coupon coupon) {
//        this.coupon = coupon;
//    }


    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public static final class Builder {
        private MovieShow show;
        private List<ShowSeat> seats;
        private List<Transaction> transactions;
        //private Coupon coupon;
        private Profile profile;

        public Builder() {

        }

        public Builder withShow(MovieShow show) {
            this.show = show;
            return this;
        }

        public Builder withSeats(List<ShowSeat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder withTransactions(List<Transaction> transactions) {
            this.transactions = transactions;
            return this;
        }

//        public Builder withCoupon(Coupon coupon) {
//            this.coupon = coupon;
//            return this;
//        }

        public Builder withProfile(Profile profile) {
            this.profile = profile;
            return this;
        }

        public Booking build() {
            Booking booking = new Booking();
            //booking.coupon = coupon;
            booking.seats = seats;
            booking.show = show;
            //booking.transactions = transactions;
            booking.profile = profile;
            return booking;
        }
    }
}
