package com.Conditions.loops.Intermediate;

import java.util.Scanner;

public class Discount_Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
	}
	void Discount(int list_Price,int selling_Price) {
		double discount = list_Price - selling_Price;
	}
	void Discount_Percent(double discount,int list_Price) {
		double discount_percent = discount/list_Price * 100;
	}
	void List_Price(double Sell_Price,double Discount_Percent) {
		double List_Price = (Sell_Price * 100)/ (100 - Discount_Percent);
	}
	void Selling_Price(double list_Price, double Discount_Percent) {
		double Sell_Price = List_Price((100 - Discount_Percent)/100);
	}
	private double List_Price(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
}
