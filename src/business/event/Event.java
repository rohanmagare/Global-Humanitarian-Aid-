/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.event;

/**
 * This class is used to define the event.
 *
 * @author Admin
 */
public class Event {

    private Event event;
    private String eventLocation;
    private String eventDescription;
    private int predictedVictims;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public int getPredictedVictims() {
        return predictedVictims;
    }

    public void setPredictedVictims(int predictedVictims) {
        this.predictedVictims = predictedVictims;
    }

    public Event(Event event) {
        this.event = event;
    }

}
