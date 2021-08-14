package br.com.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a, b;
		
		System.out.println("Please, type the first number: ");
		a = sc.nextDouble();
		
		System.out.println("Please, type a second number: ");
		b = sc.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtracão: " + subtracao);
		System.out.println("multiplicação: " + multiplicacao);
		System.out.println("divisão: " + divisao);

	}

	public static double soma (double a, double b) {
		return a + b;
	}
	
	public static double subtracao (double a, double b){
		return a - b;
	}
	
	public static double multiplicacao (double a, double b){
		return a * b;
	}
	
	public static double divisao (double a, double b){
		return a / b;
	}


}
