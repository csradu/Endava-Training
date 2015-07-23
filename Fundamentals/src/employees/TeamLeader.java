package employees;

public class TeamLeader extends SalesAgent{
	
	/**
	 * Commission for the sales of the team
	 */
	private double leaderCommission;
	
	/**
	 * Constructor for all the characteristics of a team leader
	 * @param firstName 
	 * @param lastName
	 * @param commission
	 * @param leaderCommission
	 */
	public TeamLeader(String firstName, String lastName, double commission,
														double leaderCommission) {
		super(firstName, lastName, commission);
		this.leaderCommission = leaderCommission;
	}
	
	/**
	 * 
	 * @return The commission for being the leader of the team
	 */
	public double getLeaderCommission() {
		return leaderCommission;
	}
	
	/**
	 * 
	 * @return Total revenue for being the leader of a team
	 */
	public double getLeaderCommissionRevenue() {
		return team.getTotalValue() * leaderCommission;
	}
	
	public double getSalesRevenue() {
		return super.getSalesRevenue() + getLeaderCommissionRevenue();
	}
}
