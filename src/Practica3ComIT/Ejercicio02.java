package Practica3ComIT;
/*
 * 2)	Se suministra una lista de tres valores numéricos, y se pide que
 *  informemos si están o no ordenados de forma creciente.
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		estanOrdenadosCreciente();
	}
	
	static void estanOrdenadosCreciente() {
		int numero1 = 12, numero2 = 2, numero3 = 7;
		if (numero1 < numero2 && numero2 < numero3) {
			System.out.println("Estan ordenados en forma creciente");
		} else {
			System.out.println("No estan ordenados en forma creciente");
		}
	}

}
