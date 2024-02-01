package com.rmsc.setup;
//3 store class
public class Store extends Organization {
	
	protected String StoreName;
	protected String Location;
	protected String Manager;
	protected String ContactNumber;	
	protected String CreatedDate;
	boolean Status;
	

	public Store(String StoreName, String Location, String Manager, String ContactNumber, String CreatedDate,boolean Status,String ID, String Name, String Email, String StartDate,String EndDate) 
	{

		super(ID, Name, Email, StartDate, EndDate);
		this.StoreName = StoreName;
		this.Location = Location;
		this.Manager = Manager;
		this.ContactNumber = ContactNumber;
		this.CreatedDate = CreatedDate;
		this.Status = Status;

}
	
	public String getStoreName() {
		return StoreName;
	}

	public void setName(String StoreName) {
		this.StoreName = StoreName;
	}
	
	public String getLocation() {
		return Location;
	}

	public void setType(String Location) {
		this.Location = Location;
	}
	
	public String getManager() {
		return Manager;
	}

	public void setManager(String Manager) {
		this.Manager = Manager;
	}
	
	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String ContactNumber) {
		this.ContactNumber = ContactNumber;
	}
	
	public String getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(String CreatedDate) {
		this.CreatedDate = CreatedDate;
	}
	
	public boolean getStatus() {
		return Status;
	}

	public void setStatus(boolean Status) {
		this.Status = Status;
	}
		
		@Override
		public String toString() {

			return super.toString() + "\n" + "StoreName:" + StoreName + "\n" + "Location:" + Location +"\n" + "Manager:" + Manager + "\n" + "ContactNumber:" + ContactNumber + "\n" + "CreatedDate:" + CreatedDate + "\n" + "Status:" + Status;

	}
}
	
	
