package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el primer número: ");
		num1=read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=read.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3=read.nextInt();
		
		System.out.println(media(num1, num2)); 
		System.out.println(media(num1, num2, num3)); 
	}
	
	static double media(int num1, int num2) {
		double resultado;
		resultado=(num1+num2)/2;
		return resultado;
	}
	
	static double media (int num1, int num2, int num3) {
		return (num1+num2+num3)/3;
	}

}
