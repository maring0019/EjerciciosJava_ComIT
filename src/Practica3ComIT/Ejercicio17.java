package Practica3ComIT;

import java.util.Scanner;

/*
 * 17)	Realizar un algoritmo para determinar 
 * si un número leído por teclado es primo.
 */
public class Ejercicio17 {
	public static void main(String[] args) {

		esNumeroPrimo();

	}
	
	public static void esNumeroPrimo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();
		//bandera que indica si existe otro divisor distinto de 1 y el mismo numero
		boolean otroDivisor=false;
		//excluyo del for los numeros 1 y el mismo numero. Para verificar si hay otro divisor aparte en ese rango.
		for (int i = 2; i < numero; i++) {
			
			if(numero%i ==0) {
				//existe otro divisor, entonces no es primo
				otroDivisor = true;
			}
		}
	
		if (!otroDivisor) {
			System.out.println("El numero ingresado es primo.");
		}else {
			System.out.println("El numero ingresado no es primo.");
		}
	}
}
