package Practica3ComIT;

import java.util.Scanner;

/*
 * 
16)	Utilizando el programa anterior, realizar uno nuevo que,
 una vez ingresado el valor -1, le pregunte al usuario si
  desea ver la suma, en caso positivo se le mostrar�, 
  de lo contrario, finalizar� el programa.


 */
public class Ejercicio16 {

	public static void main(String[] args) {

		sumaYCantidadNumeros();

	}

	public static void sumaYCantidadNumeros() {
		int suma = 0;
		int cantidad = 0;
		int numero;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Ingrese un n�mero: ");
			numero = scanner.nextInt();
			//pregunto para que no lo sume al -1
			if (numero !=-1) {
				suma+=numero;
				cantidad++;
			}
			
		} while (numero !=-1);
		System.out.println("�Desea ver la suma?(ingrese 1 para verlo)");
		int respuesta = scanner.nextInt();
		if(respuesta ==1) {
			System.out.println("La suma de los numeros ingresados es: " + suma);
		}
		
		
	}
}
