package com.event.seq;

/**
 * This class helps to calculate the total cost of the event based on the cost per day, no of days and gst.
 * Gst is static variable with value 15%.
 * Same as Exhibition class Crate a constructor class to initialize variable and also getter setter for all the variables.
 * This method is to calculate the total amount with 15% Gst.
 * Use override ToString method in all classes to display the event details in the format specified is simple input and output
 */
public class StageEvent extends Event {

	private static final int CostPerDay = 0;
	private static int gst = 15;
	int noOfSeats;

	public StageEvent(String name, String type, Double costPerDay, int noOfDays, int noOfSeats) {
		super(name, type, costPerDay, noOfDays);
		this.noOfSeats = noOfSeats;

	}

	public static int getGst() {
		return gst;
	}

	public static void setGst(int gst) {
		StageEvent.gst = gst;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double totalCost() {
		double total = costPerDay * noOfDays;
		double gstAmount = (total * gst) / 100;
		return total + gstAmount;

	}

	@Override
	public String toString() {

		return super.toString() + "\n" + "NoOfSeats:" + noOfSeats + "\n" + "total Amount:"
				+ String.format("%.2f", totalCost());

	}
}
