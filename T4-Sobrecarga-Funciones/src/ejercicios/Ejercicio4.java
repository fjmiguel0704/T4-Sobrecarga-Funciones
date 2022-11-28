package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int numero;
		String cadena;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		numero=read.nextInt();
		System.out.println("Introduce true o false: ");
		cadena=read.next();
		
		System.out.println(parseToBoolean(numero)); 
		System.out.println(parseToBoolean(cadena));
	}
	
	static boolean parseToBoolean (int num) {
		if(num==0) {
			return false;
		}
		
		else if(num==1) {
			return true;
		}
		
		return false;
	}
	
	static boolean parseToBoolean(String cadena) {
		if(cadena.equals("true")) {
			return true;
		}
		
		return false;
	}
	
}
