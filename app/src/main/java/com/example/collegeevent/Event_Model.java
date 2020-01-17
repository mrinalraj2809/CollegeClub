package com.example.collegeevent;

public class Event_Model {
    String title;
    String eventDate;
    String eventTime;
    String venue;
    String reminderSet;


    public Event_Model(String title, String eventDate, String eventTime, String venue, String reminderSet) {
        this.title = title;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venue = venue;
        this.reminderSet = reminderSet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getReminderSet() {
        return reminderSet;
    }

    public void setReminderSet(String reminderSet) {
        this.reminderSet = reminderSet;
    }
}
