package com.epam.vvit;

public class HouseConstruction {

	public double calculateConstructionCost(String materialStandard, double totalArea, String fullyAutomated) {
		// TODO Auto-generated method stub

		int costPerSquareFeet = 0;
		if(materialStandard.equalsIgnoreCase("normal"))
			costPerSquareFeet = 1200;
		else if(materialStandard.equalsIgnoreCase("above"))
			costPerSquareFeet = 1500;
		else if(materialStandard.equalsIgnoreCase("high") && fullyAutomated.equalsIgnoreCase("no"))
			costPerSquareFeet = 1800;
		else if(materialStandard.equalsIgnoreCase("high") && fullyAutomated.equalsIgnoreCase("yes"))
			costPerSquareFeet = 2500;
		
		return costPerSquareFeet * totalArea;
	}

}
