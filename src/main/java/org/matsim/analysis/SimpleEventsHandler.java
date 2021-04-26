package org.matsim.analysis;

import com.sun.xml.bind.v2.model.core.ID;
import org.matsim.api.core.v01.events.ActivityEndEvent;
import org.matsim.api.core.v01.events.handler.ActivityEndEventHandler;
import org.matsim.api.core.v01.events.handler.ActivityStartEventHandler;
import org.matsim.api.core.v01.population.Person;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class SimpleEventsHandler implements ActivityStartEventHandler, ActivityEndEventHandler {



    private final Map<ID<Person>,Double> personToStartTime = new HashMap<>();

    @Override
    public void handleEvent(ActivityEndEvent event){

        personToStartTime.put(event.getPersonId(), event.getTime())
        System.out.println("Person" + event.getPersonId().toString() + " finish activity " + event.getActType());
    }

    @Override
    public void handleEvent(ActivityEndEvent event){

        System.out.println("Person "+ event.getPersonId().toString() + " started activity " + event.getActType());
        double startTime = personToStartTime.get(event.getPersonId());


    }

}
