package com.testdrive.apicontrollers;

import com.testdrive.MockEventsProvider;
import com.testdrive.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by martinmendez on 4/16/17.
 */
@RestController
public class EventApiController {

    @Autowired
    private MockEventsProvider mockEventsProvider;

    @RequestMapping("/api")
    public String index() {
        return "Prueba uno";
    }

    @RequestMapping(value = "/api/events", method = RequestMethod.GET)
    public Iterable<Event> getEvents() {
        return mockEventsProvider.getEvents();
    }

    @RequestMapping(value="/api/event", method = RequestMethod.POST)
    public ResponseEntity<?> createEvent(@RequestBody Event event) {
        mockEventsProvider.addEvent(event);
        return ResponseEntity.ok().build();
    }
}
