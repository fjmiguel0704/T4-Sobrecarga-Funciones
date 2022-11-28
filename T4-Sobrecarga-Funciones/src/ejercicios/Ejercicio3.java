package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero, numero2;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduce el primer número: ");
		numero =read.nextInt();
		System.out.println("Introduce el segundo número: ");
		numero2 =read.nextInt();
		
		System.out.println(sumaEnteros (numero)); 
		System.out.println(sumaEnteros (numero, numero2));
	}
	
	static int sumaEnteros (int num) {
		int resultado = 0;
		for(int i = 1; i<=num; i++) {
			resultado+=i;
		}
		
		return resultado;
	}
	
	static int sumaEnteros (int num, int num2) {
		int resultado = 0;
		for(int i = num; i<=num2; i++) {
			resultado+=i;
		}
		
		return resultado;
		
	}
	
}
