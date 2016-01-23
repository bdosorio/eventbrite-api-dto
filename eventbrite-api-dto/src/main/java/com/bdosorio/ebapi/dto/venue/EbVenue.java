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
}
