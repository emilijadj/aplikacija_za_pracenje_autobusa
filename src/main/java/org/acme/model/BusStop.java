package org.acme.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "bus_stops")
public class BusStop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "stop_name")
    private String stopName;

    @OneToMany(mappedBy = "busStop", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<LineStops> lineStops;
    
	public BusStop() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public Set<LineStops> getLineStops() {
		return lineStops;
	}

	public void setLineStops(Set<LineStops> lineStops) {
		this.lineStops = lineStops;
	}

	public BusStop(Long id, String stopName, Set<LineStops> lineStops) {
		super();
		this.id = id;
		this.stopName = stopName;
		this.lineStops = lineStops;
	}

	
}
