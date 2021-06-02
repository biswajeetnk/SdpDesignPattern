package org.singleDesignPattern.pageComponents;

import org.singleDesignPattern.abstractComponent.SearchFlightAvail;

public class RoundTrip implements SearchFlightAvail
{

    @Override
    public void checkAvailability(String origin, String destination)
    {
        System.out.println("I am inside round trip");
    }
}
