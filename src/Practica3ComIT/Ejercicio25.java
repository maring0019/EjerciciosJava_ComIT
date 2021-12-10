package Practica3ComIT;

import java.util.Scanner;

/*
 * 25)	Para pacientes y amantes de los ciclos:
 *  Se dispone de un lote de valores enteros positivos 
 *  que finaliza con un valor -1. El conjunto está 
 *  dividido en sublotes por medio de valores cero. Se pide:
Desarrollar un programa que determine e imprima:
a.	Por cada sublote el promedio de valores
b.	El total de sublotes procesador
c.	Valor máximo del conjunto, indicando el sublote
 en que se encontró y la posición relativa del mismo en el sublote.
Nota: El lote puede estar vacío (primer valor -1), o 
puede haber uno o varios o todos los sublotes vacíos (ceros consecutivos). 
Nota 2: Un buen momento pasar un “do-while”.

 */
public class Ejercicio25 {

	public static void main(String[] args) {
		lotes();
	}

	static void lotes() {
		Scanner scanner = new Scanner(System.in);
		int cantidadSublotes = 0, cantidad = 0, suma = 0;
		System.out.println("Ingrese el número: ");
		int numero = scanner.nextInt();
		double promedio;
		int maximo = numero;
		int posicion = 1;
		int sublote = 1;
		do {
			if (numero == -1) {
				System.out.println("Lote vacio ");
				break;

			} else {
				if (numero == 0) {
					cantidadSublotes++;
					if (cantidad == 0) {
						System.out.println("Sublote vacio");
					} else {
						promedio = suma / cantidad;
						System.out.println("Promedio del sublote: " + promedio);
					}

					suma = 0;
					cantidad = 0;

				} else {
					suma += numero;
					cantidad++;
					if (numero > maximo) {
						maximo = numero;
						posicion = cantidad;
						sublote = cantidadSublotes;

					}

				}
				// corregir el sublote posicion falta, sumar 1 cuando ingresa -1

			}

			System.out.println("Ingrese el número: ");
			numero = scanner.nextInt();
			if (numero == -1) {
				System.out.println("Lote vacio ");
				break;

			}

		} while (numero != -1);

		if (cantidadSublotes != 0) {
			System.out.println("Cantidad de sublotes: " + cantidadSublotes);
			System.out.println("El valor maximo del lote es: " + maximo);
			System.out.println("Y se encuentra en el sublote:  " + sublote);
			System.out.println("Y en la posicion relativa:  " + posicion);

		}

	}

}
