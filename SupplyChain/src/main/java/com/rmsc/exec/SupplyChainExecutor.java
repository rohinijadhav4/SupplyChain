package com.rmsc.exec;

import java.util.Scanner;

import com.rmsc.auth.Login;
import com.rmsc.auth.Registration;
import com.rmsc.operation.OrderDetails;
import com.rmsc.operation.PurchaseOrder;
import com.rmsc.operation.Supplier;
import com.rmsc.setup.Items;
import com.rmsc.setup.Location;
import com.rmsc.setup.Organization;
import com.rmsc.setup.Store;

public class SupplyChainExecutor {

	public static void main(String[] args) {
		
		Registration rd = registration();
		System.out.println("Reg details: "+rd);
		
		Login lg = login();
		System.out.println("logged in by : "+lg.getUsername());
		
		Organization oz = organization();
		System.out.println("org details: "+oz);
		
		Store st = store(oz);
		System.out.println("store details: "+st);
		
		Location loc = createLocations(oz);
		System.out.println("location details: "+loc);
		
		Items item = createItems(oz);
		System.out.println("item details: "+item);
		
		Supplier supplier = createSupplier(oz);
		System.out.println("Supplier details: "+supplier);
		
		PurchaseOrder po = purchaseOrder();
		System.out.println("purchase order details: "+po);
		
		OrderDetails od = orderDetails(po);
		System.out.println("order details: "+od);
		
				
	}

	
	static Registration registration()
	{
		//public Registration (String firstName, String lastName, String userName, String password, String emailId,String phoneNo)
		Registration rd = new Registration("Virat","Kohli","viratk","virat@123","viratkohli@gmail.com","9000911010");
		return rd;
	}
	
	static Login login()
	{	
		//public Login(String username, String password) {
		Login lg = new Login("viratk", "virat@123");
		return lg;		
	}
	
	static  Organization organization()
	{
		//public Organization(String ID, String Name, String Email, String StartDate,String EndDate) 
		Organization oz = new Organization("ORG001", "Dmart", "dmart@gmail.com", "10-January-2024","01-february-2025");
		return oz;
	}
	static Store store(Organization oz)
	{
		//	public Store(String StoreName, String Location, String Manager, String ContactNumber, String CreatedDate,boolean Status,String ID, String Name, String Email, String StartDate,String EndDate);
		
		Store st = new Store ("Dmart", "Hinjewadi", "Mr.XYZ", "9845671234", "10-January-2024",true,oz.getID(),oz.getName(),oz.getEmail(),oz.getStartDate(),oz.getEndDate());
		return st;
	}
	
	static PurchaseOrder purchaseOrder()
	{
		//	public PurchaseOrder(String poNumber, int TotalQuantity, String SupplierID, String DeliveryDate) {
		PurchaseOrder po = new PurchaseOrder(" 406-5152759-6780347", 15, "12345678901234", "01-May-2024");
		return po;
	}
	
	static OrderDetails orderDetails(PurchaseOrder po) 
	{
		//public OrderDetails(String ItemCode, int Quantity, Double Amount,String ParchaseorderNo, int TotalQuantity, String SupplierID, String DeliveryDate)
		
		OrderDetails od = new OrderDetails("UPS711114442227", 15, 150.0,"PO# Po 8861",15,"12345678901234","01-May-2024");
		po.setTotalAmount(po.getTotalQuantity()*od.getAmount());
		return od;
	}
	
	static Location createLocations(Organization oz)
	{
		//public Location(String LocationID, String LocationType, String LocationName, String FloorName, String AreaName,String StoreName, String Location, String Manager, String ContactNumber, String CreatedDate,boolean Status,String ID, String Name, String Email, String StartDate,String EndDate) 
		Location loc =new Location("F1R1001", "ROWLEVEL","Hinjewadi","Vivanta Park","Shivaji Chowk","Dmart", "Hinjewadi", "Mr.XYZ", "9845671234", "10-January-2024",true,oz.getID(),oz.getName(),oz.getEmail(),oz.getStartDate(),oz.getEndDate());
		return loc;
	}
	static Items  createItems(Organization oz)
	{
		//public Items (String ItemCode,String ItemName,String UnitOfMeasurment, String Quantity,String LocationID, String LocationType, String LocationName, String FloorName, String AreaName,String StoreName, String Location, String Manager, String ContactNumber, String CreatedDate,boolean Status,String ID, String Name, String Email, String StartDate,String EndDate)
		Items item = new Items("UPS711114442227","Almonds","KG", "500","F1R1001", "ROWLEVEL", "Hinjewadi", "Vivanta Park","Shivaji Chowk","Dmart", "Hinjewadi","Mr.XYZ", "9845671234","10-January-2024",true,oz.getID(),oz.getName(),oz.getEmail(),oz.getStartDate(),oz.getEndDate());		
		return item;
		  
	}
	
	static Supplier createSupplier(Organization oz)
	{
		//public Supplier(String SupplierID,String SupplierName,String PrimeryContactNo,boolean Active,String ID, String Name, String Email, String StartDate,String EndDate) 
		Supplier supplier = new Supplier("12345678901234","mr.ABC","9928456732",true,oz.getID(),oz.getName(),oz.getEmail(),oz.getStartDate(),oz.getEndDate());
		return supplier;
	}
	
	

}
