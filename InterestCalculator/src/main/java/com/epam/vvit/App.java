package com.epam.vvit;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class App {
	public static void main(String argsp[]) throws IOException {
		
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		Scanner scan = new Scanner(System.in);
		
		float principalAmount;
		float annualIntersetRate;
		int time;
		int choice;
		Interest interest;
		
		try {
			streamWriter.write("Simple Interest and Compound Interest!\n");
			streamWriter.flush();
			
			streamWriter.write("\nEnter Principal amount (in Rs) : ");
			streamWriter.flush();
			principalAmount = scan.nextFloat();
			
			streamWriter.write("\nEnter Rate of Interest (in Percentage) : ");
			streamWriter.flush();
			annualIntersetRate = scan.nextFloat();
			
			streamWriter.write("\nEnter Time period (in Years) : ");
			streamWriter.flush();
			time = scan.nextInt();
			
			interest = new Interest(principalAmount,annualIntersetRate,time);
			
			streamWriter.write("\n1.Simple Interest\n2.Compound Interest\nEnter Your choice : ");
			streamWriter.flush();
			
			choice = scan.nextInt();
		}
		catch(Exception e) {
			streamWriter.write("\nMismatch in input");
			streamWriter.close();
			return ;
		}
		
		if(choice == 1) {
			double simpleInterest = interest.calculateSimpleInterest();
			streamWriter.write("\nSimple Interest is : " + String.valueOf(simpleInterest)+"/-");
			streamWriter.write("\nTotal amount to be paid is : " + String.valueOf(principalAmount+simpleInterest) + "/-");
		}
		else if (choice == 2) {
			double compoundInterest = interest.calculateCompoundInterest();
			streamWriter.write("\nCompound Interest is : " + String.valueOf(compoundInterest)+"/-");
			streamWriter.write("\nTotal amount to be paid is : " + String.valueOf(principalAmount+compoundInterest) + "/-");
			
		}
		else {
			streamWriter.write("\nInvalid Choice!");
		}
		streamWriter.flush();
	}

}