package com.rmsc.setup;
//5.Items class
public class Items extends Location {
	
	protected String ItemCode;
	protected String ItemName;
	protected String UnitOfMeasurment;
	protected String Quantity;
	
	public Items (String ItemCode,String ItemName,String UnitOfMeasurment, String Quantity,String LocationID, String LocationType, String LocationName, String FloorName, String AreaName,String StoreName, String Location, String Manager, String ContactNumber, String CreatedDate,boolean Status,String ID, String Name, String Email, String StartDate,String EndDate) 
     
	{

		super(LocationID,LocationType,LocationName,FloorName,AreaName,StoreName,Location,  Manager,  ContactNumber,  CreatedDate,Status, ID,  Name,  Email, StartDate, EndDate);
		
		this.ItemCode = ItemCode;
		this.ItemName = ItemName;
		this.UnitOfMeasurment = UnitOfMeasurment;
		this.Quantity = Quantity;
	}
	
	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String ItemCode) {
		this.ItemCode = ItemCode;
	}
	

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	
	public String getUnitOfMeasurment() {
		return UnitOfMeasurment;
	}

	public void setUnitOfMeasurment(String UnitOfMeasurment) {
		this.UnitOfMeasurment = UnitOfMeasurment;
	}
	
	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String Quantity) {
		this.Quantity = Quantity;
	}
	

	@Override
	public String toString() {

		return super.toString() + "\n" + "ItemCode:" + ItemCode + "\n" + "ItemName:" + ItemName +"\n" + "UnitOfMeasurment:" + UnitOfMeasurment + "\n" + "Quantity:" + Quantity;



}
}
