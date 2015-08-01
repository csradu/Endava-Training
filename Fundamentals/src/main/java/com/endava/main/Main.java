package com.endava.main;

import com.endava.employees.*;
import com.endava.services.*;

public class Main {
	public static void main(String[] args) {
		
		TeamLeader tl = new TeamLeader("Andrei", "Firipescu", 0.1, 0.05);
		Team t = new Team(tl);
		SalesAgent sa1 = new SalesAgent("Mihai", "Popescu", 0.1, t);
		SalesAgent sa2 = new SalesAgent("Pintea", "Dovlecanescu", 0.14, t);

		sa1.addSale(new Product(22.4));
		sa2.addSale(new Subscription(30, 12));
		tl.addSale(new Product(39.14));
		
		System.out.println(tl.getLeaderCommission());
		System.out.println(tl.getLeaderCommissionRevenue());
		System.out.println(tl.getSalesRevenue());
		
		System.out.println(sa1.getSalesRevenue());
		
		System.out.println(t.getTeamLeader());
		
		System.out.println(t.getSalesAgents());
		
		System.out.println(sa2.getCommission());
		
	}
}
