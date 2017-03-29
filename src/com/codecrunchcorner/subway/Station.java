package com.codecrunchcorner.subway;

public class Station{
private String name;
	public Station(String name) {
		// TODO Auto-generated constructor stub
	this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Station){
			Station otherStation = (Station)obj;
			if(otherStation.getName().equalsIgnoreCase(name)){
				return true;
			}
		}
		return false;
		
	}
	
	public int hashCode(){
		return name.toLowerCase().hashCode();	
	}
	
}