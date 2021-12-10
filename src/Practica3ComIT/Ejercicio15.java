package Practica3ComIT;

import java.util.Scanner;

/*
 * 15)	Desarrollar un programa que le pida al usuario que ingrese números enteros,
 *  y los vaya sumando hasta que se ingrese el número -1 (este último no debe ser sumado).
 *   Por último, debe ser mostrada por pantalla la suma obtenida y la cantidad de números ingresados.
 */
public class Ejercicio15 {

	public static void main(String[] args) {

		sumaYCantidadNumeros();

	}

	public static void sumaYCantidadNumeros() {
		int suma = 0;
		int cantidad = 0;
		int numero;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Ingrese un número: ");
			numero = scanner.nextInt();
			//pregunto para que no lo sume al -1
			if (numero !=-1) {
				suma+=numero;
				cantidad++;
			}
			
		} while (numero !=-1);
		
		System.out.println("La suma de los numeros ingresados es: " + suma);
		System.out.println("La cantidad de los numeros ingresados es: " + cantidad);
	}
}
