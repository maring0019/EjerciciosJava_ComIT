package Practica3ComIT;

import java.util.Scanner;

/*
 * 22)	Sabiendo que la definici�n de factorial de un n�mero N  (que se simboliza N! ) es igual a:
	N! = 1 x 2 x 3 x 4 x � x N -2 x N -1 x N
(por ejemplo, el factorial de 5 es 5! = 1 x 2 x 3 x 4 x 5 )
Realizar un programa que haga dicho c�lculo para cualquier valor ingresado.

 */
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial();
	}

	public static void factorial() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el valor del n�mero N: ");
		int N = scanner.nextInt();
		int factorial=1;

		for(int i=1; i<=N; i++) {
			factorial*=i;
		}
		
		System.out.println("El factorial de N: " + N + "! = " + factorial);
	}
}
