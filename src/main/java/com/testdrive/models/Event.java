package com.testdrive.models;

/**
 * Created by martinmendez on 4/16/17.
 */
public class Event extends Entity {

    private Venue venue;

    public Event() {
        super();
    }

    public Event(String name, Venue venue) {
        super(name);
        this.venue = venue;
    }

    public Venue getVenue() {
        return venue;
    }
}

