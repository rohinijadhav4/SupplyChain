package com.rmsc.setup;

public class Organization {
	

	protected String ID;
	protected String Name;
	protected String Email;
	protected String StartDate;
	protected String EndDate;
	
	public Organization(String ID, String Name, String Email, String StartDate,String EndDate) 
	{
		super();
		this.ID = ID;
		this.Name = Name;
		this.Email = Email;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
			
		public String getID() {
			return ID;
		}

		public void setID(String ID) {
			this.ID = ID;
		}
		
		public String getName() {
			return Name;
		}

		public void setName(String Name) {
			this.Name = Name;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String Email) {
			this.Email = Email;
		}

		public String getStartDate() {
			return StartDate;
		}

		public void setStartDate(String StartDate) {
			this.StartDate = StartDate;
		}
		
		public String getEndDate() {
			return EndDate;
		}

		public void setEndDate(String EndDate) {
			this.EndDate = EndDate;
		}
		
		@Override
		public String toString() {
			return "Organization Details\n" + "ID:" + ID + "\n" + "name:" + Name + "\n" + "Email:" + Email + "\n" +"StartDate:" + StartDate + "\n" + "EndDate:" + EndDate;  
		}


		
	

}
