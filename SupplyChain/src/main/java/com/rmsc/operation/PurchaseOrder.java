package com.rmsc.operation;
//7.PurchaseOrder class
public class PurchaseOrder {
	
	protected String PurchaseOrderNo;
	protected int TotalQuantity;
	protected int amount=10;
	protected double TotalAmount;
	protected String SupplierID;
	protected String DeliveryDate;
	
	public PurchaseOrder(String poNumber, int TotalQuantity, String SupplierID, String DeliveryDate) {
		
		this.PurchaseOrderNo = poNumber;
		this.TotalQuantity = TotalQuantity;
		//this.TotalAmount = TotalAmount;
		this.SupplierID = SupplierID;
		this.DeliveryDate  = DeliveryDate;

	}
	
	public String getPurchaseorderNo() {
		return PurchaseOrderNo;
	}

	public void setPurchaseOrderNo(String PurchaseOrderNo) {
		this.PurchaseOrderNo = PurchaseOrderNo;
	}

	public int getTotalQuantity() {
		return TotalQuantity;
	}

	public void setTotalQuantity(int TotalQuantity) {
		this.TotalQuantity = TotalQuantity;
	}

	public double getTotalAmount() {
		return this.amount*this.TotalQuantity;
	}

	public void setTotalAmount(double TotalAmount) {
		this.TotalAmount = TotalAmount;
	}

	public String getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(String SupplierID) {
		this.SupplierID = SupplierID;
	}
	

	public String getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(String DeliveryDate) {
		this.DeliveryDate = DeliveryDate;
	}
	
	@Override
	public String toString() {
		return "ParchaseOrder Details\n" + "PurchaseOrderNo:" + PurchaseOrderNo + "\n" + "TotalQuantity:" + TotalQuantity + "\n" + "TotalAmount:" + getTotalAmount() + "\n" + "SupplierID:" + SupplierID + "\n" + "DeliveryDate:" + DeliveryDate;
	}


}
