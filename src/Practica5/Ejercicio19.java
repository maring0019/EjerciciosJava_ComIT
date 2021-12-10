package Practica5;

import java.util.Scanner;

/*
20)	Realice un algoritmo para desplazar los valores de los elementos de un 
arreglo de enteros una posición hacia la derecha de forma circular, 
es decir haciendo que el primero desde la derecha (“último”) 
quede como el primero de la izquierda (“primero”).
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} 
entonces debe quedar {6, 2, 3, 4, 5}
¿Cómo cambiaría el algoritmo si quiero desplazar 2 posiciones en vez de una?



 */
public class Ejercicio19 {

	public static void main(String[] args) {
				
		int[] array = new int[] {1,2,3,4,5};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese la posición (el 0 es la primera posición): ");
		int posicion=scanner.nextInt();
		
		/*Comienzo por la posición 1 desplazando un lugar a la izquierda.
		 *La condición  tiene que incluir a la posición ingresada, por eso es i<=posicion.
		 *Porque a ese numero tambíen lo debe correr. Después debo poner en 0 a esa 
		 *posición. No antes.*/
		for (int i = 1; i<=posicion; i++) {
			array[i-1]=array[i];
			
		}
		//Recién pongo en 0 a esa posición
		array[posicion]=0;
		
		
		System.out.println("array desplazado un lugar a la izquierda a partir de la posición " + posicion);
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
