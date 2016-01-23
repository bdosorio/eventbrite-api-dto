package com.bdosorio.ebapi.dto.organizer;

import com.bdosorio.ebapi.dto.basic.EbMultipartText;

public class EbOrganizer {
    private String name;
    private EbMultipartText description;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EbMultipartText getDescription() {
        return description;
    }

    public void setDescription(EbMultipartText description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
