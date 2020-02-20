package com.epam.vvit;

public class Interest {
	
	private float principalAmount;
	private float annualInterestRate;
	private int time;

	public Interest(float principalAmount, float annualIntersetRate, int time) {
		// TODO Auto-generated constructor stub
		this.principalAmount = principalAmount;
		this.annualInterestRate = annualIntersetRate;
		this.time = time;
	}

	public double calculateSimpleInterest() {
		// TODO Auto-generated method stub
		double simpleInterst = (this.principalAmount * this.annualInterestRate * this.time) / 100 ;
		return simpleInterst;
	}

	public double calculateCompoundInterest() {
		// TODO Auto-generated method stub
		double amount = this.principalAmount * (Math.pow((1+this.annualInterestRate/100),this.time));
		double compoundInterest = amount - this.principalAmount;
		return compoundInterest;
	}

}
