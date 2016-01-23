package com.bdosorio.ebapi.dto.event;

import com.bdosorio.ebapi.dto.basic.EbPagination;

import java.util.List;

public class EbPageOfEvents {
    private EbPagination pagination;
    private List<EbEvent> events;

    public List<EbEvent> getEvents() {
        return events;
    }

    public void setEvents(List<EbEvent> events) {
        this.events = events;
    }

    public EbPagination getPagination() {
        return pagination;
    }

    public void setPagination(EbPagination pagination) {
        this.pagination = pagination;
    }
}
