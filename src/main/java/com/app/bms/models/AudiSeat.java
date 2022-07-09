package com.app.bms.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */
@Entity
@Table(name = "audiseats")
public class AudiSeat extends Auditable{
    private String seatLocation;
    private String seatType;
    private boolean isUnderMaintenance;

    @ManyToOne
    private Auditorium auditorium;

    @OneToMany(mappedBy = "audiSeat")
    private List<ShowSeat> showSeats;

    public String getSeatLocation() {
        return seatLocation;
    }

    public void setSeatLocation(String seatLocation) {
        this.seatLocation = seatLocation;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean isUnderMaintenance() {
        return isUnderMaintenance;
    }

    public void setUnderMaintenance(boolean underMaintenance) {
        isUnderMaintenance = underMaintenance;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public static final class Builder {
        private String seatLocation;
        private String seatType;
        private boolean isUnderMaintenance;
        private Auditorium auditorium;
        private List<ShowSeat> showSeats;

        public Builder() {

        }

        public Builder withSeatLocation(String seatLocation) {
            this.seatLocation = seatLocation;
            return this;
        }

        public Builder withSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }

        public Builder withIsUnderMaintenance(boolean isUnderMaintenance) {
            this.isUnderMaintenance = isUnderMaintenance;
            return this;
        }

        public Builder withAuditorium(Auditorium auditorium) {
            this.auditorium = auditorium;
            return this;
        }

        public Builder withShowSeats(List<ShowSeat> showSeats) {
            this.showSeats = showSeats;
            return this;
        }

        public AudiSeat build() {
            AudiSeat audiSeat = new AudiSeat();
            audiSeat.auditorium = auditorium;
            audiSeat.seatType = seatType;
            audiSeat.seatLocation = seatLocation;
            audiSeat.showSeats = showSeats;
            audiSeat.isUnderMaintenance = isUnderMaintenance;
            return audiSeat;
        }
    }
}
