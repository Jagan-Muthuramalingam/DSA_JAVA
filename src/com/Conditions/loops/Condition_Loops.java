package com.Conditions.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

//Area of the Shapes

public class Condition_Loops {

	private static final DecimalFormat decfor = new DecimalFormat("0.00");
	
	private static final double pi = 3.14;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Circle\n2.Triangle\n3.REctangle\n4.Equilateral Triangle\n5.Rhombus\n6.CSA of Cylinder");
		System.out.println("Choose the Shape to check its area: ");
		int shape = sc.nextInt(); 
		
		switch(shape)
		{
		case (1):
			System.out.println("Enter the radius to calculate are of circle: ");
			double radius = sc.nextDouble();
			area_of_cicle(radius);
			break;
		
		case (2):
			System.out.println("Enter the height of triangle: ");
			double height = sc.nextDouble();
			System.out.println("Enter the base of triangle: ");
			double base = sc.nextDouble();
			area_of_triangle(height, base);
			break;
		case (3):
			System.out.println("Enter the length of rectangle: ");
			double length = sc.nextDouble();
			System.out.println("Enter the breadth of rectangle: ");
			double breadth = sc.nextDouble();
			area_of_rectangle(length, breadth);
			break;
			
		case (4):
			System.out.println("Enter the side of the equilateral triangle : ");
			double side = sc.nextDouble();
			area_of_equialateral_triangle(side);
			break;
			
		case (5):
			System.out.println("Enter the length of rectangle: ");
			double diagonal1 = sc.nextDouble();
			System.out.println("Enter the breadth of rectangle: ");
			double diagonal2 = sc.nextDouble();
			area_of_Rhombus(diagonal1,diagonal1);
			break;
		
		case (6):
			System.out.println("Enter the radius of the Cylinder: ");
			double radius1 = sc.nextDouble();
			System.out.println("Enter the height of the cylinder: ");
			double height1 = sc.nextDouble();
			CSV_of_Cylinder(radius1,height1);
			
			default:
			System.out.println("Invalid Shape");
		}
		sc.close();
	}

	
	
		private static void CSV_of_Cylinder(double radius1, double height1) {
			double CSV = 2 * pi * radius1 * height1;
			System.out.println("Curved Surface Area of the Cylinder: "+decfor.format(CSV));
	}



		private static void area_of_Rhombus(double diagonal1, double diagonal2) {
			double area5 = (diagonal1 * diagonal2)/2;
			System.out.println("Area of the Rhombus = " + decfor.format(area5));
	}



		private static void area_of_equialateral_triangle(double side) {
			double area2 = (Math.sqrt(3)/4) * side * side;
			System.out.println("Area of the Equilateral triangle = " + decfor.format(area2));
	}



		private static void area_of_rectangle(double length, double breadth) {
			double area1 = length * breadth;
			System.out.println("Area of the rectangle = "+decfor.format(area1));
	}


		static void area_of_cicle(double N) {
			
			
			
			double area = pi * N * N;
			System.out.println("Area of the Circle = "+decfor.format(area));
		}
		
		static void area_of_triangle(double height,double base) {
			double area = (height * base)/2;
			System.out.println("Area of the Triangle= " +decfor.format(area));
		}
		
}
