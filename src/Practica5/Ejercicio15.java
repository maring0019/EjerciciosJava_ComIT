package Practica5;
/*
 * 
15)	Realice un programa que lea un arreglo de N elementos enteros 
y lo rebata, tal que el primer elemento quede en último lugar, 
el segundo en el penúltimo y así sucesivamente.

 */
public class Ejercicio15 {

	public static void main(String[] args) {
		int N=5;
		int[] arrayN = {1,2,3,4,5};
		//Ultimo indice del array. Lo recorre de atras para adelante
		int j=N-1;
		//salva el dato antes que se pierda al hacer el cambio.
		int aux;
		/*Antes de hacer el cambio, muestro del array original.*/
		System.out.println("Array N: ");
		for (int i = 0; i < arrayN.length; i++) {
			System.out.println(arrayN[i]);
		}
		
		/*La condición de corte es cuando i==j. Porque es ahí cuando se completó el array.
		Si seguimos estaremos cambiando valores que ya estaban movidos.
		Esto es así porque desde el principio se intercambian los valores y van ocupando
		las posiciones del prinicipio y final del arreglo. Estamos trabajando en el mismo
		arreglo.*/
		
		for (int i = 0; i !=j; i++) {
			aux=arrayN[j];
			arrayN[j]=arrayN[i];
			arrayN[i]=aux;
			j--;
		
		}
		
		
		System.out.println("Array N rebatado: ");
		for (int i = 0; i < arrayN.length; i++) {
			System.out.println(arrayN[i]);
		}
	}

}
