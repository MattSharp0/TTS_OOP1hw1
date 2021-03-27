package com.ttsOOP1;

import java.text.DecimalFormat;

public class Boat {
	private String boatName;
	private String boatType;
	private boolean isMonohull;
	private int boatLength;
	
	
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public String getBoatType() {
		return boatType;
	}
	public void setBoatType(String boatType) {
		this.boatType = boatType;
		if (this.boatType.equalsIgnoreCase("monohull")) {this.setisMonohull(true);}
	}
	
	public boolean getisMonohull() {
		return isMonohull;
	}
	
	private void setisMonohull(boolean isMonohull) {
		this.isMonohull = isMonohull;
	}
	
	public int getBoatLength() {
		return boatLength;
	}
	public void setBoatLength(int boatLength) {
		this.boatLength = boatLength;
		
	}
	
	
	
	
	
	public String calculateHullSpeed(boolean isMonohull) {
		DecimalFormat df = new DecimalFormat("##.##");
		if (isMonohull == true) {
			final double HS_COEFFICIENT = 1.34;
			double lengthWLsqrt = Math.sqrt(this.boatLength);
			double hullSpeed = (HS_COEFFICIENT * lengthWLsqrt);
			return (df.format(hullSpeed) + "kts");
		} else {
			return ("Fast");
			//https://www.catamaransite.com/reference/catamaran_hull_design_formulas/
		}
	}
	
	public void printBoatInfo() {
		System.out.println("Your " + this.getBoatType() + " called " 
	+ this.getBoatName() + " has a hullspeed of " + this.calculateHullSpeed(isMonohull));
	}
	
	
	
	
}
