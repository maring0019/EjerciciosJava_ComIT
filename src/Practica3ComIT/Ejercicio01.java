package Practica3ComIT;

import java.util.Scanner;
/*
 * 1)	Escriba una aplicaci�n que pida al usuario que escriba dos n�meros,
 *  que obtenga los n�meros del usuario y muestre el n�mero m�s grande,
 *   seguido de las palabras �el n�mero es m�s grande�. 
 *   Si los n�meros son iguales, imprima el mensaje �Estos n�meros son iguales�.
 *   
*/

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mayor();

	}

	public static void mayor() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer n�mero: ");
		int numero1 = scanner.nextInt();

		System.out.println("Ingrese el segundo n�mero: ");
		int numero2 = scanner.nextInt();

		if (numero1 > numero2) {
			System.out.println(numero1 + " el n�mero m�s grande");
		} else if (numero2 > numero1) {
			System.out.println(numero2 + " el n�mero m�s grande");
		} else {
			System.out.println("Estos n�meros son iguales");
		}
	}

}
