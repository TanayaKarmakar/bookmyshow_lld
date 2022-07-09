package com.app.bms.models;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */
public enum MPAARating {
    GeneralAudience("G"),
    ParentalGuidanceSuggested("PG"),
    ParentsStronglyCautioned("PG-13"),
    Restricted("R"),
    AdultsOnly("NC-17");

    private String code;

    MPAARating(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
