package com.mmcoe.assignment5;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class IPLService {
	private Map<Team, List<Player>> iplMap;

	public IPLService() {
		iplMap = new HashMap<>();
	}

	public void addTeam(Team team, List<Player> players) {
		iplMap.put(team, new ArrayList<>(players));
	}

	public List<Player> getPlayers(Team team) {
		return iplMap.get(team);
	}

	public Team findTeamByName(String name) throws TeamNotFoundException {
		for (Team t : iplMap.keySet()) {
			if (t.getName().equalsIgnoreCase(name))
				return t;
		}
		throw new TeamNotFoundException("Team not found with name: " + name);
	}

	public void displayTeam(Team team) {
		List<Player> players = iplMap.get(team);
		if (players == null) return;
		System.out.println("Team: " + team);
		System.out.println("Players:");
		for (int i = 0; i < players.size(); i++) {
			System.out.println("  " + (i + 1) + ". " + players.get(i));
		}
	}

	public Map<Team, List<Player>> getAllData() {
		return iplMap;
	}
}
