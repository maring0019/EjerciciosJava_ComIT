package Practica5;
/*
 * 11)	Se deben pedir por pantalla 10 números y se irán guardando en un array,
 *  el resultado de la división de cada par de números ingresados.
 *   (Ejemplo: se ingresa 20 y luego 5, se almacena en la primera
 *    posición el número 4). Calcular el cuadrado de cada uno de 
 *    los números del array, guardando los resultados en otro array. 
 *    Utilizar las técnicas de debugging en las porciones de código
 *     que crea conveniente para analizar la ejecución.
 *     
 *     NOTA: Usar debugging -> FALTA
 */
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int number1, number2;
		int division;
		int[] cocientes = new int[10];
		for (int i = 0; i < cocientes.length; i++) {
			System.out.println("Input value 1: ");
			number1=scanner.nextInt();
			System.out.println("Input value 2: ");
			number2=scanner.nextInt();
			division=number1/number2;
			cocientes[i]=division;
			System.out.println("Division: " + cocientes[i]);
			
		}
		
		
	}

}
