package org.acme.model;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private Long id;
    private String name;
    private List<Bus> buses;

    public Line(Long id, String name) {
        this.id = id;
        this.name = name;
        this.buses = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void addBus(Bus bus) {
        this.buses.add(bus);
    }

    @Override
    public String toString() {
        return "Line{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", buses=" + buses +
                '}';
    }

}
