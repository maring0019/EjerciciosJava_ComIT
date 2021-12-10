package Practica5;
/*
 * 16)	Realice un algoritmo para desplazar los valores de los elementos
 *  de un arreglo de enteros una posición hacia la derecha. Rellenado con
 *   ceros a la izquierda.Por ejemplo: Si el arreglo contiene
 *    {2, 3, 4, 5, 6} entonces debe quedar {0, 2, 3, 4, 5}
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5};
		/*Comienzo por el penultimo lugar desplazando un lugar a la derecha.
		 *La condición  tiene que incluir al 0, por eso es i>-1.*/
		for (int i = array.length-2; i>-1; i--) {
			array[i+1]=array[i];
			
		}
		//Poner 0 en la posición inicial
		array[0]=0;
		
		System.out.println("array desplazado un lugar a la derecha ");
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
