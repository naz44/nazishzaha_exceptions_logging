package com.vnr.nazish.interestCalculation;

public class CompoundInterest {
	public double calculateCompoundInterest(double principalAmount,double timeInYears,double rateOfInterest)
	{
		return(principalAmount*Math.pow(1.0+rateOfInterest/100.0,timeInYears)-principalAmount);
	}
}
