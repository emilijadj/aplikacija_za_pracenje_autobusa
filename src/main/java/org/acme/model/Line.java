package org.acme.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Line {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column(name = "name")
    private String name;
	@OneToMany(mappedBy = "lines", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Bus> buses;
	
	@OneToMany(mappedBy = "line", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<LineStops> lineStops;
	public Line() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Bus> getBuses() {
		return buses;
	}
	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}
	public Set<LineStops> getLineStops() {
		return lineStops;
	}
	public void setLineStops(Set<LineStops> lineStops) {
		this.lineStops = lineStops;
	}
	public Line(int id, String name, Set<Bus> buses, Set<LineStops> lineStops) {
		super();
		this.id = id;
		this.name = name;
		this.buses = buses;
		this.lineStops = lineStops;
	}
	
	
}
