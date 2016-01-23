package com.bdosorio.ebapi.dto.event;

import com.bdosorio.ebapi.dto.basic.*;
import com.bdosorio.ebapi.dto.organizer.EbOrganizer;
import com.bdosorio.ebapi.dto.venue.EbVenue;

public class EbEvent extends EbObject {
    private EbMultipartText name;
    private EbMultipartText description;
    private String url;
    private EbDateTimeWithTimezone start;
    private EbDateTimeWithTimezone end;
    private EbDateTime created;
    private EbDateTime changed;
    private Integer capacity;
    private String status; //One of canceled, live, started, ended, completed.
    private String currency;
    private Boolean online_event;
    private EbImage image;
    //expanded
    private EbVenue venue;
    private EbOrganizer organizer;
    private EbFormat format;
    private EbCategory category;
    private EbSubcategory subcategory;
    private TicketClass ticket_classes;
    //private
    private Boolean listed;
    private Boolean shareable;
    private Boolean invite_only;
    private Boolean show_remaining;
    private String password;

    public EbMultipartText getName() {
        return name;
    }

    public void setName(EbMultipartText name) {
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

    public EbDateTimeWithTimezone getStart() {
        return start;
    }

    public void setStart(EbDateTimeWithTimezone start) {
        this.start = start;
    }

    public EbDateTimeWithTimezone getEnd() {
        return end;
    }

    public void setEnd(EbDateTimeWithTimezone end) {
        this.end = end;
    }

    public EbDateTime getCreated() {
        return created;
    }

    public void setCreated(EbDateTime created) {
        this.created = created;
    }

    public EbDateTime getChanged() {
        return changed;
    }

    public void setChanged(EbDateTime changed) {
        this.changed = changed;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getOnline_event() {
        return online_event;
    }

    public void setOnline_event(Boolean online_event) {
        this.online_event = online_event;
    }

    public EbImage getImage() {
        return image;
    }

    public void setImage(EbImage image) {
        this.image = image;
    }

    public EbVenue getVenue() {
        return venue;
    }

    public void setVenue(EbVenue venue) {
        this.venue = venue;
    }

    public EbOrganizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(EbOrganizer organizer) {
        this.organizer = organizer;
    }

    public EbFormat getFormat() {
        return format;
    }

    public void setFormat(EbFormat format) {
        this.format = format;
    }

    public EbCategory getCategory() {
        return category;
    }

    public void setCategory(EbCategory category) {
        this.category = category;
    }

    public EbSubcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(EbSubcategory subcategory) {
        this.subcategory = subcategory;
    }

    public TicketClass getTicket_classes() {
        return ticket_classes;
    }

    public void setTicket_classes(TicketClass ticket_classes) {
        this.ticket_classes = ticket_classes;
    }

    public Boolean getListed() {
        return listed;
    }

    public void setListed(Boolean listed) {
        this.listed = listed;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public Boolean getInvite_only() {
        return invite_only;
    }

    public void setInvite_only(Boolean invite_only) {
        this.invite_only = invite_only;
    }

    public Boolean getShow_remaining() {
        return show_remaining;
    }

    public void setShow_remaining(Boolean show_remaining) {
        this.show_remaining = show_remaining;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}