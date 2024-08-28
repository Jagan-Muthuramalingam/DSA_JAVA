package com.Conditions.loops.Intermediate;

import java.util.Scanner;

public class Electricity_Bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Electrcity Amount= ");
		int unit = sc.nextInt();
		Electricity_Bill ele = new Electricity_Bill();
		ele.Electricity_Bill(unit);
	}
	
	void Electricity_Bill(int unit) {
		//Each unit counts 1.2rs till 100
		double amount =0;
		if(unit<100) {
			 amount = unit * 1.20;
		}
		else if(unit<300) {
			 amount = 100 * 1.20 + (unit - 100) * 2;
		}
		else if(unit>300) {
			 amount = 100 * 1.20 + 200 * 2 + (unit - 300) * 3;
		}
		
		System.out.println(amount);
	}

}
