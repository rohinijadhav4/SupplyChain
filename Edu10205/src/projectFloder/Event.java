package projectFloder;

/**
 * In this class,  users create Events. 
 * We have exposed Event constructor to initialize the event object.
 * We have created variables name, type, cost per day and no of days to be captured.
 * This program is for calculating total amount for the event.
 * In this class used protected access modifier.
 * Protected attributes/variables ensure the visibility only by the event class and class inheriting the event class
 * To initialize variables Parameterized constructor have been used.
 */

public class Event {

	protected String name;
	protected String type;
	protected Double costPerDay;
	protected int noOfDays;

	public Event(String name, String type, Double costPerDay, int noOfDays) {
		super();
		this.name = name;
		this.type = type;
		this.costPerDay = costPerDay;
		this.noOfDays = noOfDays;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "Event Details\n" + "Name:" + name + "\n" + type;
	}

}
