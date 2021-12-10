package Practica3ComIT;

import java.util.Scanner;
/*
 * 1)	Escriba una aplicación que pida al usuario que escriba dos números,
 *  que obtenga los números del usuario y muestre el número más grande,
 *   seguido de las palabras “el número es más grande”. 
 *   Si los números son iguales, imprima el mensaje “Estos números son iguales”.
 *   
*/

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mayor();

	}

	public static void mayor() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer número: ");
		int numero1 = scanner.nextInt();

		System.out.println("Ingrese el segundo número: ");
		int numero2 = scanner.nextInt();

		if (numero1 > numero2) {
			System.out.println(numero1 + " el número más grande");
		} else if (numero2 > numero1) {
			System.out.println(numero2 + " el número más grande");
		} else {
			System.out.println("Estos números son iguales");
		}
	}

}
