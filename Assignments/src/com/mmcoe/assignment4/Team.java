package com.mmcoe.assignment4;

public class Team {
	private String name;
	private Player[] players;
	private int count;

	public Team(String name, int maxPlayers) {
		this.name = name;
		this.players = new Player[maxPlayers];
		this.count = 0;
	}

	public void addPlayer(Player p) {
		if (count < players.length) {
			players[count++] = p;
		}
	}

	public String getName() {
		return name;
	}

	public void displayPlayers() {
		System.out.println("Team: " + name);
		System.out.println("Players:");
		for (int i = 0; i < count; i++) {
			System.out.println("  " + (i + 1) + ". " + players[i]);
		}
	}
}
