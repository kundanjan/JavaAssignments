package com.mmcoe.assignment5;

public class Player {
	private String name;
	private double biddingAmount;

	public Player(String name, double biddingAmount) {
		this.name = name;
		this.biddingAmount = biddingAmount;
	}

	public String getName() {
		return name;
	}

	public double getBiddingAmount() {
		return biddingAmount;
	}

	@Override
	public String toString() {
		return name + " - ₹" + biddingAmount + " Cr";
	}
}
