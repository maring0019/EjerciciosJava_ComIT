package Practica4;
/*
 *8) �Cu�l de las siguientes sentencias de declaraci�n de Arrays no es legal? 

Seleccione la respuesta correcta. S�, hay una sola incorrecta.


 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//a) si se puede
		//int []a[] = new int [4][4]; 
		
	
		//System.out.println(a); 
	//b
		/*int a[][] = new int [4][4];
		System.out.println(a); */
		
		

		//c Incorrecto
		 int a[][] = new int [][4];
		 System.out.println(a); 
		 
		 //d)si se puede . Por que?
		 /*int []a[] = new int [4][];
		 System.out.println(a);*/
		 
		 //e)si se puede
		 /*int [][]a = new int [4][4];
		 System.out.println(a);*/

	}

}
