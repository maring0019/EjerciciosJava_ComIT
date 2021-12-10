package Practica4;
/*
 * 9) ¿Cuál de estas declaraciones de Arrays no son legales? 

Seleccione las dos respuestas correctas.
Psss… hay uno repetido...


 */
public class Ejercicio9 {

	public static void main(String[] args) {
		

		//a.
		int[] a[] = { { 1, 2 }, { 1 }, {}, { 1, 2, 3 } };
		 System.out.println(a); 
		//b. Error, no tamaño si lo inicializo, sacando el 2 funciona
		int b[] = new int[2] {1, 2};
		 System.out.println(b); 
		//c.
		int c[][] = new int[][] { {1, 2, 3}, {4, 5, 6} };
		 System.out.println(c); 
		//d.
		int d[][] = { { 1, 2 }, new int[ 2 ] };
		 System.out.println(d); 
		//e. Error, el tamaño 4
		int e[4] = { 1, 2, 3, 4 };
		 System.out.println(e); 
	}

}
