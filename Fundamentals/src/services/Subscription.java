package services;

public class Subscription extends Product{

	/**
	 * Time period this subscription is available for
	 */
	protected int months;
	
	/**
	 * Price per month
	 */
	protected double pricePerMonth;
	
	public Subscription(double pricePerMonth, int months) {
		super(pricePerMonth * months);
		this.pricePerMonth = pricePerMonth;
		this.months = months;
	}
	
	/**
	 * 
	 * @return The number of months this subscription is available for
	 */
	public int getMonths() {
		return months;
	}
	
	/**
	 * 
	 * @return The price per month
	 */
	public double getPricePerMonth() {
		return pricePerMonth;
	}
	
}
