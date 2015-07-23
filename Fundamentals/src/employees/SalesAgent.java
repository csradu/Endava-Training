
package employees;

import java.util.ArrayList;

import employees.exceptions.NoTeamException;
import services.*;

/**
 * Class that represents the basic sales agent
 */
public class SalesAgent {
	/**
	 * First name of the sales agent
	 */
	protected String firstName;

	/**
	 * Last name of the sales agent
	 */
	protected String lastName;

	/**
	 * Percentage of the sales that goes to the sales agent
	 */
	protected double commission;

	/**
	 * The team that the sales agent belongs to
	 */
	protected Team team;

	/**
	 * Represents the total value of the services sold by the sales agent
	 */
	protected double totalValue;

	/**
	 * The list of products sold by the sales agent
	 */
	protected ArrayList<Product> soldProducts = new ArrayList<>();

	/**
	 * Constructor for the name and commission of the sales agent
	 * 
	 * @param firstName
	 * @param lastName
	 * @param commission
	 */
	public SalesAgent(String firstName, String lastName, double commission) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.commission = commission;
	}

	/**
	 * Constructor for the name, commission and team of the sales agent
	 * 
	 * @param firstName
	 * @param lastName
	 * @param commission
	 * @param team
	 */
	public SalesAgent(String firstName, String lastName, double commission, Team team) {
		this(firstName, lastName, commission);
		setTeam(team);
	}

	/**
	 * 
	 * @return The complete name of the sales agent
	 */
	public String getName() {
		return firstName + " " + lastName;
	}

	/**
	 * 
	 * @return Returns the percentage of sales received by the sales agent
	 */
	public double getCommission() {
		return commission;
	}

	/**
	 * 
	 * @return Returns the team the sales agent belongs to
	 */
	public Team getTeam() throws NoTeamException {
		if (team == null) {
			throw new NoTeamException("The sales agent is not part of a team yet");
		}
		return team;
	}

	/**
	 * 
	 * @return Returns the total value of the products sold by the agent
	 */
	public double getTotalValue() {
		return totalValue;
	}

	public double getSalesRevenue() {
		return totalValue * commission;
	}

	/**
	 * 
	 * @return Returns the list of products sold by the sales agent
	 */
	public ArrayList<Product> getSoldProducts() {
		return soldProducts;
	}

	/**
	 * Assigns a new team to the sale agent
	 * 
	 * @param t
	 *            The team the sales agent is assigned to
	 */
	public void setTeam(Team t) {
		this.team = t;
		t.addAgent(this);
	}

	/**
	 * Adds a sale for the agent
	 * 
	 * @param p
	 *            product sold
	 */
	public void addSale(Product p) {
		soldProducts.add(p);
		team.addSale(p);
		totalValue += p.getPrice();
	}

	public String toString() {
		return firstName + " " + lastName;l
	}

}
