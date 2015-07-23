package employees;

import services.*;
import java.util.ArrayList;

public class Team {

	/**
	 * All the services sold by the team
	 */
	private ArrayList<Product> teamSales = new ArrayList<>();
	
	/**
	 * The team leader
	 */
	private TeamLeader teamL;
	
	/**
	 * The list of sales agents that are part of the team
	 */
	private ArrayList<SalesAgent> agents = new ArrayList<>();
	
	/**
	 * Value of all the sales of the team
	 */
	private double teamTotalValue;
	
	/**
	 * 
	 * @param teamL the leader of the team
	 * @param agents the list of agents that are going to be part of the team
	 */
	public Team(TeamLeader teamL, ArrayList<SalesAgent> agents) {
		this(teamL);
		this.agents = agents;
	}
	
	/**
	 * Constructor for an empty team with a leader
	 * @param teamL the leader of the team
	 */
	public Team(TeamLeader teamL) {
		this.teamL = teamL;
		teamL.setTeam(this);
	}
	
	/**
	 * 
	 * @return Returns the total services sold by the team
	 */
	public ArrayList<Product> getTeamSales() {
		return teamSales;
	}
	
	/**
	 * 
	 * @return Returns all the agents that are part of the team
	 */
	public ArrayList<SalesAgent> getSalesAgents() {
		return agents;
	}
	
	/**
	 * 
	 * @return Returns the leader of the team
	 */
	public TeamLeader getTeamLeader() {
		return teamL;
	}
	
	public double getTotalValue() {
		return teamTotalValue;
	}
	
	public void addAgent(SalesAgent sa) {
		agents.add(sa);
	}
	
	/**
	 * Adds a product to the total of the team sales
	 * @param p Represents a product sold by one of the agents
	 */
	public void addSale(Product p) {
		teamSales.add(p);
		teamTotalValue += p.getPrice();
	}
}
