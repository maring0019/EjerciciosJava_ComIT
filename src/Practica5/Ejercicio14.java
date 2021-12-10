package Practica5;
/*
 * 
14)	Realice un algoritmo para construir un arreglo a partir de otro especificando 
además un tamaño para el nuevo arreglo a construir. Si el tamaño es menor al 
tamaño del arreglo original, entonces se copiaran los elementos (de izquierda a derecha)
 que haya hasta donde se pueda (Se trunca). Si el tamaño es igual se copia tal cual es 
 (Se clona). Si el tamaño es mayor, se copian todos los elementos y luego se
  rellenan con 0 (Se expande).

 */
public class Ejercicio14 {

	public static void main(String[] args) {
		int M=8;	
		int [] arrayM = new int[M];
		int N=5;
		int[] arrayN = {1,2,3,4,5};
		
		
		/*int [] arrayN = new int[N] {1,2,3,4,5}; Por que no se puede?*/
		/*arrayN = new int[N]  {1,2,3,4,5};*/
		/*arrayN = {1,2,3,4,5};*/
		
		if (N==M){
			for (int i = 0; i < arrayN.length; i++) {
				arrayM[i]=arrayN[i];
			}
		}else if(N>M) {
			for (int i = 0; i < arrayM.length; i++) {
				arrayM[i]=arrayN[i];
			}
		}else {
			for (int i = 0; i < arrayM.length; i++) {
				
				if (i<arrayN.length) {
					arrayM[i]=arrayN[i];
				}else {
					arrayM[i]=0;
				}
			}
		}
		
		System.out.println("Elementos arreglo N: " + N);
		
		for (int i = 0; i < arrayN.length; i++) {
			System.out.println(arrayN[i]);
		}
		
		System.out.println("Elementos arreglo M: " + M);
		
		for (int i = 0; i < arrayM.length; i++) {
			System.out.println(arrayM[i]);
		}
				
		
	}

}
