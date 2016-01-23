package com.bdosorio.ebapi.dto.basic;

public class EbDateTimeWithTimezone {
    private EbDateTime timezone;
    private String utc;
    private String local;


    public EbDateTime getTimezone() {
        return timezone;
    }

    public void setTimezone(EbDateTime timezone) {
        this.timezone = timezone;
    }

    public String getUtc() {
        return utc;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
