package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();

        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double sum =sum(a,b);
        double sub =subtraction(a,b);
        double multip = multiplication(a,b);
        double div = division(a,b);

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Multip: " + multip);
        System.out.println("Div: " + div);

        scan.close();
    }

    public static double sum (double a, double b) {
        return a+b;
    }
    public static double subtraction (double a, double b) {
        return a-b;
    }
    public static double multiplication (double a, double b) {
        return a*b;
    }
    public static double division (double a, double b) {
        return a/b;
    }



}
