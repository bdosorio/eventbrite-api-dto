package com.bdosorio.ebapi.dto.venue;

import com.bdosorio.ebapi.dto.basic.EbAddress;
import com.bdosorio.ebapi.dto.basic.EbObject;

public class EbVenue extends EbObject {
    private String name;
    private String longitude;
    private String latitude;
    private EbAddress address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public EbAddress getAddress() {
        return address;
    }

    public void setAddress(EbAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EbVenue ebVenue = (EbVenue) o;

        return getId() != null ? getId().equals(ebVenue.getId()) : ebVenue.getId() == null;

    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
