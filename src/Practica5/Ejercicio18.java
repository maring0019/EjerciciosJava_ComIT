package Practica5;

import java.util.Scanner;

/*
18)	Para quienes quieran soñar con arreglos: Realice un algoritmo 
para desplazar los valores de los elementos de un arreglo de enteros
 una posición hacia derecha, afectando solamente el segmento que esté
  a la derecha de una posición arbitrariamente (puede ser ingresada 
  por el usuario por teclado o estar escrita en el código “hardcodeada”)
   poniendo un cero en dicho lugar.
   
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} y se desplaza 
a derecha a partir de la posición 2 entonces debe quedar {2, 3, 0, 4, 5}

 */
public class Ejercicio18 {

	public static void main(String[] args) {
				
		int[] array = new int[] {1,2,3,4,5};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese la posición (el 0 es la primera posición): ");
		int posicion=scanner.nextInt();
		
		/*Comienzo por el penúltimo lugar desplazando un lugar a la derecha.
		 *La condición  tiene que incluir a la posición ingresada, por eso es i>=posicion.
		 *Porque a ese numero tambíen lo debe correr. Después debo poner en 0 a esa 
		 *posición. No antes.*/
		for (int i = array.length-2; i>=posicion; i--) {
			array[i+1]=array[i];
			
		}
		//Recién pongo en 0 a esa posición
		array[posicion]=0;
		
		
		System.out.println("array desplazado un lugar a la derecha a partir de la posición " + posicion);
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
