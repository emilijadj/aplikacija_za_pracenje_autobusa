package org.acme.model;

import java.util.ArrayList;
import java.util.List;



public class Bus {

    private int id;
    private String registrationNumber;
    private List<BusLocation> locations;
    private List<Line> lines;

    public Bus(int id, String registrationNumber) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.locations = new ArrayList<>();
        this.lines = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<BusLocation> getLocations() {
        return locations;
    }

    public void addLocation(BusLocation location) {
        this.locations.add(location);
    }

    public List<Line> getLines() {
        return lines;
    }

    public void addLine(Line line) {
        this.lines.add(line);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", locations=" + locations +
                ", lines=" + lines +
                '}';
    }

}
