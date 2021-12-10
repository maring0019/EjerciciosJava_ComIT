package Practica3ComIT;

import java.util.Scanner;

/*
 * 5)	Se suministra una lista de tres pesos de camiones,
 *  y se pide que informemos cual es el mayor y cual es el menor.
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mayorMenor();
	}
	
	static void mayorMenor() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer peso: ");
		double peso1 = scanner.nextDouble();
		System.out.println("Ingrese el segundo peso: ");
		double peso2 = scanner.nextDouble();
		System.out.println("Ingrese el tercer peso: ");
		double peso3 = scanner.nextDouble();
		
		if (peso1 < peso2 && peso1 < peso3) {
			System.out.println("El menor peso es: " + peso1);
		} else if (peso2 < peso1 && peso2 < peso3){
			System.out.println("El menor peso es: " + peso2);
		}else if (peso3 < peso1 && peso3 < peso2){
			System.out.println("El menor peso es: " + peso3);
		}
		
		if (peso1 > peso2 && peso1 > peso3) {
			System.out.println("El mayor peso es: " + peso1);
		} else if (peso2 > peso1 && peso2 > peso3){
			System.out.println("El mayor peso es: " + peso2);
		}else if (peso3 > peso1 && peso3 > peso2){
			System.out.println("El mayor peso es: " + peso3);
		}
	}

}
