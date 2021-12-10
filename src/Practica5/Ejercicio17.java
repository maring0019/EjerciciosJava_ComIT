package Practica5;
/*
 *17)	Idem 10, pero desplazando una posición hacia la izquierda rellenando con 0 ceros a la derecha.
Por ejemplo: Si el arreglo contiene {2, 3, 4, 5, 6} entonces debe quedar {3, 4, 5, 6, 0}
¿Cómo cambiaría el algoritmo si quiero desplazar 2 posiciones en vez de una?

 */
public class Ejercicio17 {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5};
		/*Comienzo por el segundo lugar desplazando un lugar a la izquierda*/
		for (int i = 1; i<array.length; i++) {
			array[i-1]=array[i];
		}
		//Poner 0 en la posición inicial
		array[array.length-1]=0;
		
		System.out.println("array desplazado un lugar a la izquierda ");
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
