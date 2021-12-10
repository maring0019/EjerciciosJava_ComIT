package Practica4;
/*
 * 
6) ¿Cuál de estas declaraciones Arrays declaración no son legales? 

Seleccione las dos respuestas correctas. 

 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//a) 
		/*int[]  i = {};
		System.out.println("Datos de fila: " + i);*/
		
		//b) no se puede
		/*int[]  i = new int[2]{1, 2};
		System.out.println("Datos de fila: " + i);*/

		//c)
		/*int[]  i = new int[] {1, 2};
		System.out.println("Datos de fila: " + i);*/
		
		//d)no se puede
		/*int[4] i = { 1, 2, 3, 4 };
		System.out.println("Datos de fila: " + i);*/
		
		//e)
		int[]  i = { 1, 2, 3, 4 };
		System.out.println("Datos de fila: " + i);
		
	}

}
