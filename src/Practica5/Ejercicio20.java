package Practica5;

import java.util.Scanner;

/*
20)	Realice un algoritmo para desplazar los valores de los elementos 
de un arreglo de enteros una posición hacia la derecha de forma circular,
 es decir haciendo que el primero desde la derecha (“último”) 
 quede como el primero de la izquierda (“primero”).
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} entonces debe quedar {6, 2, 3, 4, 5}
¿Cómo cambiaría el algoritmo si quiero desplazar 2 posiciones en vez de una?

 */

public class Ejercicio20 {

	public static void main(String[] args) {
				
		int[] array = new int[] {0,1,2,3,4};
	
		
		/*Comienzo por la ultima posicion, desplazando un lugar a la derecha.*/
		
		//Para una posicion
	
		int aux;
		//guardo el ultimo elemento
		aux=array[(array.length-1)];
		
	//mayor que 0 porque en la primera posicion va el ultimo elemento 
		for (int i = array.length-1; i>0; i--) {
			
				//posicion=(i- (array.length-1))*(-1); No fue necesario
		
			array[i]=array[i-1];
			
			
		}
		array[0]=aux;
		System.out.println("array desplazado un lugar a la derecha en circular");
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		/*Para dos posiciones. Debo guardar dos auxiliares.*/
		/*
		int posicion;
		int aux1=array[(array.length-1)];
		int aux2=array[(array.length-2)];
	
		for (int i = array.length-2; i>1; i--) {
			
			array[i]=array[i-2];
			array[i+1]=array[i-1];
			
		}
		array[1]=aux1;
		array[0]=aux2;
		System.out.println("array desplazado un lugar a la derecha en circular para dos posiciones");
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		*/
		
		
	}

}
