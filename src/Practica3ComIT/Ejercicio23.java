package Practica3ComIT;

import java.util.Scanner;

/*
 * 23)	Para cada empleado de una empresa se leen tres datos que 
 * representan el nombre, el sueldo b�sico y la antig�edad. 
 * Se debe emitir por pantalla para cada empleado su sueldo a cobrar.
 *  Este se calcula adicionando al b�sico el 50% si la antig�edad 
 *  supera los 10 a�os. El lote termina cuando se ingresa un nombre
 *   de empleado equivalente a �NN�
 */
public class Ejercicio23 {

	public static void main(String[] args) {
		calcularSueldo();

	}

	public static void calcularSueldo() {

		Scanner scanner = new Scanner(System.in);

		int sueldoBasico;
		
		
		int antiguedad;
		
		double sueldoACobrar;
		
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = scanner.next();

		
		
		while (!(nombre.equals("NN")) && !(nombre.equals("nn"))) {
			
			System.out.println("Ingrese el sueldo b�sico: ");
			sueldoBasico = scanner.nextInt();
			
			System.out.println("Ingrese la antiguedad: ");
			antiguedad = scanner.nextInt();
			
			if (antiguedad>10) {
				sueldoACobrar = sueldoBasico + 0.5*sueldoBasico;
			}else {
				sueldoACobrar = sueldoBasico;
			}
			
			System.out.println("El sueldo a cobrar es: " + sueldoACobrar);
			
			System.out.println("Ingrese el nombre del empleado: ");
			nombre = scanner.next();
			
		}
		System.out.println("Programa finalizado");
		
	}

}
