package com.rmsc.operation;
//8.OrderDetails class
public class OrderDetails extends PurchaseOrder{
		
	protected String ItemCode;
	protected int Quantity;
	protected Double Amount;


	
	public OrderDetails(String ItemCode, int Quantity, Double Amount,String ParchaseorderNo, int TotalQuantity, String SupplierID, String DeliveryDate)
	{
		super(ParchaseorderNo,TotalQuantity, SupplierID, DeliveryDate);
		
		this.ItemCode = ItemCode;
		this.Quantity = Quantity;
		this.Amount = Amount;
		
	}
	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String ItemCode) {
		this.ItemCode = ItemCode;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double Amount) {
		this.Amount = Amount;
	}
	
	
	@Override
	public String toString() {

		return super.toString() + "\n" + "ItemCode:" + ItemCode + "\n" + "Quantity:" + Quantity +"\n" + "Amount:" + Amount;
		
	}


}
