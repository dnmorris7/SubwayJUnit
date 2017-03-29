package com.codecrunchcorner.subway;


import java.util.LinkedList;
import java.util.List;

public class Subway {
private List stations;
private List connections;

	public Subway() {
		// TODO Auto-generated constructor stub
		this.stations = new LinkedList();
		this.connections = new LinkedList();
	}
	
	public void addStation(String stationName){
		//if it's not true we have this station yet
		if(!this.hasStation(stationName)){
			Station station = new Station(stationName);
			stations.add(station);
		}
	}
	
	public boolean hasStation(String stationName){
		return stations.contains(new Station(stationName));	
	}
	
public void addConnection(String stationName, String station2Name, String lineName){
	if(this.hasStation(stationName)&& this.hasStation(station2Name)){
		Station station1= new Station(stationName);
		Station station2= new Station(station2Name);
		Connection connection = new Connection(station1, station2, lineName);
		connections.add(connection);
		connections.add(new Connection(station2, station1, connection.getLineName()));
		
	}
	
}

}
