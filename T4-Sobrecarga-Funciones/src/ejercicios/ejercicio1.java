package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		int num1, num2;
		double numero1, numero2;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduce el primer número entero: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número entero: ");
		num2=read.nextInt();
		
		System.out.println("Introduce el primer número decimal: ");
		numero1=read.nextDouble();
		System.out.println("Introduce el segundo número decimal: ");
		numero2=read.nextDouble();
		
		System.out.println(suma(num1, num2));
		System.out.println(suma(numero1, numero2));
	}
	
	
	static int suma (int numero1, int numero2) {
		int resultado;
		resultado=numero1+numero2;
		return resultado;
	}
	
	static double suma (double numero1, double numero2) {
		double resultado;
		resultado=numero1+numero2;
		return resultado;
	}
}
