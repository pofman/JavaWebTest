package com.testdrive;

import com.testdrive.models.Event;
import com.testdrive.models.Venue;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinmendez on 4/16/17.
 */
@Component
public class MockEventsProvider {
    public Iterable<Event> getEvents() {
        List<Event> events = new ArrayList<>();

        Venue venue1 = new Venue("Normandy Music Center", "Norman", "OK", "96607-8068");
        Venue venue2 = new Venue("Collier-Wisoky Stadium", "Las Vegas", "NV", "91807-1012");
        Venue venue3 = new Venue("Davis and Sons Theater", "Ocala", "FL", "92502-8847");

        events.add(new Event("Madonna World Tour 2019", venue1));
        events.add(new Event("Ben and Jerry Exotic World Tour 2019", venue2));
        events.add(new Event("Glycerin Smoking Guns", venue3));


        return events;

    }
}
