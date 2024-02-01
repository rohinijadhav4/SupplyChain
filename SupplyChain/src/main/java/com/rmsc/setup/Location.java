package com.rmsc.setup;
//4.Location class 
public class Location extends Store {

	protected String LocationID;
	protected String LocationType;
	protected String LocationName;
	protected String FloorName;
	protected String AreaName;


public Location(String LocationID, String LocationType, String LocationName, String FloorName, String AreaName,String StoreName, String Location, String Manager, String ContactNumber, String CreatedDate,boolean Status,String ID, String Name, String Email, String StartDate,String EndDate) 
{

	super(StoreName, Location, Manager, ContactNumber, CreatedDate,Status,ID, Name, Email, StartDate, EndDate);
	
	this.LocationID = LocationID;
	this.LocationType = LocationType;
	this.LocationName = LocationName;
	this.FloorName = FloorName;
	this.AreaName = AreaName;
}
		
	
	public String getLocationID() {
		return LocationID;
	}

	public void setLocationID(String LocationID) {
		this.LocationID = LocationID;
	}
	
	public String getLocationType() {
		return LocationType;
	}

	public void setLocationType(String LocationType) {
		this.LocationType = LocationType;
	}
	
	public String getLocationName() {
		return LocationName;
	}

	public void setLocationName(String LocationName) {
		this.LocationName = LocationName;
	}
	

	public String getFloorName() {
		return FloorName;
	}

	public void setFloorName(String FloorName) {
		this.FloorName = FloorName;
	}
	
	public String getAreaName() {
		return AreaName;
	}

	public void setAreaName(String AreaName) {
		this.AreaName = AreaName;
	}
	
	@Override
	public String toString() {

		return super.toString() + "\n" + "LocationID:" + LocationID + "\n" + "LocationType:" + LocationType +"\n" + "LocationName:" + LocationName + "\n" + "FloorName:" + FloorName + "\n" + "AreaName:" + AreaName;


}
}
