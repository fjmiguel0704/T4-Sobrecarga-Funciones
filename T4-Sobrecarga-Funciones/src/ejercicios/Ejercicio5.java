package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int numero;
		
		Scanner read = new Scanner (System.in);
		System.out.println("¿Cuántos números desea generar entre 0 y 1?: ");
		numero=read.nextInt();
		
		for(int i = 1; i<=numero; i++) {
			System.out.println(numerosAleatorios());
		}
	}
	
	static double numerosAleatorios () {
		return Math.random();
	}
}
