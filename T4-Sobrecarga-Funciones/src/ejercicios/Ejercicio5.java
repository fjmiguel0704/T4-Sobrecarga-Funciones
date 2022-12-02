package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int  cantidad, valorMax, valorMin;
		
		Scanner read = new Scanner (System.in);
		System.out.println("¿Cuántos números desea generar entre 0 y 1?: ");
		cantidad=read.nextInt();
		System.out.println("Valor máximo a generar: ");
		valorMax=read.nextInt();
		System.out.println("Valor mínimo a generar: ");
		valorMin=read.nextInt();
		
		read.close();
		
		numerosAleatorios(cantidad);
		System.out.println("Valor máximo: ");
		numerosAleatorios(cantidad, valorMax);
		System.out.println("Entre mínimo y máximo: ");
		numerosAleatorios(cantidad, valorMax, valorMin);
		
	}
	
	static void numerosAleatorios (int cantidad) {
		for(int i = 1; i<=cantidad; i++ ) {
			System.out.println(Math.random());
		}
	}
	
	static void numerosAleatorios (int cantidad, int max) {
		double numero;
		for(int i = 1; i<=cantidad; i++ ) {
			numero=Math.random()*max;
			numero+=0.5;
			System.out.println((int)numero);
		}
	}
	
	static void numerosAleatorios (int cantidad, int max, int min) {
		double numero;
		for(int i = 1; i<=cantidad; i++ ) {
			numero=Math.random()*(max-min)+min;
			numero+=0.5;
			System.out.println((int)numero);
		}
	}
}
