package com.app.bms.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */
@Entity
@Table(name = "roles")
public class Role extends Auditable{
    private String name;
    private String description;

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

    public static final class Builder {
        private String name;
        private String description;

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

        public Role build() {
            Role role = new Role();
            role.name = name;
            role.description = description;
            return role;
        }
    }
}
