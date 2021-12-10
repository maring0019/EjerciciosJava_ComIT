package Practica5;

import java.util.Scanner;

/*
18)	Para quienes quieran so�ar con arreglos: Realice un algoritmo 
para desplazar los valores de los elementos de un arreglo de enteros
 una posici�n hacia derecha, afectando solamente el segmento que est�
  a la derecha de una posici�n arbitrariamente (puede ser ingresada 
  por el usuario por teclado o estar escrita en el c�digo �hardcodeada�)
   poniendo un cero en dicho lugar.
   
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} y se desplaza 
a derecha a partir de la posici�n 2 entonces debe quedar {2, 3, 0, 4, 5}

 */
public class Ejercicio18 {

	public static void main(String[] args) {
				
		int[] array = new int[] {1,2,3,4,5};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese la posici�n (el 0 es la primera posici�n): ");
		int posicion=scanner.nextInt();
		
		/*Comienzo por el pen�ltimo lugar desplazando un lugar a la derecha.
		 *La condici�n  tiene que incluir a la posici�n ingresada, por eso es i>=posicion.
		 *Porque a ese numero tamb�en lo debe correr. Despu�s debo poner en 0 a esa 
		 *posici�n. No antes.*/
		for (int i = array.length-2; i>=posicion; i--) {
			array[i+1]=array[i];
			
		}
		//Reci�n pongo en 0 a esa posici�n
		array[posicion]=0;
		
		
		System.out.println("array desplazado un lugar a la derecha a partir de la posici�n " + posicion);
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
