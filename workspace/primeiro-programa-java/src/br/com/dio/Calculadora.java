package br.com.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
    	Scanner sc = new Scanner (System.in);
		
		double a, b;
		
		System.out.print("Please, type the first number: ");
		a = sc.nextDouble();
		sc.nextLine(); //this method from scanner is to consume the next line
		
		
		System.out.print("Please, type a second number: ");
		b = sc.nextDouble();
		System.out.println();
		
		double sum = sum(a,b);
		double subtraction = subtraction(a,b);
		double multiplication = multiplication(a,b);
		double division = division(a,b);
		
		System.out.println("Results:");
		System.out.println("sum: " + sum);
		System.out.println("subtraction: " + subtraction);
		System.out.println("multiplication: " + multiplication);
		System.out.println("division: " + division);
	
		sc.close();
		

	}

	public static double sum (double a, double b) {
		return a + b;
	}
	
	public static double subtraction (double a, double b){
		return a - b;
	}
	
	public static double multiplication (double a, double b){
		return a * b;
	}
	
	public static double division (double a, double b){
		return a / b;
	}


}
