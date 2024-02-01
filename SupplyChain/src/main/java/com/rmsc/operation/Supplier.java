package com.rmsc.operation;
//6.supplier class
import com.rmsc.setup.Organization;

public class Supplier extends Organization {
	
	protected String SupplierID;
	protected String SupplierName;
	protected String PrimeryContactNo;
	boolean Active;
	
	public Supplier(String SupplierID,String SupplierName,String PrimeryContactNo,boolean Active,String ID, String Name, String Email, String StartDate,String EndDate) 
	{
		super(ID,Name,Email,StartDate,EndDate);
		this.SupplierID = SupplierID;
		this.SupplierName = SupplierName;
		this.PrimeryContactNo = PrimeryContactNo;
		this.Active = Active;
		
	}
	
	
	public String getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(String SupplierID) {
		this.SupplierID = SupplierID;
	}
	
	public String getSupplierName() {
		return SupplierName;
	}

	public void setSupplierName(String SupplierName) {
		this.SupplierName = SupplierName;
	}

	public String getPrimeryContactNo() {
		return PrimeryContactNo;
	}

	public void setPrimeryContactNo(String PrimeryContactNo) {
		this.PrimeryContactNo = PrimeryContactNo;
	}

	public boolean getActive() {
		return Active;
	}

	public void setActive(boolean Active) {
		this.Active = Active;
	}
	
		
	@Override
	public String toString() {

		return super.toString() + "\n" + "SupplierID:" + SupplierID + "\n" + "SupplierName:" + SupplierName +"\n" + "PrimeryContactNo:" + PrimeryContactNo + "\n" + "Active:" + Active;

	
	}
	

}
