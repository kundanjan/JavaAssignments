package com.mmcoe.assignment5;

public class Player {
	private String name;
	private int jerseyNumber;
	private String role;
	private String nationality;
	private double biddingAmount;

	public Player(String name, int jerseyNumber, String role, String nationality, double biddingAmount) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.nationality = nationality;
		this.biddingAmount = biddingAmount;
	}

	public String getName() {
		return name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public String getNationality() {
		return nationality;
	}

	public double getBiddingAmount() {
		return biddingAmount;
	}

	@Override
	public String toString() {
		return "#" + jerseyNumber + " " + name + " (" + role + ", " + nationality + ") - ₹" + biddingAmount + " Cr";
	}
}
