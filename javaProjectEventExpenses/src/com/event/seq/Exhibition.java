package com.event.seq;

/**
 * In this class, exhibition which extend the event class with 2 more variables i.e Gst and NoofStalls.
 * Gst is the static variable with value 5%.
 * This class also inherits the Event class.
 * Crate a constructor class to initialize variable and also getter setter for all the variables.
 * In that super keyword initialize the variable of event class(parent class).
 * Call the method public double total cost  is to calculate the total amount with 5% Gst.
 * ToString:- This method helps to represent object as String
 */

public class Exhibition extends Event {

	private static int gst = 5;
	private int noOfStalls;

	public Exhibition(String name, String type, Double costPerDay, int noOfDays, int noOfStalls) {
		super(name, type, costPerDay, noOfDays);
		this.noOfStalls = noOfStalls;

	}

	public Double totalcost() {
		double cost = costPerDay*noOfDays*noOfStalls ;
		double gstcost = (gst*cost)/100;
		return (cost+gstcost);

	}

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	@Override
	public String toString() {

		return super.toString() + "\n" + "noOfStalls:" + noOfStalls + "\n" + "total Amount:"
				+ String.format("%.2f", totalcost());

	}

}
