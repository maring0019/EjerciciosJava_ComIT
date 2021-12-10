package Practica3ComIT;

import java.util.Scanner;

/*
 * 12)	Desarrollar un programa que pida al usuario que ingrese un 
 * n�mero hasta que ingrese -1. Si el valor que ingresa el usuario 
 * es 10, se le mostrar� un mensaje diciendo �Ingresaste 5 + 5�, 
 * si ingresa 35, le mostrar� �Ingresaste 7 * 5�, para cualquier 
 * otro caso indicar� �Ingresaste algo�.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		ingresarNumero();

	}
	
	public static void ingresarNumero() {
		Scanner scanner = new Scanner(System.in);
		int numero;
				
		do {
			
			System.out.println("Ingrese un n�mero: ");
			numero = scanner.nextInt();
			if(numero==10) {
				 System.out.println("Ingresaste 5 + 5 ");
			}else if (numero == 35) {
				System.out.println("Ingresaste 7 * 5 ");
				/*
				 * Agrego la condici�n que sea !=-1 porque sino mostraba igual el mensaje. 
				 * Y en realidad, no lo debe mostrar. Sino finalizar.
				 */
			}else if (numero != -1)  {
				System.out.println("Ingresaste algo");
			}
				
		}while(numero!=-1);
	}
}
