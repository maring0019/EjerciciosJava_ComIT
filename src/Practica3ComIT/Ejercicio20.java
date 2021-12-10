package Practica3ComIT;

import java.util.Scanner;

/*
 * 20)	Se debe obtener el promedio de las notas del curso “Mecánica Ligera II”. 
Se sabe que el total de alumnos es de 12. Mostrar la información sobre: 
nombre del curso, total de calificaciones o notas y su promedio.

 */
public class Ejercicio20 {

	public static void main(String[] args) {
		
		calcularPromedio();
	}
		
	public static void calcularPromedio() {
		Scanner scanner = new Scanner(System.in);
		int nota;
		int cantidad = 12;
		String curso = "Mecánica Ligera II";
		int suma=0;
		double promedio;
		
		for (int i = 1; i <= 12; i++) {
			System.out.println("Ingrese la nota " + i + ": ");
			nota = scanner.nextInt();
			suma+=nota;
		}
		
		promedio=suma/cantidad;
		
		System.out.println("Nombre del curso:  " + curso);
		System.out.println("Total de notas:  " + suma);
		System.out.println("Promedio:  " + promedio);
		
		
		
	}

}
