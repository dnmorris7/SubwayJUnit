package com.codecrunchcorner.subway;

public class Connection {
	private Station station1, station2;
	private String lineName;

	/* This class handles the connections between our different Subway lines */
	public Connection(Station station1, Station station2, String lineName) {
		this.station1 = station1;
		this.station2 = station2;
		this.lineName = lineName;

	}

	public Station getStation1() {
		return station1;
	}

	public Station getStation2() {
		return station2;
	}

	public String getLineName() {
		return lineName;
	}

}
