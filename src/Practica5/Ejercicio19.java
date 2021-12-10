package Practica5;

import java.util.Scanner;

/*
20)	Realice un algoritmo para desplazar los valores de los elementos de un 
arreglo de enteros una posici�n hacia la derecha de forma circular, 
es decir haciendo que el primero desde la derecha (��ltimo�) 
quede como el primero de la izquierda (�primero�).
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} 
entonces debe quedar {6, 2, 3, 4, 5}
�C�mo cambiar�a el algoritmo si quiero desplazar 2 posiciones en vez de una?



 */
public class Ejercicio19 {

	public static void main(String[] args) {
				
		int[] array = new int[] {1,2,3,4,5};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese la posici�n (el 0 es la primera posici�n): ");
		int posicion=scanner.nextInt();
		
		/*Comienzo por la posici�n 1 desplazando un lugar a la izquierda.
		 *La condici�n  tiene que incluir a la posici�n ingresada, por eso es i<=posicion.
		 *Porque a ese numero tamb�en lo debe correr. Despu�s debo poner en 0 a esa 
		 *posici�n. No antes.*/
		for (int i = 1; i<=posicion; i++) {
			array[i-1]=array[i];
			
		}
		//Reci�n pongo en 0 a esa posici�n
		array[posicion]=0;
		
		
		System.out.println("array desplazado un lugar a la izquierda a partir de la posici�n " + posicion);
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
