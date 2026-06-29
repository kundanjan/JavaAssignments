package com.mmcoe.assignment5;

import java.util.Scanner;

public class IPLMain {
	public static void main(String[] args) {
		IPLService service = new IPLService();
		IPLDataProvider.loadData(service);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter team name: ");
		String input = sc.nextLine().trim();
		sc.close();

		Team team = service.findTeamByName(input);
		if (team != null)
			service.displayTeam(team);
		else
			System.out.println("Team not found!");
	}
}
