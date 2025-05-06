package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "line_stops")
public class LineStops {
 
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "line_id")
	    private Line line;

	    @ManyToOne
	    @JoinColumn(name = "bus_stop_id")
	    private BusStop busStop;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Line getLine() {
			return line;
		}

		public void setLine(Line line) {
			this.line = line;
		}

		public BusStop getBusStop() {
			return busStop;
		}

		public void setBusStop(BusStop busStop) {
			this.busStop = busStop;
		}

		public LineStops(Long id, Line line, BusStop busStop) {
			super();
			this.id = id;
			this.line = line;
			this.busStop = busStop;
		}

		public LineStops() {
			super();
		}

	  	
}
