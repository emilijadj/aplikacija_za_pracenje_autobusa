package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "registration_number")
	private String registrationNumber;

	@ManyToOne
	@JoinColumn(name = "line_id")
	private Line lines;

	public Bus() {
		super();
	}

	public Bus(String registrationNumber, Line lines) {
		super();
		this.registrationNumber = registrationNumber;
		this.lines = lines;
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

	public Line getLines() {
		return lines;
	}

	public void setLines(Line lines) {
		this.lines = lines;
	}

	
}
