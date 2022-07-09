package com.app.bms.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */
@Entity
@Table(name = "profiles")
public class Profile extends Auditable {
    private String fullName;
    private String phone;
    private String city;
    private String email;

    @OneToMany(mappedBy = "profile")
    private List<Booking> bookings;

    @OneToOne
    private User user; // this profile belongs to this user

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static final class Builder {
        private String fullName;
        private String phone;
        private String city;
        private String email;
        private List<Booking> bookings;
        private User user;

        public Builder() {

        }

        public Builder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withBookings(List<Booking> bookings) {
            this.bookings = bookings;
            return this;
        }

        public Builder withUser(User user) {
            this.user = user;
            return this;
        }

        public Profile build() {
            Profile profile = new Profile();
            profile.bookings = bookings;
            profile.city = city;
            profile.user = user;
            profile.fullName = fullName;
            profile.phone = phone;
            profile.email = email;
            return profile;
        }
    }
}
