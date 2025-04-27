package org.acme.model;

import java.time.LocalDateTime;

public class BusLocation {
    
    private int id;
    private double latitude;
    private double longitude;
    private LocalDateTime timestamp;
    private Bus bus;

    public BusLocation(int id, double latitude, double longitude, LocalDateTime timestamp, Bus bus) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.bus = bus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "BusLocation{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", intitude=" + longitude +
                ", timestamp=" + timestamp +
                ", bus=" + bus.getRegistrationNumber() +
                '}';
    }

}
