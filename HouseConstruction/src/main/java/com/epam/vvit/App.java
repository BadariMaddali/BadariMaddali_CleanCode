package com.epam.vvit;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String args[]) throws IOException {
		
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		Scanner scan = new Scanner(System.in);
		
		streamWriter.write("---Estimating Construction cost of House--- \n\n");
		
		String materialStandard;
		double totalArea;
		String fullyAutomated;
		
		try {
			streamWriter.write("\nEnter standard for materials (normal / above / high) : ");
			streamWriter.flush();
			materialStandard = scan.nextLine();
			
			streamWriter.write("\nEnter Total area of the house (in Square feet) : ");
			streamWriter.flush();
			totalArea = scan.nextDouble();
			scan.nextLine();
			
			streamWriter.write("\nEnter whether house is \"Fully\" Automated or not (yes/no) : ");
			streamWriter.flush();
			fullyAutomated = scan.nextLine();
		}
		catch(InputMismatchException e) {
			streamWriter.write("\nMismatch in Input!!\n");
			streamWriter.close();
			return;
		}
		
		HouseConstruction houseConstruction = new HouseConstruction();
		double costOfConstruction = houseConstruction.calculateConstructionCost(materialStandard,totalArea,fullyAutomated);
		
		if (costOfConstruction != 0)
			streamWriter.write("\n\nConstruction cost of the house : " + String.valueOf(costOfConstruction)+"/-");
		else
			streamWriter.write("\nInvalid Choice of inputs!");
		
		streamWriter.flush();
		streamWriter.close();
	}
}
