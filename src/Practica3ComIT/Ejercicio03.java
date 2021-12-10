package Practica3ComIT;

import java.util.Scanner;

/*
 * 3)	Escriba un algoritmo para determinar si un número N es divisible
 *  por M.
 * 
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esDivisible();
	}
	
	static void esDivisible() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de N: ");
		int N = scanner.nextInt();
		
		System.out.println("Ingrese el valor de M: ");
		int M = scanner.nextInt();
		
		if ( N % M == 0) {
			System.out.println(N + " es divisible por " + N);
		}
		
	}
}
