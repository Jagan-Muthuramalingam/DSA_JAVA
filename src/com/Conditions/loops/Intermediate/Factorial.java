package com.Conditions.loops.Intermediate;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to get the Output: ");
		int N = sc.nextInt();
		Factorial fac = new Factorial();
		fac.fact(N);
	}
	public void fact(int N) {
		
		int fact =1;
		for(int i=1;i<=N;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
