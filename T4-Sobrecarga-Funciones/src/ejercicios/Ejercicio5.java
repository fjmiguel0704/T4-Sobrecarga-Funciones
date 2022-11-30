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
		
		numerosAleatorios(cantidad);
		System.out.println();
		numerosAleatorios(cantidad, valorMax);
		
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
}
