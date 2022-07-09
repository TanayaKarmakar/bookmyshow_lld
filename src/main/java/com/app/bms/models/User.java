package com.app.bms.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author t0k02w6 on 08/07/22
 * @project bookmyshow_lld
 */
@Entity
@Table(name = "users")
public class User extends Auditable {
    @Email
    @NotBlank
    @Column(unique = true)
    private String email;
    private String saltedHashedPassword;

    @ManyToMany
    private List<Role> roles;

    @OneToOne
    private Profile profile;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSaltedHashedPassword() {
        return saltedHashedPassword;
    }

    public void setSaltedHashedPassword(String saltedHashedPassword) {
        this.saltedHashedPassword = saltedHashedPassword;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public static final class Builder {
        private String email;
        private String saltedHashedPassword;
        private List<Role> roles;
        private Profile profile;

        public Builder() {

        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withSaltedHashedPassword(String saltedHashedPassword) {
            this.saltedHashedPassword = saltedHashedPassword;
            return this;
        }

        public Builder withRoles(List<Role> roles) {
            this.roles = roles;
            return this;
        }

        public Builder withProfile(Profile profile) {
            this.profile = profile;
            return this;
        }

        public User build() {
            User user = new User();
            user.email = email;
            user.profile = profile;
            user.roles = roles;
            user.saltedHashedPassword = saltedHashedPassword;
            return user;
        }
    }
}
