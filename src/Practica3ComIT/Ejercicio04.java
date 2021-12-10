package Practica3ComIT;

import java.util.Scanner;

/*
 * 4)	Nos informan tres valores ambientales de temperatura,
 *  y nos piden calcular e informar la suma y el promedio de 
 *  dichos valores.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcularSumaYPromedio();
	}
	
	public static void calcularSumaYPromedio() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la primera temperatura: ");
		double temperatura1 = scanner.nextDouble();
		System.out.println("Ingrese la segunda temperatura: ");
		double temperatura2 = scanner.nextDouble();
		System.out.println("Ingrese la tercera temperatura: ");
		double temperatura3 = scanner.nextDouble();
		
		double sumaTemperatura = temperatura1 + temperatura2 + temperatura3;
		double promedioTemperatura = sumaTemperatura/3;
		
		System.out.println("La suma de las temperaturas es: " + sumaTemperatura);
		System.out.println("El promedio de las temperaturas es: " + promedioTemperatura);
		
		
	}
}
